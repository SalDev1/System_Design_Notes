package Strategy_Design_Pattern.With_Strategy;

import Strategy_Design_Pattern.With_Strategy.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {
    GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
