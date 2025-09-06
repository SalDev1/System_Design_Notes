package LLD.DesignHotelManagementSystem;

import LLD.DesignHotelManagementSystem.Rooms.Room;

public interface HotelMediator {
    public void placeReservation(String rId, Customer customer, int roomId, Payment paymentType);
    public void cancelReservation(String rId);
    public void makePaymentForReservation(Payment paymentType);
    public void checkIn(Room room);
    public void checkOut(Room room);
    public void createInvoice(Reservation reservation);
}
