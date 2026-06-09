package LLD.DesignFoodDeliverySystem.strategy;

public interface DeliveryPartnerStrategy {

    void assignDeliveryPartner(String orderId, String restaurantId);
}
