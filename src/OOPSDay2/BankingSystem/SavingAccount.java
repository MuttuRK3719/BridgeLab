package OOPsProblemsDay4.TollManagement.BankingSystem;

public class SavingAccount extends BankAccount {
    private static final double minBalance = 1000;

    SavingAccount(String name, String accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    @Override
    boolean withdraw(double amount) {
        if (balance - amount > minBalance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
