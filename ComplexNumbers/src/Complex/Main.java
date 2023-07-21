package Complex;

/**
 * Главный класс приложения, содержит метод main(), запускающий приложение.
 */
public class Main {
    /**
     * Метод main() запускает приложение.
     *
     * @param args Параметры командной строки.
     */
    public static void main(String[] args) {
        // Создание фабрики калькуляторов комплексных чисел.
        IComplexCalcFactory calculableFactory = new DecLogComplexCalcFactory(new Logger());

        // Создание интерфейса взаимодействия с пользователем.
        ViewComplexCalc view = new ViewComplexCalc(calculableFactory);

        // Запуск приложения.
        view.run();
    }
}