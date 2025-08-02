package LLD.DesignElevatorDesign;

import java.util.List;

public class ExternalDispatcher {

    List<ElevatorController> elevatorControllerList = ElevatorCreator.elevatorControllerList;
    public void submitExternalRequest(int floor, Direction direction) {
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
