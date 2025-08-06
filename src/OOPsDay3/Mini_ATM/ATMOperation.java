package OOPsDay3.Mini_ATM;

public class ATMOperation {
    User []users=new User[5];
    int index=0;
    public void addUser(User u){
        users[index++]=u;
    }
    public double checkBalance(String ATMNumber,int pin){
        for (int i = 0; i < index; i++) {
            if(users[i].getUserNumber().equals(ATMNumber)&&users[i].getPIN()==pin) return users[i].getBalance();
        }
        System.out.println("Invalid PIN");
        return -1;
    }
    public void deposit(String ATMNumber,int pin,double amount){
        for (int i = 0; i < index; i++) {
            if(users[i].getUserNumber().equals(ATMNumber)&&users[i].getPIN()==pin){
                users[i].setBalance(users[i].getBalance()+amount);
                System.out.println("deposited successfully:");
                return;
            }
        }
        System.out.println("Invalid PIN");
    }
    public void withdraw(String ATMNumber,int pin,double amount){
        for (int i = 0; i < index; i++) {
            if(users[i].getUserNumber().equals(ATMNumber)&&users[i].getPIN()==pin){
                if(users[i].getBalance()>=amount){
                users[i].setBalance(users[i].getBalance()-amount);
                System.out.println("withdrawn successfully:");
                return;
                }
                else System.out.println("Insufficient balance ");;
            }
        }
        System.out.println("Invalid PIN");
    }
}
