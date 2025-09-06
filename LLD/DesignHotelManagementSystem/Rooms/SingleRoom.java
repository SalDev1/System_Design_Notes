package LLD.DesignHotelManagementSystem.Rooms;

public class SingleRoom implements Room {
    private String roomName;
    private int roomNumber;
    private double roomPrice;
    private String roomStatus;

    public SingleRoom(int roomNumber, double roomPrice , String roomStatus) {
        this.roomName = "Single Room";
        this.roomNumber = roomNumber;
        this.roomPrice = roomPrice;
        this.roomStatus = roomStatus;
    }

    @Override
    public String getRoomName() {
        return roomName;
    }

    @Override
    public int getRoomNumber() {
        return roomNumber;
    }

    @Override
    public double getRoomPrice() {
        return roomPrice;
    }
    
    @Override
    public String getRoomStatus() {
        return roomStatus;
    }
}
