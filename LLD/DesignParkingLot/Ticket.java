public class Ticket {
    String id;
    ParkingSpot parkingSpot;
    Vehicle vehicle;
    long spotBookedInMins;

    public Ticket(String id, ParkingSpot parkingSpot, long spotBookedInMins, Vehicle vehicle) {
        this.id = id;
        this.parkingSpot = parkingSpot;
        this.spotBookedInMins = spotBookedInMins;
        this.vehicle = vehicle;
    }
}
