package LLD.DesignRideSharingService.strategy;

public class LeastTimeBasedMatchingStrategy implements DriverMatchingStrategy {
    @Override
    public void matchDriver(String driverDetails) {
        // Own custom logic of least time based matching strategy.
        System.out.println("Matching driver based on least time: " + driverDetails);
    }
    
}
