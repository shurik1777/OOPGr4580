package Classes;

import java.util.List;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;

public class Market implements iMarketBehaviour, iQueueBehaviour {
    private FileWriter logFile;
    private List<iActorBehaviour> queue;
    private int maxPromotionalClientCount; // Максимально допустимое количество клиентов акции
    private int promotionalClientCount; // Текущее количество клиентов акции
    /**
     * Конструктор класса Market.
     * Инициализирует список очереди, и создает файл для записи лога работы магазина.
     */
    public Market() {
        this.queue = new ArrayList<>();
        this.maxPromotionalClientCount = 3;
        this.promotionalClientCount = 0;

        // Создание файла для записи лога работы магазина
        try {
            logFile = new FileWriter("market_log.txt");
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла лога работы магазина: " + e.getMessage());
        }
    }

    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName() + " клиент пришел в магазин ");
        if (actor instanceof PromotionalClient) {
            if (promotionalClientCount >= maxPromotionalClientCount) {
                System.out.println("Отказ в обслуживании для акционного клиента " + actor.getActor().getName() + ". Превышено количество участников акции.");
                return;
            } else {
                promotionalClientCount++;
            }
        }
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }
    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
            }
        }
        releaseFromMarket(releaseActors);
    }

    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент сделал заказ ");
                try {
                    logFile.write(actor.getActor().getName() + " приобрел товар\n");
                    logFile.flush();
                } catch (IOException e) {
                    System.out.println("Ошибка при записи в файл лога работы магазина: " + e.getMessage());
                }
            }
        }
    }

    /**
     * Метод для закрытия файла лога.
     * Закрывает файл, используемый для записи лога работы магазина.
     */
    public void closeLogFile() {
        try {
            logFile.close();
        } catch (IOException e) {
            System.out.println("Ошибка при закрытии файла лога работы магазина: " + e.getMessage());
        }
    }
}