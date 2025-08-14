package OOPsProblemsDay4.BankingSystem;

public class Customer {
    private long accountNumber;
    private String name;
    private long mobileNumber;
    private static double initialAmount;
    private double interest;
    private double loan;
    private String accountType;
    Bank account1;

    public Customer(String accountType, long accountNumber, String name, long mobileNumber) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.accountType = accountType;
    }

    void createAccount() {

        if (accountType.equalsIgnoreCase("saving")) {
            account1 = new SavingAccount(accountNumber, name, mobileNumber, initialAmount);
        } else if (accountType.equalsIgnoreCase("current")) {
            account1 = new CurrentAccount(accountNumber, name, mobileNumber);
        } else if (accountType.equalsIgnoreCase("fixedDeposit")) {
            account1 = new FixedDeposit(accountNumber, name, mobileNumber, initialAmount);
        } else System.out.println("Not able to create this type of account: ");
    }
}
