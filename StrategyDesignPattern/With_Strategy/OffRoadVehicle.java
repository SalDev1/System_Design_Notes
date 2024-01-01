package Strategy_Design_Pattern.With_Strategy;

import Strategy_Design_Pattern.With_Strategy.Strategy.NormalDriveStrategy;

public class OffRoadVehicle extends Vehicle {

    OffRoadVehicle() {
        super(new NormalDriveStrategy());
    }

}
