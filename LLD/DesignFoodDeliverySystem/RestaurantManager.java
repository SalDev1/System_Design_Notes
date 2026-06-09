package LLD.DesignFoodDeliverySystem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import LLD.DesignFoodDeliverySystem.entities.Restaurant;

public class RestaurantManager {
    Map<String, Restaurant> restaurants;

    RestaurantManager() {
        this.restaurants = new HashMap<>()
    }

    public void addRestaurant(Restaurant restaurant) {
        this.restaurants.put(restaurant.getRestaurantId(), restaurant);
    }

    public Restaurant getRestaurantById(String restaurantId) {
        return this.restaurants.get(restaurantId);
    }
}
