package LLD.DesignElevatorDesign;

public class ElevatorCar {
    int id;
    ElevatorDisplay display;
    InternalButtons internalButtons; 
    ElevatorState elevatorState;
    int currentFloor; 
    Direction direction; 
    ElevatorDoor elevatorDoor;

    public ElevatorCar() {
        display = new ElevatorDisplay();
        internalButtons = new InternalButtons();
        elevatorState = ElevatorState.IDLE;
        currentFloor = 0; // Assuming ground floor is 0
        direction = Direction.UP; // Default direction
        elevatorDoor = new ElevatorDoor();
    }

    public void showDisplay() {
        display.showDisplay();
    }

    public void pressButton(int destination) {
        internalButtons.pressButton(destination, this);
    }

    public void setDisplay() {
        this.display.setDisplay(currentFloor, direction);
    }

    boolean moveElevator(Direction direction, int destinationFloor) {
        int startFloor = currentFloor;
        if(direction == Direction.UP) {
            for(int i = startFloor; i <= destinationFloor; i++) {
                this.currentFloor = startFloor;
                setDisplay();
                showDisplay();
                if(i == destinationFloor) {
                    return true; // Successfully moved to destination
                }
            }
        } else if(direction == Direction.DOWN) {
           for(int i = startFloor ; i >= destinationFloor; i--) {
              this.currentFloor = startFloor;
              setDisplay();
              showDisplay();
              if(i == destinationFloor) {
                  return true; // Successfully moved to destination
              }
           }
        }
        return false;
    }
}
