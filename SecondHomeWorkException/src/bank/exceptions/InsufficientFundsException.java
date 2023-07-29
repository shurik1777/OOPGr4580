package bank.exceptions;

/**
 * Исключение, возникающее при попытке снять со счета больше денег, чем на нем имеется.
 */
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
