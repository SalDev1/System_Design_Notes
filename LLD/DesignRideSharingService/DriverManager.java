package LLD.DesignRideSharingService;

import java.util.Map;

import LLD.DesignRideSharingService.entities.Driver;

public class DriverManager {
    Map<String, Driver> drivers;

    void addDriver(Driver driver) {
        drivers.put(driver.driverContactNo, driver);
    }

    void getDriver(String driverContactNo) {
        drivers.get(driverContactNo);
    }
}
