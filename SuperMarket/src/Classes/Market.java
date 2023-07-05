package Classes;

import java.util.List;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;

/**
 * Класс, представляющий реализацию интерфейсов iMarketBehaviour и iQueueBehaviour.
 * <p>
 * Представляет собой магазин с очередью клиентов.
 */
public class Market implements iMarketBehaviour, iQueueBehaviour {
    private FileWriter logFile; // Файл для записи лога работы магазина
    private List<iActorBehaviour> queue; // Очередь клиентов
    private int maxPromotionalClientCount; // Максимально допустимое количество клиентов акции
    private int promotionalClientCount; // Текущее количество клиентов акции
    private List<Actor> visitedActors; // Список посетивших магазин клиентов
    private List<Actor> successfulPurchaseActors; // Список успешно купивших товар клиентов

    /**
     * Конструктор класса Market.
     * Инициализирует список очереди, и создает файл для записи лога работы магазина.
     */
    public Market() {
        this.queue = new ArrayList<>();
        this.maxPromotionalClientCount = 3; // максимальное кол-во заказов доступных по акции
        this.promotionalClientCount = 0; // счетчик клиентов участвующих в акции
        this.visitedActors = new ArrayList<>();
        this.successfulPurchaseActors = new ArrayList<>();

        // Создание файла для записи лога работы магазина
        try {
            logFile = new FileWriter("market_log.txt");
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла лога работы магазина: " + e.getMessage());
        }
    }

    /**
     * Метод для добавления клиента в магазин.
     *
     * @param actor Клиент, реализующий интерфейс iActorBehaviour.
     */
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        if (actor instanceof PromotionalClient) {
            if (promotionalClientCount >= maxPromotionalClientCount) {
                System.out.println("Отказ в обслуживании для акционного клиента " + actor.getActor().getName() + ". Превышено количество участников акции.");
                try {
                    logFile.write(actor.getActor().getName() + " покинул магазин из-за превышения количества участников акции\n");
                    logFile.flush();
                } catch (IOException e) {
                    System.out.println("Ошибка при записи в файл лога работы магазина: " + e.getMessage());
                }
                return;
            } else {
                promotionalClientCount++;
            }
        }
        takeInQueue(actor);
    }

    /**
     * Метод для добавления клиента в очередь.
     *
     * @param actor Клиент, реализующий интерфейс iActorBehaviour.
     */
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
    }

    /**
     * Метод для освобождения клиентов из магазина.
     *
     * @param actors Список клиентов, которых необходимо освободить.
     */
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
            successfulPurchaseActors.add(actor);
            try {
                logFile.write(actor.getName() + " успешно приобрел товар\n");
                logFile.flush();
            } catch (IOException e) {
                System.out.println("Ошибка при записи в файл лога работы магазина: " + e.getMessage());
            }
        }
    }

    /**
     * Метод для обновления состояния магазина.
     * Вызывает методы takeOrder(), giveOrder() и releaseFromQueue().
     */
    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    /**
     * Метод для выдачи заказа клиенту.
     */
    @Override
    public void giveOrder() {
        List<iActorBehaviour> actorsToRemove = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди");
                actorsToRemove.add(actor);
            }
        }
        queue.removeAll(actorsToRemove);
    }

    /**
     * Метод для освобождения клиентов из очереди.
     */
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

    /**
     * Метод для принятия заказа от клиента.
     */
    @Override
    public void takeOrder() {
        List<iActorBehaviour> actorsToRemove = new ArrayList<>();
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
                actorsToRemove.add(actor);
            }
        }
        queue.removeAll(actorsToRemove);
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
