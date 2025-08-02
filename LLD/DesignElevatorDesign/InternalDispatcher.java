package LLD.DesignElevatorDesign;

import java.util.List;

public class InternalDispatcher {

    // This list contains the list of all the elevator requests.
    List<ElevatorController> elevatorControllerList = ElevatorCreator.elevatorControllerList;

    public void submitInternalRequest(int floor , ElevatorCar elevatorCar) {
        // for simplicity, I am following even odd.
        for(ElevatorController elevatorController : elevatorControllerList) {
            int elevatorID = elevatorController.elevatorCar.id;
            // If the elevatorId and floor number is odd
            if(elevatorID%2==1 && floor%2==1) {
                elevatorController.submitExternalRequest(floor, direction);
            } else if(elevatorID%2==0 && floor%2==0) {
                // If the elevatorId and floor number is even
                elevatorController.submitExternalRequest(floor, direction);
            }
        }
    }
}
