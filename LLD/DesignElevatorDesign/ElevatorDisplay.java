package LLD.DesignElevatorDesign;

public class ElevatorDisplay {
    int floor;
    Direction direction;

    public void setDisplay(int floor, Direction direction) {
        this.floor = floor;
        this.direction = direction;
    }

    public void showDisplay() {
        System.out.println("Current Floor: " + floor + ", Direction: " + direction);
    }
}
