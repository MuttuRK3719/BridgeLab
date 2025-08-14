package oops.day4.bankingsystem1;

public interface TransactionOperation {
    double getBalance();
    boolean deposit(double amount);
    boolean withdraw(double amount);
}
