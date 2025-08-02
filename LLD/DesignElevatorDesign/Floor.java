package LLD.DesignElevatorDesign;

public class Floor {
    int floorNumber;
    ExternalDispatcher externalDispatcher = new ExternalDispatcher();

    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
    }
    public void pressButton(Direction direction) {
        externalDispatcher.submitFloorRequest(floorNumber,direction);
    }
}
