package calculator.exceptions;

/**
 * Исключение InvalidInputException возникает в случае, если происходит попытка выполнить
 * операцию (например, возведение в отрицательную степень), невозможную для входных данных.
 */
public class InvalidInputException extends Exception {

    /**
     * Создает новый экземпляр исключения InvalidInputException с указанным сообщением.
     *
     * @param message сообщение об ошибке.
     */
    public InvalidInputException(String message) {
        super(message);
    }

    /**
     * Создает новый экземпляр исключения InvalidInputException без дополнительного сообщения.
     */
    public InvalidInputException() {
        super();
    }
}
