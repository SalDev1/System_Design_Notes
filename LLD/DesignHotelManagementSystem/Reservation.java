package LLD.DesignHotelManagementSystem;

import LLD.DesignHotelManagementSystem.Rooms.Room;

public class Reservation {
    String reservationId;
    Customer customer;
    Room room;
    String reservationStartDate;
    String reservationEndDate;

    Reservation(String reservationId, Customer customer, Room room, String reservationStartDate, String reservationEndDate) {
        this.reservationId = reservationId;
        this.customer = customer;
        this.room = room;
        this.reservationStartDate = reservationStartDate;
        this.reservationEndDate = reservationEndDate;
    }
    
    public String getReservationId() {
        return reservationId;
    }
}
