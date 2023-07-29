package bank;

import bank.exceptions.InsufficientFundsException;
import bank.exceptions.InvalidAmountException;
import bank.exceptions.MaxBalanceExceededException;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Представляет банковский счет с балансом и максимальным допустимым балансом.
 */
public class BankAccount {
    private double balance;
    private double maxBalance;
    private Lock lock;

    /**
     * Создает новый банковский счет с заданным максимальным допустимым балансом.
     *
     * @param balance    начальный баланс для счета
     * @param maxBalance максимальный допустимый баланс для счета
     */
    public BankAccount(double balance, double maxBalance) {
        this.balance = balance;
        this.maxBalance = maxBalance;
        this.lock = new ReentrantLock();
    }


    /**
     * Пополняет счет на указанную сумму.
     *
     * @param amount сумма для пополнения
     * @throws MaxBalanceExceededException если текущий баланс плюс сумма пополнения превышает максимальный допустимый баланс
     * @throws InvalidAmountException      если сумма перевода меньше или равна 0
     */
    public void deposit(double amount) throws MaxBalanceExceededException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Некорректная сумма перевода");
        }

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
     * @throws InvalidAmountException     если сумма перевода меньше или равна 0
     */
    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Некорректная сумма перевода");
        }

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

