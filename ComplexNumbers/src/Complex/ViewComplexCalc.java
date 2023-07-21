package Complex;

import java.util.Scanner;

/**
 * Класс служит для взаимодействия с пользователем через консоль
 */
public class ViewComplexCalc {

    private IComplexCalcFactory calculableFactory; ///< объект типа IComplexCalcFactory

    /**
     * конструктор
     *
     * @param calculableFactory содержит объект типа IComplexCalcFactory
     */
    public ViewComplexCalc(IComplexCalcFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    /**
     * метод содержит логику взаимодействия с пользователем
     * через консоль
     */
    public void run() {
        while (true) {
            double firstArgRe = promptRead("Введите вещественную часть первого аргумента: ");
            double firstArgIm = promptRead("Введите мнимую часть первого аргумента: ");
            iComplexCalc calculator = calculableFactory.create(firstArgRe, firstArgIm);
            while (true) {
                String cmd = prompt("Введите команду (*, +, /, =) : ");
                if (cmd.equals("*")) {
                    double argRe = promptRead("Введите вещественную часть второго аргумента: ");
                    double argIm = promptRead("Введите мнимую часть второго аргумента: ");
                    calculator.multi(argRe, argIm);
                    continue;
                }
                if (cmd.equals("/")) {
                    double argRe = promptRead("Введите вещественную часть второго аргумента: ");
                    double argIm = promptRead("Введите мнимую часть второго аргумента: ");
                    calculator.divide(argRe, argIm);
                    continue;
                }
                if (cmd.equals("+")) {
                    double argRe = promptRead("Введите вещественную часть второго аргумента: ");
                    double argIm = promptRead("Введите мнимую часть второго аргумента: ");
                    calculator.sum(argRe, argIm);
                    continue;
                }
                if (cmd.equals("=")) {
                    String result = calculator.getResult();
                    System.out.printf("Результат %s\n", result);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equalsIgnoreCase("Y")) {
                continue;
            }
            break;
        }
    }

    /**
     * @param message строка, которую пользователь вводит в консоле
     * @return введенную пользователем строку в консоли
     */
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    /**
     * @param message строка с числом, которую пользователь вводит с консоли
     * @return введенное пользователем число
     */
    private double promptRead(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Double.parseDouble(in.nextLine());
    }
}
