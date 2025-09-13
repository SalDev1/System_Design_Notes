package LLD.DesignConcertBookingSystem;

public class Main {
    public static void main(String[] args) {
        ConcertBookingSystem concertBookingSystem = new ConcertBookingSystem();

        Concert concert1 = new Concert("011", "Rock Concert", "Stadium A", "2023-10-15", "John Matthews", 5);
        Concert concert2 = new Concert("012", "Hip Hop Concert", "Stadium A", "2023-10-15", "Avicii", 5);
        Concert concert3 = new Concert("013", "Musical Concert", "Stadium A", "2023-10-15", "Hanz Zimmer", 5);
        concert1.setOpenSeats();

        User user1 = new User("Bob","2001-09-21",20);
        User user2 = new User("Alice","2001-07-21",22);

        concertBookingSystem.addConcert(concert1);
        concertBookingSystem.addConcert(concert2);
        concertBookingSystem.addConcert(concert3);

        // Booking a concert ticket for the mentioned users.
        concertBookingSystem.bookSeatForConcert("011", SeatType.VIP, user1);
        System.out.println("-----------------------------------");
        concertBookingSystem.bookSeatForConcert("011", SeatType.NORMAL, user1);
        System.out.println("-----------------------------------");
        concertBookingSystem.bookSeatForConcert("011", SeatType.PREMIUM, user1);
        System.out.println("-----------------------------------");
        concertBookingSystem.bookSeatForConcert("011", SeatType.NORMAL, user1);
        System.out.println("-----------------------------------");
        concertBookingSystem.bookSeatForConcert("011", SeatType.NORMAL, user1);
        System.out.println("-----------------------------------");
        // concertBookingSystem.bookSeatForConcert("011", SeatType.VIP, user1);

        concertBookingSystem.cancelConcertSeatReservation(21, "011");
    }
}
