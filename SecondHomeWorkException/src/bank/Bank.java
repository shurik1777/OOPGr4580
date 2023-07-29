package bank;

import bank.exceptions.InsufficientFundsException;
import bank.exceptions.InvalidAmountException;
import bank.exceptions.MaxBalanceExceededException;

public class Bank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000, 2000);
        BankAccount account2 = new BankAccount(2000, 3000);

        Thread thread1 = new Thread(() -> {
            try {
                account2.deposit(1000);
                account2.withdraw(500);
                System.out.println("Операции счета 2 выполнены успешно");
            } catch (MaxBalanceExceededException | InsufficientFundsException | InvalidAmountException e) {
                System.out.println(e.getMessage());
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                account1.deposit(500);
                account1.withdraw(1501); // вызовет ошибку InsufficientFundsException
                System.out.println("Операции счета 1 выполнены успешно");
            } catch (MaxBalanceExceededException | InsufficientFundsException | InvalidAmountException e) {
                System.out.println(e.getMessage());
            }
        });

        Thread thread3 = new Thread(() -> {
            try {
                account1.deposit(-500); // вызовет ошибку InvalidAmountException
                account1.withdraw(200);
                System.out.println("Операции счета 1 выполнены успешно");
            } catch (MaxBalanceExceededException | InsufficientFundsException | InvalidAmountException e) {
                System.out.println(e.getMessage());
            }
        });

        Thread thread4 = new Thread(() -> {
            try {
                account2.deposit(0); // вызовет ошибку InvalidAmountException
                account2.withdraw(500);
                System.out.println("Операции счета 2 выполнены успешно");
            } catch (MaxBalanceExceededException | InsufficientFundsException | InvalidAmountException e) {
                System.out.println(e.getMessage());
            }
        });

        Thread thread5 = new Thread(() -> {
            try {
                account1.deposit(1500); // вызовет ошибку MaxBalanceExceededException
                account1.withdraw(200);
                System.out.println("Операции счета 1 выполнены успешно");
            } catch (MaxBalanceExceededException | InsufficientFundsException | InvalidAmountException e) {
                System.out.println(e.getMessage());
            }
        });

        thread1.start(); // могут возникнуть ошибки MaxBalanceExceededException, InsufficientFundsException, InvalidAmountException
        thread2.start(); // могут возникнуть ошибки InsufficientFundsException, InvalidAmountException
        thread3.start(); // могут возникнуть ошибки InvalidAmountException
        thread4.start(); // могут возникнуть ошибки InvalidAmountException
        thread5.start(); // могут возникнуть ошибки MaxBalanceExceededException, InsufficientFundsException, InvalidAmountException
    }
}
