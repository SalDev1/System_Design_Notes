package LLD.DesignHotelManagementSystem;
import LLD.DesignHotelManagementSystem.Rooms.DeluxeRoom;
import LLD.DesignHotelManagementSystem.Rooms.DoubleRoom;
import LLD.DesignHotelManagementSystem.Rooms.Room;
import LLD.DesignHotelManagementSystem.Rooms.SingleRoom;

public class HotelSystem implements HotelMediator{
    HotelInventory hotelInventory;
    HotelSystem() {
        this.hotelInventory = new HotelInventory(20);
    }
    public void initializeRooms() {
        // Adding single room.
        for(int i = 1 ; i <= 5; i++) {
            SingleRoom singleRoom = new SingleRoom(i, 2000.0, "A");
            hotelInventory.addRoom(singleRoom);
        }   
        // Adding double room;
        for(int i = 6 ; i <= 10; i++) {
            DoubleRoom doubleRoom = new DoubleRoom(i, 2500.0, "A");
            hotelInventory.addRoom(doubleRoom);
        }   
        // Adding deluxe room;
        for(int i = 11 ; i <= 16; i++) {
            DeluxeRoom deluxeRoom = new DeluxeRoom(i, 3000.0, "A");
            hotelInventory.addRoom(deluxeRoom);
        }   
    }

    @Override
    public void placeReservation(String rId , Customer customer, int roomNo , Payment paymentType) {
      //  Need to check if the rooms are available or not;
      boolean isRoomAvailable = hotelInventory.checkAvailability();
      if(!isRoomAvailable) {
          System.out.println("No Rooms Available, Please come later");
          return;
      }
      Room room = hotelInventory.getRoomDetails(roomNo);
      Reservation reservation = new Reservation(rId, customer, room, "2023-10-01", "2023-10-05");
      hotelInventory.reservations.add(reservation);
      makePaymentForReservation(paymentType);
      createInvoice(reservation);
    }

    @Override
    public void cancelReservation(String rId) {
        for(Reservation reservation : hotelInventory.reservations) {
            if(reservation.getReservationId().equals(rId)) {
                hotelInventory.reservations.remove(reservation);
                System.out.println("Reservation Cancelled Successfully");
                return;
            }
        }
        System.out.println("No Reservation found with the given ID");
    }

    @Override
    public void makePaymentForReservation(Payment paymentType) {
        System.out.println("Making Payment of reservation through " + paymentType);
        System.out.println("Payment Successful");
    }

    @Override
    public void createInvoice(Reservation reservation) {
       System.out.println("Generating Invoice for Customer " + reservation.customer.getName());
       System.out.println("Invoice Generated Successfully");
    }

    @Override
    public void checkIn(Room room) {
       return;
    }

    @Override
    public void checkOut(Room room) {
       return;
    }
}
