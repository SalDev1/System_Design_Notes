package StrategyDesignPattern.With_Strategy;

import StrategyDesignPattern.With_Strategy.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {
    GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
