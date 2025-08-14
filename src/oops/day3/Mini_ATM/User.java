package OOPsDay3.Mini_ATM;

public class User {
    private String ATMNumber;
    private int PIN;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public User(String userNumber, int PIN, double balance) {
        this.ATMNumber = userNumber;
        this.PIN = PIN;
        this.balance = balance;
    }


    public String getUserNumber() {
        return ATMNumber;
    }

    public void setUserNumber(String userNumber) {
        this.ATMNumber = userNumber;
    }

    public int getPIN() {
        return PIN;
    }

    public void setPIN(byte PIN) {
        this.PIN = PIN;
    }
}
