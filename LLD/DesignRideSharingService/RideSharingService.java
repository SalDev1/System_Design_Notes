package LLD.DesignRideSharingService;

public class RideSharingService {
    TripManager tripManager;
    StrategyManager strategyManager;
    DriverManager driverManager;
    RiderManager riderManager;

    public RideSharingService() {
        this.tripManager = new TripManager();
        this.strategyManager = new StrategyManager();
        this.driverManager = new DriverManager();
    }

    void addRider(String userId, String name, String contactInfo) {
        // Logic to add a rider to the system
    }

    void removeRider(String userId, String name, String contactInfo) {
        // Logic to remove a rider from the system
    }

    void addDriver(String driverId, String name, String contactInfo, double rating) {
        // Logic to add a driver to the system
    }

    void removeDriver(String driverId, String name, String contactInfo, double rating) {
        // Logic to remove a driver from the system
    }

    void requestRide(String userId, String sourceLocation, String destinationLocation) {
        // Logic to handle ride request
        // 1. Determine driver matching strategy
        // 2. Determine pricing strategy
        // 3. Create a trip and assign a driver
    }

    void cancelRide(String tripId) {
        // Logic to handle ride cancellation
    }

    void acceptUserRide(String tripId, String driverId) {
        // Logic to handle driver accepting a ride
    }

    void endUserRide(String tripId) {
        // Logic to handle ending a ride
    }
}
