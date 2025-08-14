package OOPsDay3.EmployeePromo;

public class Main {
    public static void main(String[] args) {
        Employee e1=new Employee(12,"muttu","Junior");
        System.out.println(e1);
        e1.promote();
        System.out.println(e1);
    }
}
