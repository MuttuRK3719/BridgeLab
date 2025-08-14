package OOPsProblemsDay4.BankingSystem;

public class FixedDeposit extends Bank {
    public FixedDeposit(long accountNumber, String name, long mobileNumber, double initialAmount) {
        super(accountNumber, name, mobileNumber, initialAmount);
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
