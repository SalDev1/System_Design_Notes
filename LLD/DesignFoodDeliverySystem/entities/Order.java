package LLD.DesignFoodDeliverySystem.entities;

import java.util.List;

public class Order {
    public String orderId;
    public String customerName;
    public String customerAddress;
    public List<Dish> dishItems;
    public double totalAmount;

    public Order(String orderId, String customerName, String customerAddress, List<Dish> dishItems, double totalAmount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.dishItems = dishItems;
        this.totalAmount = totalAmount;
    }
    
    public String getOrderId() {
        return orderId;
    }
}
