package OOPsProblemsDay4.Restorent;

public class MainClass {
    public static void main(String[] args) {
        Pizza.setPrice(200);
        Pizza.setPreparationTime(20);
        Pasta.setPrice(100);
        Pasta.setPreparationTime(5);
        Burger.setPrice(300);
        Burger.setPreparationTime(30);
        FoodItem pizza = new Pizza();
        System.out.println(pizza.getPrice());
        pizza.getStatus();
        System.out.println(pizza.getPreparationTime());
    }
}
