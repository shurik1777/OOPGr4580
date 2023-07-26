package divisionprogram;

import java.util.Scanner;

/**
 * Исключение, возникающее при попытке деления на ноль.
 */
class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

/**
 * Запрашивает у пользователя два числа и выполняет их деление.
 */
public class DivisionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();

        try {
            double result = divideNumbers(number1, number2);
            System.out.println("Результат: " + result);
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Выполняет деление двух чисел.
     *
     * @param number1 делимое число
     * @param number2 делитель
     * @return результат деления
     * @throws DivisionByZeroException если делитель равен нулю
     */
    public static double divideNumbers(int number1, int number2) throws DivisionByZeroException {
        if (number2 == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        return (double) number1 / number2;
    }
}
