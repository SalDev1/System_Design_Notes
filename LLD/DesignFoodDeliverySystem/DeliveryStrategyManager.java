package LLD.DesignFoodDeliverySystem;

import LLD.DesignFoodDeliverySystem.strategy.DeliveryPartnerStrategy;
import LLD.DesignFoodDeliverySystem.strategy.LocBasedDeliveryPartnerStrategy;

public class DeliveryStrategyManager {
    DeliveryPartnerStrategy assignStrategy(String strategyType) {
        // Logic to assign delivery strategy based on the strategy type
        if(strategyType.equals("LocationBased")) {
            // Assign location-based delivery strategy
            return new LocBasedDeliveryPartnerStrategy();
        } else {

        }
        return null;   
    }
}
