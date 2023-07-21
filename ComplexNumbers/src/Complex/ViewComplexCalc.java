package Complex;

import java.util.Scanner;

/**
 * Класс предоставляет интерфейс взаимодействия с пользователем через консоль.
 */
public class ViewComplexCalc {
    private IComplexCalcFactory calculableFactory; ///< Объект типа IComplexCalcFactory.

    /**
     * Конструктор класса.
     *
     * @param calculableFactory Объект типа IComplexCalcFactory.
     */
    public ViewComplexCalc(IComplexCalcFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    /**
     * Запускает логику взаимодействия с пользователем через консоль.
     */
    public void run() {
        while (true) {
            // Чтение вещественной и мнимой частей первого аргумента.
            double firstArgRe = promptRead("Введите вещественную часть первого аргумента: ");
            double firstArgIm = promptRead("Введите мнимую часть первого аргумента: ");

            // Создание калькулятора.
            iComplexCalc calculator = calculableFactory.create(firstArgRe, firstArgIm);

            while (true) {
                // Чтение команды от пользователя.
                String cmd = prompt("Введите команду (*, +, /, =) : ");

                // Обработка команды.
                if (cmd.equals("*")) {
                    // Умножение на введенные вещественную и мнимую части.
                    double argRe = promptRead("Введите вещественную часть второго аргумента: ");
                    double argIm = promptRead("Введите мнимую часть второго аргумента: ");
                    calculator.multi(argRe, argIm);
                    continue;
                }
                if (cmd.equals("/")) {
                    // Деление на введенные вещественную и мнимую части.
                    double argRe = promptRead("Введите вещественную часть второго аргумента: ");
                    double argIm = promptRead("Введите мнимую часть второго аргумента: ");
                    calculator.divide(argRe, argIm);
                    continue;
                }
                if (cmd.equals("+")) {
                    // Сложение с введенными вещественной и мнимой частями.
                    double argRe = promptRead("Введите вещественную часть второго аргумента: ");
                    double argIm = promptRead("Введите мнимую часть второго аргумента: ");
                    calculator.sum(argRe, argIm);
                    continue;
                }
                if (cmd.equals("=")) {
                    // Вывод результата.
                    String result = calculator.getResult();
                    System.out.printf("Результат %s\n", result);
                    break;
                }
            }

            // Запрос на продолжение вычислений.
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equalsIgnoreCase("Y")) {
                continue;
            }
            break;
        }
    }

    /**
     * Читает вводимую пользователем строку через консоль.
     *
     * @param message Строка с сообщением для ввода.
     * @return Введенная пользователем строка.
     */
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    /**
     * Читает вводимое пользователем число через консоль.
     *
     * @param message Строка с сообщением для ввода.
     * @return Введенное пользователем число.
     */
    private double promptRead(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Double.parseDouble(in.nextLine());
    }
}
