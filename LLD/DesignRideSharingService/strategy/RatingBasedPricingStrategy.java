package LLD.DesignRideSharingService.strategy;

public class RatingBasedPricingStrategy implements PricingStrategy {
    @Override
    public double calculateFare(double distance, double price) {
        // Own custom logic of rating based pricing strategy.
        return distance * price * 0.9; // Example: 10% discount for high-rated drivers.
    }
    
}
