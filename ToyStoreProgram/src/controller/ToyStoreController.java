package controller;

import model.Toy;
import model.ToyStore;

/**
 * Класс ToyStoreController предоставляет методы для управления игрушечным магазином.
 */
public class ToyStoreController {
    private ToyStore toyStore;

    /**
     * Конструктор класса ToyStoreController.
     */
    public ToyStoreController() {
        toyStore = new ToyStore();
    }

    /**
     * Метод для добавления игрушки в магазин.
     *
     * @param toy Игрушка для добавления.
     */
    public void addToy(Toy toy) {
        toyStore.addToy(toy);
    }

    /**
     * Метод для обновления частоты игрушки по ее идентификатору.
     *
     * @param toyId     Идентификатор игрушки.
     * @param frequency Новая частота игрушки.
     */
    public void updateFrequency(int toyId, int frequency) {
        toyStore.updateFrequency(toyId, frequency);
    }

    /**
     * Метод для организации розыгрыша призовых игрушек.
     */
    public void organizeGiveaway() {
        toyStore.organizeGiveaway();
    }

    /**
     * Метод для получения призовой игрушки.
     *
     * @return Призовая игрушка.
     */
    public Toy getPrizeToy() {
        return toyStore.getPrizeToy();
    }

    /**
     * Метод для записи призовых игрушек в файл.
     *
     * @param filename Имя файла для записи.
     */
    public void writePrizeToysToFile(String filename) {
        toyStore.writePrizeToysToFile(filename);
    }
}
