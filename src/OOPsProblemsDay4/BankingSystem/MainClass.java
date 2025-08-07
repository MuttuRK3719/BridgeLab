package OOPsProblemsDay4.BankingSystem;

public class MainClass {
    public static void main(String[] args) {
        SavingAccount.setInterest(12.4);
        Customer customer1 = new Customer("saving", 1234, "muttu", 7892);
        customer1.createAccount();
        System.out.println(customer1.account1.checkBalance());
        customer1.account1.setLoan(10000);
        System.out.println(customer1.account1.getName());
        System.out.println(customer1.account1.calculateInterest());

    }
}
