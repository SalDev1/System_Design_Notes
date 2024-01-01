package Strategy_Design_Pattern.With_Strategy;

import Strategy_Design_Pattern.With_Strategy.Strategy.SportsDriveStrategy;

public class SportVehicle extends Vehicle {
    SportVehicle() {
        super(new SportsDriveStrategy());
    }
}
