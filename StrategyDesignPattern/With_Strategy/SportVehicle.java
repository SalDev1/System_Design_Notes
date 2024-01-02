package StrategyDesignPattern.With_Strategy;

import StrategyDesignPattern.With_Strategy.Strategy.SportsDriveStrategy;

public class SportVehicle extends Vehicle {
    SportVehicle() {
        super(new SportsDriveStrategy());
    }
}
