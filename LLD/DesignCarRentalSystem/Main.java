package LLD.DesignCarRentalSystem;

import java.util.ArrayList;
import java.util.List;

import LLD.DesignCarRentalSystem.Product.Car;
import LLD.DesignCarRentalSystem.Product.Vehicle;
import LLD.DesignCarRentalSystem.Product.VehicleType;

public class Main {

    public static void main(String[] args) {
        List<User> users = addUser();
        List<Store> stores = addStores();
        List<Vehicle> vehicles = addVehicles();

        VehicleRentalSystem vehicleRentalSystem = new VehicleRentalSystem(stores, users);

        // 0. User cases
        User user = users.get(0);

        // 1. user search store based on location
        Location location = new Location(403012, "Pune", "Maharashtra", "India");
        Store store = vehicleRentalSystem.getStore(location);

        // 2. get all vehicles you are interested in (based upon different filters)
        List<Vehicle> availableVehicles = store.getVehicles(VehicleType.CAR);

        // 3. reserving a particular vehicle
        Reservation reservation = store.createReservation(availableVehicles.get(0), users.get(0));

        Bill bill = new Bill(reservation);

        Payment payment = new Payment();
        payment.payBill(bill);
        store.completeReservation(reservation.reservationId);   
    }
}

public static List<Vehicle> addVehicles() {
    List<Vehicle> vehicles = new ArrayList<>();

    Vehicle vehicle1 = new Car();
    vehicle1.setVehicleId(1);
    vehicle1.setVehicleType(VehicleType.CAR);

    Vehicle vehicle2 = new Car();
    vehicle2.setVehicleId(2);
    vehicle2.setVehicleType(VehicleType.CAR);

    vehicles.add(vehicle1);
    vehicles.add(vehicle2);

    return vehicles;
}

public static List<User> addUser() {
    List<User> users = new ArrayList<>();
    
    User user1 = new User();
    user1.setUserId(1);
    user1.setName("John Doe");
    
    users.add(user1);
    return users;
}

public static List<Store> addStores() {
    List<Store> stores = new ArrayList<>();
    Store store1 = new Store();
    store1.storeId = 1;
    store1.setVehicles(vehicles);
    
    stores.add(store1);
    return stores;
}