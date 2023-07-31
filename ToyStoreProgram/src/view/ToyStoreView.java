package view;

import controller.ToyStoreController;
import model.Toy;

/**
 * Класс ToyStoreView представляет представление игрушечного магазина.
 * Он предназначен для обработки ввода и вывода информации для пользователя.
 */
public class ToyStoreView {
    private ToyStoreController controller;

    /**
     * Конструктор класса ToyStoreView.
     * Создает новый объект контроллера игрушечного магазина.
     */
    public ToyStoreView() {
        controller = new ToyStoreController();
    }

    /**
     * Метод для добавления новой игрушки в магазин.
     *
     * @param id        Идентификатор новой игрушки.
     * @param name      Название новой игрушки.
     * @param frequency Частота новой игрушки.
     */
    public void addNewToy(int id, String name, int frequency) {
        Toy toy = new Toy(id, name, frequency);
        controller.addToy(toy);
    }

    /**
     * Метод для обновления частоты игрушки по ее идентификатору.
     *
     * @param toyId     Идентификатор игрушки, частоту которой нужно обновить.
     * @param frequency Новая частота игрушки.
     */
    public void updateToyFrequency(int toyId, int frequency) {
        controller.updateFrequency(toyId, frequency);
    }

    /**
     * Метод для организации розыгрыша призовых игрушек.
     * Выбирает случайную призовую игрушку из списка игрушек с учетом их частоты.
     */
    public void organizeGiveaway() {
        controller.organizeGiveaway();
    }

    /**
     * Метод для получения призовой игрушки.
     *
     * @return Призовая игрушка.
     */
    public Toy getPrizeToy() {
        return controller.getPrizeToy();
    }

    /**
     * Метод для записи призовых игрушек в файл.
     *
     * @param filename Имя файла, в который нужно записать призовые игрушки.
     */
    public void writePrizeToysToFile(String filename) {
        controller.writePrizeToysToFile(filename);
    }
}
