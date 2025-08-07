package OOPSDay2.BankingSystem;

abstract class BankAccount {
    final String name;
    final String accountNumber;
    double balance;


    public BankAccount(String name, String accountNumber, double initialDeposit) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        balance += amount;
        return true;
    }

    abstract boolean withdraw(double amount);

    public void display() {
        System.out.println("Account number is: " + accountNumber);
        System.out.println("Account holder name is: " + name);
        System.out.println("Current balance is : " + balance);
    }
}
