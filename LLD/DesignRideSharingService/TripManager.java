package LLD.DesignRideSharingService;

import java.util.Map;

import LLD.DesignRideSharingService.entities.Trip;

public class TripManager {
    Map<String, Trip> tripMap;
    StrategyManager strategyManager;

    void createTrip(Trip trip, String sourceLocation, String destinationLocation) {
        tripMap.put(trip.tripId, trip);
    }
    void cancelTrip(String tripId) {
        tripMap.remove(tripId);
    }
    void getTripById(String tripId) {
        tripMap.get(tripId);
    }
}
