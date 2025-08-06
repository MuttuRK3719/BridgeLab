package OOPsDay3.BankingSystem;

import OOPSDay2.BankingSystem.BankingSystem;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        BankBranch b = new BankBranch();
        b.createAccount("1234", "muttu", 100000);
        b.createAccount("7890", "prasanna", 50000);
        b.createAccount("1111", "Dhanush", 5000);
        b.createAccount("Harish", "5678", 1000);
        b.deposit("1234",  50);
        b.display("1234");
    }

    void choices() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1  to create account: ");
            System.out.println("2  to deposit: ");
            System.out.println("3  withdraw: ");
            System.out.println("4 for transfer money");
        } while (true);
    }
}
