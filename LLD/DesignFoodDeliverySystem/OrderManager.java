package LLD.DesignFoodDeliverySystem;

import java.util.Map;

import LLD.DesignFoodDeliverySystem.entities.Order;

public class OrderManager {
    Map<String, Order> orders;
    public FoodManager foodManager;
    public DeliveryManager deliveryManager;


    public void placeOrder(Order order) {
        orders.put(order.getOrderId(), order);
    }

    public Order getOrderById(String orderId) {
         return orders.get(orderId);
    }

    public void manageDeliveryForOrder(Order order) {
        deliveryManager.createDelivery(order, foodManager.restaurantManager.getRestaurantById("R001"), null);
    }

    public void manageFoodPreparationForOrder(Order order) {
        foodManager.prepareFood("R001", order.getOrderId(), order.dishItems);
    }
}
