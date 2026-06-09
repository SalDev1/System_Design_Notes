package LLD.DesignFoodDeliverySystem.entities;

public class Restaurant {
    String restaurantId;
    String restaurantName;
    String restaurantAddress;
    Menu menu;

    public Restaurant(String restaurantId, String restaurantName, String restaurantAddress, Menu menu) {
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.restaurantAddress = restaurantAddress;
        this.menu = menu;
    }   

    public String getRestaurantId() {
        return restaurantId;
    }
}
