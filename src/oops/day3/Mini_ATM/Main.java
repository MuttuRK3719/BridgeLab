package OOPsDay3.Mini_ATM;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("1234", 1234, 100000);
        User u2 = new User("7890", 7890, 50000);
        User u3 = new User("2345", 2345, 50000);
        User u4 = new User("3456", 3456, 2000);
        User u5 = new User("4567", 4567, 4000);
        ATMOperation atm = new ATMOperation();
        atm.addUser(u1);
        atm.addUser(u2);
        atm.addUser(u3);
        atm.addUser(u4);
        atm.addUser(u5);
        System.out.println(atm.checkBalance("1234", 1234));
        atm.deposit("1234", 1234, 1000);
        atm.withdraw("1234", 1234, 2000);

    }
}
