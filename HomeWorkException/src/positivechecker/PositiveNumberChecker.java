package positivechecker;

import java.util.Scanner;

/**
 * Исключение, возникающее при попытке проверить некорректное число (меньше или равно нулю).
 */
class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

/**
 * Проверяет, является ли число положительным.
 */
public class PositiveNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        try {
            checkNumber(number);
            System.out.println("Число корректно");
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Проверяет, является ли число положительным.
     *
     * @param number число для проверки
     * @throws InvalidNumberException если число меньше или равно нулю
     */
    public static void checkNumber(int number) throws InvalidNumberException {
        if (number <= 0) {
            throw new InvalidNumberException("Некорректное число");
        }
    }
}
