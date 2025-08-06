package OOPsDay3.BankingSystem;

public class BankBranch {
    Account[] accounts = new Account[25];
    int index = 0;

    public void createAccount(String accountNumber, String ownerName, double balance) {

        if (index < accounts.length) {
            accounts[index++] = new Account(accountNumber, ownerName, balance);
            System.out.println("Account created successfully");
        } else System.out.println("Failed to create a account: ");
    }

    public boolean deposit(String accountNumber, double amount) {
        for (int i = 0; i < index; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                double bal = accounts[i].getBalance() + amount;
                accounts[i].setBalance(bal);
                return true;
            }
        }
        System.out.println("There is not such type of account is available: ");
        return false;
    }

    public void display(String accountNumber) {
        for (int i = 0; i < index; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                System.out.println(accounts[i]);
                break;
            }
        }
    }

    public boolean withDraw(String accountNumber, double amount) {
        for (int i = 0; i < index; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                if (accounts[i].getBalance() >= amount) {
                    double ba = accounts[i].getBalance() - amount;
                    accounts[i].setBalance(ba);
                    return true;
                } else {
                    System.out.println("Insufficient balance :");
                    return false;
                }

            }
        }
        System.out.println("There is not such type of account is available: ");
        return false;
    }

    public boolean transferAmount(String fromAccountNumber, String toAccountNumber, double balance) {
        boolean a=withDraw(fromAccountNumber,balance);
        if(a)
         return deposit(toAccountNumber,balance);
        return false;
    }
}
