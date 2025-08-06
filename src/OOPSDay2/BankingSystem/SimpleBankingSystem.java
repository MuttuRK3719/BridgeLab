package OOPSDay2.BankingSystem;

import java.util.HashMap;
import java.util.Map;

public class SimpleBankingSystem implements BankingSystem {
    Map<String, BankAccount> accounts = new HashMap<>();

    @Override
    public void createAccount(String accountType, String name, String accountNumber, double initialDeposit) {
        BankAccount account;
        if (accountType.equalsIgnoreCase("saving")) {
            account = new SavingAccount(name, accountNumber, initialDeposit);
        } else if (accountType.equalsIgnoreCase("current")) {
            account = new CurrentAccount(name, accountNumber, initialDeposit);
        } else{
            System.out.println("Invalid account type: ");
            return ;
        }
        accounts.put(accountNumber,account);
        System.out.println(accountType+" is created with name of : "+name);
    }

    @Override
    public double checkBalance(String accountNumber) {
        BankAccount account=accounts.get(accountNumber);
        return account!=null?account.getBalance():-1;
    }

    @Override
    public void  deposit(String accountNumber, double amount) {
        BankAccount account=accounts.get(accountNumber);
         if(account!=null)account.balance+=amount;
    }

    @Override
    public boolean withdraw(String accountNumber, double amount) {
       BankAccount account=accounts.get(accountNumber);
       if(account!=null) {
           account.withdraw(amount);
           return true;
       }
       return false;
    }

    @Override
    public boolean transferFund(String fromAccountNumber, double amount, String toAccountNumber) {
        BankAccount fromAccount=accounts.get(fromAccountNumber);
        BankAccount toAccount=accounts.get(toAccountNumber);
        if(fromAccount!=null&&toAccount!=null&&withdraw(fromAccountNumber,amount)) {
           deposit(toAccountNumber,amount);
           return true;
        }
        return false;
    }

    @Override
    public void displayAccount(String accountNumber) {
    BankAccount bankAccount=accounts.get(accountNumber);
    if(bankAccount!=null) bankAccount.display();
    else System.out.println("Not fount any account: ");
    }
}
