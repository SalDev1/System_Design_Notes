import java.util.ArrayList;
import java.util.List;

public class ParkingManager {
    List<ParkingSpot> parkingSpots;
    List<Ticket> tickets;

    void initializeParkingLot() {
        parkingSpots = new ArrayList<>();
        tickets = new ArrayList<>();
        initializeParkingSpots();
    }

    void initializeParkingSpots() {
        // Just initializing the parking spots in the parking ground
        // and pushing it into the list of spots.
        for(int i = 1 ; i <= 20 ; i++) {
            ParkingSpot ps = new ParkingSpot();
            ps.setId(i);
            ps.isEmpty = true;
            parkingSpots.add(ps);
        }
    }

    List<ParkingSpot> getParkingSpots () {
        return parkingSpots;
    }

    void addParkingLotTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    void removeParkingLotTicket(Ticket ticket) {
        tickets.remove(ticket);
    }

    void addVehicleToParkingSpot(Vehicle v , Ticket t ,int id) {
        ParkingSpot ps = parkingSpots.get(id);
        if(ps.isEmpty && ps.ticket == null) {
            ps.vehicle = v;
            ps.isEmpty = false;
            ps.ticket = t;
            // ps is not longer empty.
            // Update the status in the list as well;
        }
    }

    void removeVehicleFromParkingSpot(Vehicle v , int id) {
        ParkingSpot ps = parkingSpots.get(id);
        ps.vehicle = null;
        ps.isEmpty = true;
        ps.ticket = null;
    }

    void displayAvailableParkingSpots() {
        System.out.println("Available Parking Spots are : ");

        for (ParkingSpot ps : parkingSpots) {
            if(!ps.isEmpty) {
                System.out.println("Parking spot : " + ps.getId() + " is booked by " + ps.vehicle.getVehicleNo());
            }
            else {
                System.out.println("Parking spot : " + ps.getId() + " is empty ");
            }
        }
    }
}
