package calculator;

import calculator.exceptions.ArithmeticOperationsException;
import calculator.exceptions.InvalidInputException;

import java.util.Scanner;

/**
 * Класс Calculator представляет простой калькулятор, который выполняет основные арифметические операции
 * (+, -, *, /, возведение в степень) над двумя введенными числами.
 */
public class Calculator {

    /**
     * Главный метод класса Calculator. Запрашивает у пользователя основание и показатель степени с помощью класса Scanner
     * и выполняет операции (+, -, *, /, возведение в степень) над ними. Если введены некорректные числа или происходит
     * деление на ноль, соответствующие ошибки выводятся на экран.
     */
    private static void runCalculator() {
        Scanner scanner = new Scanner(System.in);
        double base = 0, exponent = 0;

        try {
            System.out.print("Enter the base number: ");
            base = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter the exponent number: ");
            exponent = Double.parseDouble(scanner.nextLine());

            double additionResult = base + exponent;
            System.out.println("Addition result: " + additionResult);

            double subtractionResult = base - exponent;
            System.out.println("Subtraction result: " + subtractionResult);

            double multiplicationResult = base * exponent;
            System.out.println("Multiplication result: " + multiplicationResult);

            if (exponent != 0) {
                double divisionResult = base / exponent;
                System.out.println("Division result: " + divisionResult);
            } else {
                System.out.println("Error: Division by zero is not allowed");
            }

            try {
                double powerResult = PowerCalculator.calculatePower(base, exponent);
                System.out.println("Power result: " + powerResult);
            } catch (InvalidInputException | ArithmeticOperationsException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Enter valid numbers");
    }
    }

    /**
     * Метод запускает калькулятор в цикле, чтобы дать пользователю возможность повторить ввод,
     * если был введен некорректный ввод.
     */
    public static void main(String[] args) {
        boolean isRunning = true;
        while (isRunning) {
            runCalculator();
            System.out.print("Would you like to perform another calculation? (Y/N): ");
            String choice = new Scanner(System.in).nextLine().toUpperCase();
            if (!choice.equals("Y")) {
                isRunning = false;
            }
        }
    }
}
