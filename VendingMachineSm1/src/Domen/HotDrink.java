package Domen;

public class HotDrink extends Product {
    // Дополнительное поле: температура
    private int temperature;

    // Геттер для температуры
    public int getTemperature() {
        return temperature;
    }

    // Сеттер для температуры
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    // Конструкторы

    // Конструктор без параметров
    public HotDrink() {
        super();
        this.temperature = 0;
    }

    // Конструктор с параметрами
    public HotDrink(int price, int place, String name, long id, int temperature) {
        super(price, place, name, id);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTemperature = " + temperature;
    }
}
