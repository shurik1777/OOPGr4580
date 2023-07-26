import java.util.Scanner;

/**
 * Исключение, возникающее при вводе числа, выходящего за допустимый диапазон.
 */
class NumberOutOfRangeException extends Exception {
    public NumberOutOfRangeException(String message) {
        super(message);
    }
}

/**
 * Исключение, возникающее при суммировании двух чисел, которые, в сумме, слишком малы.
 */
class NumberSumException extends Exception {
    public NumberSumException(String message) {
        super(message);
    }
}

/**
 * Исключение, возникающее при попытке деления на ноль.
 */
class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

/**
 * Проверяет три числа, введенных пользователем, на соответствие заданым условиям.
 */
public class Hw3 {
    // NumberChecker
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int number3 = scanner.nextInt();

        try {
            checkNumbers(number1, number2, number3);
            System.out.println("Проверка пройдена успешно");
        } catch (NumberOutOfRangeException | NumberSumException | DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Проверяет, соответствуют ли три числа заданным условиям.
     *
     * @param number1 первое число для проверки
     * @param number2 второе число для проверки
     * @param number3 третье число для проверки
     * @throws NumberOutOfRangeException если хотя бы одно число выходит за допустимый диапазон
     * @throws NumberSumException если сумма первых двух чисел слишком мала
     * @throws DivisionByZeroException если третье число равно нулю
     */
    public static void checkNumbers(int number1, int number2, int number3)
            throws NumberOutOfRangeException, NumberSumException, DivisionByZeroException {
        if (number1 > 100) {
            throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
        }
        if (number2 < 0) {
            throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
        }
        if (number1 + number2 < 10) {
            throw new NumberSumException("Сумма первого и второго чисел слишком мала");
        }
        if (number3 == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
    }
}