package LLD.DesignCarRentalSystem;

import java.util.List;

import LLD.DesignCarRentalSystem.Product.VehicleType;

public class VehicleInventoryManagement {

    List<VehicleType> vehicles;
    VehicleInventoryManagement(List<VehicleType> vehicles) {
        this.vehicles = vehicles;
    }
    public List<VehicleType> getVehicles() {
        return vehicles;
    }
    public void setVehicles(List<VehicleType> vehicles) {
        this.vehicles = vehicles;
    }
}
