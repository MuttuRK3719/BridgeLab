package OOPsProblemsDay4.Restorent;

public class Pizza extends FoodItem {
    private static int preparationTime;
    private static double price;
    private static String[] ingredients;

    @Override
    int getPreparationTime() {
        return preparationTime;
    }

    public static void setPreparationTime(int preparationTime) {
        Pizza.preparationTime = preparationTime;
    }

    public  double getPrice() {
        return price;
    }

    public static void setPrice(double price) {
        Pizza.price = price;
    }

    public static String[] getIngredients() {
        return ingredients;
    }

    public static void setIngredients(String[] ingredients) {
        Pizza.ingredients = ingredients;
    }

    @Override
    void getStatus() {
        System.out.println("Ur Pizza food is preparing wait some time ");

    }
}
