package OOPSDay2.BankingSystem;

public class CurrentAccount extends BankAccount {
    public CurrentAccount(String name, String accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    @Override
    boolean withdraw(double amount) {
        if (balance > amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

}
