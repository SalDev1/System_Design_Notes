package LLD.DesignRideSharingService.strategy;

public class DefaultPricingStrategy implements PricingStrategy {
    @Override
    public double calculateFare(double distance, double price) {
        // Own custom logic of default pricing strategy.
        return distance * price;
    }
}
