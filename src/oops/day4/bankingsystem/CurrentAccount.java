package OOPsProblemsDay4.BankingSystem;

public class CurrentAccount extends Bank {
    public CurrentAccount(long accountNumber, String name, long mobileNumber) {
        super(accountNumber, name, mobileNumber);
    }

    @Override
    public boolean withdraw(double amount) {
        if (getInitialAmount() - amount >= getInitialAmount()) {
            setInitialAmount(getInitialAmount() - amount);
            return true;
        } else return false;
    }

    @Override
    public double calculateInterest() {
        return getLoan() * getInterest() / 100;
    }
}
