package OOPsProblemsDay4.Restorent;

public class Pasta extends FoodItem {
    private static int preparationTime;
    private static double price;

    public static String[] getIngredients() {
        return ingredients;
    }

    public static void setIngredients(String[] ingredients) {
        Pasta.ingredients = ingredients;
    }

    public  double getPrice() {
        return price;
    }

    public static void setPrice(double price) {
        Pasta.price = price;
    }

    public static void setPreparationTime(int preparationTime) {
        Pasta.preparationTime = preparationTime;
    }

    private static String[] ingredients;

    @Override
    int getPreparationTime() {
        return preparationTime;
    }
    @Override
    void getStatus() {
        System.out.println("Ur pasta food is preparing wait some time ");
    }


}
