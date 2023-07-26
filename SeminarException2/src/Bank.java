import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Исключение, возникающее при попытке снять со счета больше денег, чем на нем имеется.
 */
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

/**
 * Исключение, возникающее при попытке пополнить счет на сумму, превышающую максимальный допустимый баланс.
 */
class MaxBalanceExceededException extends Exception {
    public MaxBalanceExceededException(String message) {
        super(message);
    }
}

/**
 * Представляет банковский счет с балансом и максимальным допустимым балансом.
 */
class BankAccount {
    private double balance;
    private double maxBalance;
    private Lock lock;

    /**
     * Создает новый банковский счет с заданным максимальным допустимым балансом.
     *
     * @param maxBalance максимальный допустимый баланс для счета
     */
    public BankAccount(double maxBalance) {
        this.balance = 0;
        this.maxBalance = maxBalance;
        this.lock = new ReentrantLock();
    }

    /**
     * Пополняет счет на указанную сумму.
     *
     * @param amount сумма для пополнения
     * @throws MaxBalanceExceededException если текущий баланс плюс сумма пополнения превышает максимальный допустимый баланс
     */
    public void deposit(double amount) throws MaxBalanceExceededException {
        lock.lock();
        try {
            if (balance + amount > maxBalance) {
                throw new MaxBalanceExceededException("Превышен максимальный допустимый баланс.");
            }
            balance += amount;
        } finally {
            lock.unlock();
        }
    }

    /**
     * Снимает со счета указанную сумму.
     *
     * @param amount сумма для снятия
     * @throws InsufficientFundsException если на счете недостаточно средств для снятия указанной суммы
     */
    public void withdraw(double amount) throws InsufficientFundsException {
        lock.lock();
        try {
            if (amount > balance) {
                throw new InsufficientFundsException("Недостаточно средств на счете.");
            }
            balance -= amount;
        } finally {
            lock.unlock();
        }
    }

    /**
     * Возвращает текущий баланс счета.
     *
     * @return текущий баланс счета
     */
    public double getBalance() {
        return balance;
    }
}

/**
 * Управляет банковскими счетами и обрабатывает транзакции.
 */
class Bank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        Thread thread1 = new Thread(() -> {
            try {
                account1.deposit(500);
                account1.withdraw(200);
                System.out.println("Операции счета 1 выполнены успешно");
            } catch (MaxBalanceExceededException | InsufficientFundsException e) {
                System.out.println(e.getMessage());
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                account2.deposit(1000);
                account2.withdraw(500);
                System.out.println("Операции счета 2 выполнены успешно");
            } catch (MaxBalanceExceededException | InsufficientFundsException e) {
                System.out.println(e.getMessage());
            }
        });

        thread1.start();
        thread2.start();
    }
}
