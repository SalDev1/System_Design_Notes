package LLD.DesignFoodDeliverySystem.entities;

import java.util.ArrayList;
import java.util.List;

import LLD.DesignFoodDeliverySystem.enums.Dishtype;

public class Dish {
    public int dishId;
    public String dishName;
    public double price;
    public Dishtype dishType;
    public boolean isDishAvailable;
    public List<DishAddOn> dishAddOns;

    public Dish(int dishId, String dishName, double price, Dishtype dishType, boolean isDishAvailable) {
        this.dishId = dishId;
        this.dishName = dishName;
        this.price = price;
        this.dishType = dishType;
        this.isDishAvailable = isDishAvailable;
        this.dishAddOns = new ArrayList<>();
    }

    public void addDishAddOn(DishAddOn dishAddOn) {
        this.dishAddOns.add(dishAddOn);
    }
}
