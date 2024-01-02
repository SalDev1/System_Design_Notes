package StrategyDesignPattern.With_Strategy;

import StrategyDesignPattern.With_Strategy.Strategy.NormalDriveStrategy;

public class OffRoadVehicle extends Vehicle {

    OffRoadVehicle() {
        super(new NormalDriveStrategy());
    }

}
