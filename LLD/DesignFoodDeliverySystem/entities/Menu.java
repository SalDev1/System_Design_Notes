package LLD.DesignFoodDeliverySystem.entities;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<Dish> dishes;

    Menu() {
        this.dishes = new ArrayList<>();
    }

    public void addDishToMenu(Dish dish) {
        this.dishes.add(dish);
    }

    public void removeDishFromMenu(Dish dish) {
        this.dishes.remove(dish);
    }
}
