package model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Класс ToyStore представляет игрушечный магазин.
 */
public class ToyStore {
    private List<Toy> toys;
    private List<Toy> prizeToys;

    /**
     * Конструктор класса ToyStore.
     * Инициализирует пустые списки игрушек и призовых игрушек.
     */
    public ToyStore() {
        toys = new ArrayList<>();
        prizeToys = new ArrayList<>();
    }

    /**
     * Метод для добавления игрушки в магазин.
     *
     * @param toy Игрушка, которую нужно добавить.
     */
    public void addToy(Toy toy) {
        toys.add(toy);
    }

    /**
     * Метод для обновления частоты игрушки по ее идентификатору.
     *
     * @param toyId     Идентификатор игрушки.
     * @param frequency Новая частота игрушки.
     */
    public void updateFrequency(int toyId, int frequency) {
        for (Toy toy : toys) {
            if (toy.getId() == toyId) {
                toy.setFrequency(frequency);
                break;
            }
        }
    }

    /**
     * Метод для организации розыгрыша призовых игрушек.
     * Выбирает случайную призовую игрушку из списка игрушек с учетом их частоты.
     */
    public void organizeGiveaway() {
        Random random = new Random();
        int[] cumulativeFrequencies = new int[toys.size()];
        int sum = 0;
        // вычисление кумулятивных сумм частот для каждой игрушки
        for (int i = 0; i < toys.size(); i++) {
            sum += toys.get(i).getFrequency();
            cumulativeFrequencies[i] = sum;
        }

        int totalFrequency = sum;
        // выбор призовых игрушек на основе их частоты
        while (!toys.isEmpty()) {
            int randomNumber = random.nextInt(totalFrequency);
            int index = 0;
            while (index < cumulativeFrequencies.length && cumulativeFrequencies[index] <= randomNumber) {
                index++;
            }
            Toy prizeToy = toys.get(index);
            toys.remove(index);
            sum -= prizeToy.getFrequency();
            totalFrequency = sum;
            prizeToys.add(prizeToy);
        }
    }


    /**
     * Метод для получения призовой игрушки.
     *
     * @return Призовая игрушка или null, если призы закончились.
     */
    public Toy getPrizeToy() {
        Toy prizeToy = null;
        try {
            prizeToy = prizeToys.get(0);
            prizeToys.remove(0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ошибка: список призовых игрушек пуст.");
        }
        return prizeToy;
    }

    /**
     * Метод для записи призовых игрушек в файл.
     *
     * @param filename Имя файла, в который нужно записать призовые игрушки.
     * @throws IOException если при записи произошла ошибка
     */
    public void writePrizeToysToFile(String filename) {
        try {
            FileWriter writer = new FileWriter(filename);
            for (Toy toy : prizeToys) {
                writer.write(toy.getId() + "," + toy.getName() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка при записи призовых игрушек в файл: " + e.getMessage());
        }
    }
}
