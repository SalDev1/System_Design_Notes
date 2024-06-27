import enums.VehicleType;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ParkingManager parkingManager = new ParkingManager();

        parkingManager.initializeParkingLot();

        List<ParkingSpot> parkingSpotList = parkingManager.getParkingSpots();

        Vehicle car = new Vehicle(1213, VehicleType.CAR);
        Vehicle bike = new Vehicle(3245, VehicleType.BIKE);
        Vehicle truck = new Vehicle(5657,VehicleType.TRUCK);

        // Fetching two parking spots.
        ParkingSpot ps1 = parkingSpotList.get(0);
        ParkingSpot ps2 = parkingSpotList.get(1);

        // Creating two tickets for two vehicles.
        Ticket ticket1 = new Ticket("1",ps1,120,car);
        Ticket ticket2 = new Ticket("2",ps2,60,bike);

        // Adding the tickets generated to the parkingLot tickets array.
        parkingManager.addParkingLotTicket(ticket1);
        parkingManager.addParkingLotTicket(ticket2);

        // Adding the designated vechile to the selected spot.
        parkingManager.addVehicleToParkingSpot(car,ticket1,ps1.getId());
        parkingManager.addVehicleToParkingSpot(bike,ticket2,ps2.getId());

        parkingManager.displayAvailableParkingSpots();

        parkingManager.removeVehicleFromParkingSpot(car, ps1.getId());
        parkingManager.removeParkingLotTicket(ticket1);

        parkingManager.displayAvailableParkingSpots();
    }
}
