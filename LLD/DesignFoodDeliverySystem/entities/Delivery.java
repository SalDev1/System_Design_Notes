package LLD.DesignFoodDeliverySystem.entities;

import LLD.DesignFoodDeliverySystem.enums.DeliveryStatus;

public class Delivery {
    public String deliveryId;
    public String deliveryAddress;
    public DeliveryStatus deliveryStatus;
    public DeliveryPartner deliveryPerson;
    public Restaurant restaurant;
    public Order order;

    public Delivery(String deliveryId, String deliveryAddress, DeliveryStatus deliveryStatus, DeliveryPartner deliveryPerson, Restaurant restaurant, Order order) {
        this.deliveryId = deliveryId;
        this.deliveryAddress = deliveryAddress;
        this.deliveryStatus = deliveryStatus;
        this.deliveryPerson = deliveryPerson;
        this.restaurant = restaurant;
        this.order = order;
    }

    public String getDeliveryId() {
        return deliveryId;
    }
}
