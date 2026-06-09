import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import LLD.DesignFoodDeliverySystem.entities.Delivery;
import LLD.DesignFoodDeliverySystem.entities.DeliveryPartner;
import LLD.DesignFoodDeliverySystem.entities.Order;
import LLD.DesignFoodDeliverySystem.entities.Restaurant;
import LLD.DesignFoodDeliverySystem.enums.DeliveryStatus;
import LLD.DesignFoodDeliverySystem.strategy.DeliveryPartnerStrategy;
import LLD.DesignFoodDeliverySystem.strategy.LocBasedDeliveryPartnerStrategy;

class DeliveryManager {
    private Map<String, Delivery> deliveries;
    private Map<String, DeliveryPartner> deliveryPartners;
    private DeliveryPartnerStrategy deliveryPartnerStrategy;

    public DeliveryManager() {
        this.deliveries = new HashMap<>();
        this.deliveryPartners = new HashMap<>();
        this.deliveryPartnerStrategy = new LocBasedDeliveryPartnerStrategy();
    }

    public void addDeliveryPartner(DeliveryPartner partner) {
        deliveryPartners.put(partner.getPartnerId(), partner);
    }

    public void removeDeliveryPartner(DeliveryPartner partner) {
        this.deliveryPartners.remove(partner);
    }

    public Delivery createDelivery(Order order, Restaurant restaurant, DeliveryPartner partner) {
        // Logic to create a delivery for the given order and restaurant
        Delivery newDeliveryDetails = new Delivery("1001", "123 Main St", DeliveryStatus.PENDING, partner, restaurant, order);
        deliveries.put(newDeliveryDetails.getDeliveryId(), newDeliveryDetails);
        return newDeliveryDetails;
    }
}