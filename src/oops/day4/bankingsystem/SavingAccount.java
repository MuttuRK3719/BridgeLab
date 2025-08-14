package OOPsProblemsDay4.BankingSystem;

public class SavingAccount extends Bank {
    private double fixedDeposit = 1000;

    public SavingAccount(long accountNumber, String name, long mobileNumber, double initialAmount) {
        super(accountNumber, name, mobileNumber, initialAmount);
    }

    @Override
    public boolean withdraw(double amount) {
        if (getInitialAmount() - amount >= fixedDeposit) {
            setInitialAmount(getInitialAmount() - amount);
            return true;
        } else return false;
    }

    @Override
    public double calculateInterest() {
        return getLoan() * getInterest() / 100;
    }
}
