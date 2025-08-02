package LLD.DesignElevatorDesign;

public class InternalButtons {
    InternalDispatcher internalDispatcher = new InternalDispatcher();
    int []availableButtons = {1,2,3,4,5,6,7,8,9,10}; // Example available floors
    int buttonSelected; 

    void pressButton(int destination , ElevatorCar elevatorCar) {
        // 1. Check if destination is in the list of available floors. 

        // 2. submit the request to the jobDispatcher. 
        internalDispatcher.submitInternalRequest(destination, elevatorCar);
    }
}
