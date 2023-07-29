package bank.exceptions;

/**
 * Исключение, возникающее при попытке пополнить счет на сумму, превышающую максимальный допустимый баланс.
 */
public class MaxBalanceExceededException extends Exception {
    public MaxBalanceExceededException(String message) {
        super(message);
    }
}
