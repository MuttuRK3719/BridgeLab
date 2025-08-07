package OOPSDay2.BankingSystem;

public class MainClass {
    public static void main(String[] args) {
        SimpleBankingSystem s1 = new SimpleBankingSystem();
        s1.createAccount("saving", "muttu", "1234", 100000);
        s1.createAccount("current", "prasanna", "7890", 50000);
        s1.createAccount("saving", "Dhanush", "1111", 5000);
        s1.createAccount("current", "Harish", "5678", 1000);
        s1.deposit("1234", 50);
        s1.displayAccount("1234");
    }
}
