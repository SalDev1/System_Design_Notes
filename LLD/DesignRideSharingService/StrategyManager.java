package LLD.DesignRideSharingService;

import LLD.DesignRideSharingService.strategy.DefaultPricingStrategy;
import LLD.DesignRideSharingService.strategy.DriverMatchingStrategy;
import LLD.DesignRideSharingService.strategy.LeastTimeBasedMatchingStrategy;
import LLD.DesignRideSharingService.strategy.PricingStrategy;
import LLD.DesignRideSharingService.strategy.RatingBasedPricingStrategy;

public class StrategyManager {

    public DriverMatchingStrategy driverMatchingStrategy;
    public PricingStrategy pricingStrategy;
    
    public void determinePricingStrategy(double driverRating) {
        // Logic to determine pricing strategy based on driver rating.
        if (driverRating >= 4.5) {
            this.pricingStrategy = new RatingBasedPricingStrategy();
        } else {
            this.pricingStrategy = new DefaultPricingStrategy();
        }
    }

     public void determineDriverStrategy(double driverRating) {
        // Logic to determine pricing strategy based on driver rating.
        this.driverMatchingStrategy = new LeastTimeBasedMatchingStrategy();
    }
}
