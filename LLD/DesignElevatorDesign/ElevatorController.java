package LLD.DesignElevatorDesign;

import java.util.PriorityQueue;

public class ElevatorController {
    PriorityQueue<Integer> upMinPQ;
    PriorityQueue<Integer> downMaxPQ;
    ElevatorCar elevatorCar; 

    ElevatorController(ElevatorCar elevatorCar) {
        this.elevatorCar = elevatorCar;
        upMinPQ = new PriorityQueue<>();
        downMaxPQ = new PriorityQueue<>((a, b) -> b - a); // Max-heap for down requests
    }

    public void submitExternalRequest(int floor, Direction direction) {
        if(direction == Direction.DOWN) {
            downMaxPQ.offer(floor);
        } else{
            upMinPQ.offer(floor);
        }
    }

    public void submitInternalRequest(int floor) {

    }

    public void controlElevator() {
        while(true) {
            if(elevatorCar.direction == Direction.UP) {

            }
        }
    }
}
