package oops.day5.onlinefoodorder;

import java.util.Arrays;

public class Pizza implements FoodItem, PreparationTime {
    String[] ingredients = {"flour", "yeast", "water"};
    CalculateTime time;
    @Override
    public void ingredientsList(FoodItem foodItem) {
        System.out.println(Arrays.toString(ingredients));
    }
    Pizza(CalculateTime time){
        this.time=time;
    }

    @Override
    public void status() {
        System.out.println("Your pizza is preparing now ");
    }

    @Override
    public void timeRequired() {
        System.out.println("Please wait " + time.timeRequired()+ " minutes ");
    }

}
