package LLD.DesignHotelManagementSystem;

import java.util.ArrayList;
import java.util.List;

import LLD.DesignHotelManagementSystem.Rooms.Room;

public class HotelInventory {
    int totalAvailableRooms; 
    List<Reservation> reservations;
    List<Room> rooms;
    
    HotelInventory(int totalAvailableRooms){
        this.totalAvailableRooms = totalAvailableRooms;
        this.reservations = new ArrayList<>();
        this.rooms = new ArrayList<>();
    }
    public boolean checkAvailability() {
        if(reservations.size() > totalAvailableRooms) {
            return false;
        }
        return true;
    }
    public Room getRoomDetails(int roomId) {
        for(Room room : rooms) {
            if(room.getRoomNumber() == roomId) {
                return room;
            }
        }
        return null;
    }
    public void addRoom(Room room) {
        rooms.add(room);
    }
}
