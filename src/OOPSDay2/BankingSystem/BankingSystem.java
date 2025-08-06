package OOPSDay2.BankingSystem;

public interface BankingSystem {
    void createAccount(String accountType,String name, String accountNumber, double initialDeposit);

    double checkBalance(String accountNumber);

    void deposit(String accountNumber, double amount);

    boolean withdraw(String accountNumber, double amount);

    boolean transferFund(String fromAccountNumber, double amount, String toAccountNumber);

    void displayAccount(String accountNumber);
}
