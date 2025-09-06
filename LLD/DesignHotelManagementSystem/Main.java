package LLD.DesignHotelManagementSystem;

public class Main {
    public static void main(String[] args) {
        HotelSystem system = new HotelSystem();
        Customer customer1 = new Customer("Salman",23,"11-08-2001");
        Customer customer2 = new Customer("Sam",21,"11-08-1872");
        Customer customer3 = new Customer("Diya",21,"11-08-1872");

         // Adding single room.
        system.initializeRooms();

        system.placeReservation("R1", customer1, 10, Payment.CARD);
        System.out.println("\n");
        system.placeReservation("R2", customer2, 16, Payment.CASH);
        System.out.println("\n");
        system.placeReservation("R3", customer3, 5, Payment.ONLINE);

        System.out.println("\n");
        system.cancelReservation("R3");
    }
}
