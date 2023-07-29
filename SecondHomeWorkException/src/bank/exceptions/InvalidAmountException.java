package bank.exceptions;

/**
 * Исключение, возникающее если сумма перевода меньше или равна 0.
 */
public class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}
