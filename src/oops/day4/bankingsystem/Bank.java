package OOPsProblemsDay4.BankingSystem;

public abstract class Bank {
    private long accountNumber;
    private String name;
    private long mobileNumber;
    private static double initialAmount;
    private static double interest;
    private double loan;

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    public double getInitialAmount() {
        return initialAmount;
    }

    public static void setInitialAmount(double initialAmount) {
        Bank.initialAmount = initialAmount;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public double getInterest() {
        return interest;
    }

    public static void setInterest(double interest) {
        Bank.interest = interest;
    }

    public Bank(long accountNumber, String name, long mobileNumber, double initialAmount) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.initialAmount = initialAmount;
    }

    public Bank(long accountNumber, String name, long mobileNumber) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    public double checkBalance() {
        return initialAmount;
    }

    public abstract boolean withdraw(double amount);

    public abstract double calculateInterest();
}
