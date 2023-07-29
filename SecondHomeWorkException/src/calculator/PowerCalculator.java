package calculator;

import calculator.exceptions.InvalidInputException;
import calculator.exceptions.ArithmeticOperationsException;

/**
 * PowerCalculator - класс-утилита, предоставляющий метод для вычисления степени числа.
 */
public class PowerCalculator {

    /**
     * Вычисляет значение степени для основания и показателя степени, переданных в качестве аргументов.
     * Если основание равно нулю и показатель степени отрицательный, генерируется InvalidInputException.
     * Если результат возврата метода получается бесконечным или NaN, генерируется ArithmeticOperationsException.
     *
     * @param base     число, которое нужно возвести в степень
     * @param exponent степень, в которую нужно возвести base
     * @return double результат возведения в степень
     * @throws InvalidInputException         если основание равно нулю и показатель степени отрицательный
     * @throws ArithmeticOperationsException если результат вычислений равен Infinity или NaN
     */
    public static double calculatePower(double base, double exponent) throws ArithmeticOperationsException, InvalidInputException {
        if (base == 0 && exponent < 0) {
            throw new InvalidInputException("Invalid input: base 0 with negative exponent is undefined");
        }
        double power = Math.pow(base, exponent);
        if (!Double.isFinite(power)) {
            throw new ArithmeticOperationsException("Infinity or NaN: result is infinity or NaN");
        }
        return power;
    }
}
