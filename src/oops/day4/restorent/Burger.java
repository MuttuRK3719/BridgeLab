package OOPsProblemsDay4.Restorent;

public class Burger extends FoodItem {
    private static int preparationTime;
    private static double price;
    private static String[] ingredients;

    public static void setPreparationTime(int preparationTime) {
        Burger.preparationTime = preparationTime;
    }

    public  double getPrice() {
        return price;
    }

    public static void setPrice(double price) {
        Burger.price = price;
    }

    public static String[] getIngredients() {
        return ingredients;
    }

    public static void setIngredients(String[] ingredients) {
        Burger.ingredients = ingredients;
    }

    @Override
    int getPreparationTime() {
        return preparationTime;
    }

    @Override
    void getStatus() {
        System.out.println("Ur Burger food is preparing wait some time ");

    }
}
