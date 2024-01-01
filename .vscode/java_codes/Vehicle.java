// public class Vehicle {
//     public Boolean hasEngine() {
//         return true;
//     }

//     public Integer getNumberOfWheels() {
//         return 2;
//     }
// }

// class Motorcycle extends Vehicle {
// }

// class Bicycle extends Vehicle {
//     @Override
//     public Boolean hasEngine() {
//         return null;
//     }
// }

// class Car extends Vehicle {
//     @Override
//     public Integer getNumberOfWheels() {
//         return 4;
//     }
// }

/*
 * The changes we make to maintain the L principle will be.
 * 
 * In the parent , put only some generic method which will
 * be common for all children and they don't narrow the capability.
 */
public class Vehicle {
    public Integer getNumberOfWheels() {
        return 2;
    }
};

class EngineVehicle extends Vehicle {
    public Boolean hasEngine() {
        return true;
    }
};

class BicycleEngine extends Vehicle {

}

// Car and Motorcycle will have EngineVehicle.
class Car extends EngineVehicle {

};

class Motorcycle extends EngineVehicle {

};

// Bicycle will have BicycleEngine.
class Bicycle extends BicycleEngine {

}