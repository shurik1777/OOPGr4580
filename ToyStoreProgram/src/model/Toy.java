package model;

/**
 * Класс Toy представляет игрушку в игрушечном магазине.
 */
public class Toy {
    private int id;
    private String name;
    private int frequency;

    /**
     * Конструктор класса Toy.
     *
     * @param id Идентификатор игрушки.
     * @param name Название игрушки.
     * @param frequency Частота появления игрушки в розыгрыше.
     */
    public Toy(int id, String name, int frequency) {
        this.id = id;
        this.name = name;
        this.frequency = frequency;
    }

    /**
     * Метод для получения идентификатора игрушки.
     *
     * @return Идентификатор игрушки.
     */
    public int getId() {
        return id;
    }

    /**
     * Метод для получения названия игрушки.
     *
     * @return Название игрушки.
     */
    public String getName() {
        return name;
    }

    /**
     * Метод для получения частоты появления игрушки в розыгрыше.
     *
     * @return Частота появления игрушки в розыгрыше.
     */
    public int getFrequency() {
        return frequency;
    }

    /**
     * Метод для обновления частоты появления игрушки в розыгрыше.
     *
     * @param frequency Новая частота появления игрушки в розыгрыше.
     */
    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}
