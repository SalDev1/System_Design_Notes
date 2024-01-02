package StrategyDesignPattern.With_Strategy;

import StrategyDesignPattern.With_Strategy.Strategy.DriveStrategy;

/*
 * Vehicle
 */
public class Vehicle {

    /*
     * We don't use this
     * DriveStrategy ds = new DriveStrategy() , because this is not scalable , as it
     * leads to using only that type of DriveStrategy..
     * 
     * I want a little bit dynamic.
     */
    DriveStrategy driveObject;

    // Constructor Injection.
    Vehicle(DriveStrategy driveObj) {
        this.driveObject = driveObj;
    }

    public void drive() {
        driveObject.drive();
    }
}