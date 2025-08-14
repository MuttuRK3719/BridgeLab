package oops.day5.onlinefoodorder;

import oops.day5.onlinefoodorder.fooditems.FoodItem;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    Map<String, FoodItem> items;
    Factory(Map<String,FoodItem> items){
        this.items=items;
    }
    FoodItem getItems(String item){
        return items.get(item);
    }
}
