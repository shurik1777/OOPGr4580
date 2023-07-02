package Domen;

public class HotDrinkNext extends HotDrink{
    // Дополнительное поле: температура
    private boolean milk ;

    // Геттер для температуры
    public boolean getMilk() {
        return milk;
    }

    // Сеттер для температуры
    public void setTemperature(boolean milk) {
        this.milk = milk;
    }

    // Конструкторы

    // Конструктор без параметров
    public HotDrinkNext() {
        super();
        this.milk = false;
    }

    // Конструктор с параметрами
    public HotDrinkNext(int price, int place, String name, long id, int temperature,boolean milk) {
        super(price, place, name, id, temperature);
        this.milk = milk;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMilk = " + milk;
    }
}
