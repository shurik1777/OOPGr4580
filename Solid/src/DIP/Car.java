/**
 * 5) Переписать код в соответствии с Dependency Inversion Principle:
public class Car {
private PetrolEngine engine;
public Car(PetrolEngine engine) {
this.engine = engine;
}
public void start() {
this.engine.start();
}
}
public class PetrolEngine {
public void start() {
}
}
Разорвать зависимость классов Car и PetrolEngine. У машины же может быть DieselEngine.
 */
package DIP;

/**
 * Интерфейс Engine представляет двигатель.
 */
interface Engine {
    /**
     * Запускает двигатель.
     */
    void start();
}

/**
 * Класс Car представляет автомобиль.
 */
public class Car {
    private Engine engine;

    /**
     * Создает экземпляр класса Car с указанным двигателем.
     *
     * @param engine двигатель автомобиля
     */
    public Car(Engine engine) {
        this.engine = engine;
    }

    /**
     * Запускает автомобиль.
     */
    public void start() {
        this.engine.start();
    }
}

/**
 * Класс PetrolEngine представляет бензиновый двигатель.
 */
class PetrolEngine implements Engine {
    /**
     * Запускает бензиновый двигатель.
     */
    public void start() {
        // Код для запуска бензинового двигателя
    }
}

/**
 * Класс DieselEngine представляет дизельный двигатель.
 */
class DieselEngine implements Engine {
    /**
     * Запускает дизельный двигатель.
     */
    public void start() {
        // Код для запуска дизельного двигателя
    }
}