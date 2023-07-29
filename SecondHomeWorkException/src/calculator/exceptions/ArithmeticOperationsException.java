package calculator.exceptions;

/**
 * ArithmeticOperationsException - класс исключения, используемый для обработки ошибок во время выполнения арифметических операций
 * в калькуляторе. Это исключение выбрасывается, когда выполнение операции приводит к ошибке, которая не связана с
 * некорректным пользовательским вводом.
 */
public class ArithmeticOperationsException extends Exception {

    /**
     * Создает новый объект исключения с заданным детализированным сообщением ошибки.
     *
     * @param message детализированное сообщение об ошибке.
     */
    public ArithmeticOperationsException(String message) {
        super(message);
    }

    /**
     * Создает новый объект исключения ArithmeticOperationsException без дополнительного сообщения.
     */
    public ArithmeticOperationsException() {
        super();
    }
}
