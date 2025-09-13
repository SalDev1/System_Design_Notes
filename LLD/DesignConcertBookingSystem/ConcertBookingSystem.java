package LLD.DesignConcertBookingSystem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ConcertBookingSystem {
    List<Concert> concerts;
    Random random = new Random();

    ConcertBookingSystem() {
        concerts = new ArrayList<>();
    }

    public void addConcert(Concert concert) {
        concerts.add(concert);
    }

    public void removeConcert(String concertId) {
        for(Concert concert : concerts) {
            if(concert.concertId == concertId) {
                concerts.remove(concert);
                System.out.println("Concert Removed Successfully");
                return;
            }
        }
    }

    public Concert findConcertById(String concertId) {
        for(Concert concert : concerts) {
            if(concert.concertId == concertId) {
                return concert;
            }
        }
        return null;
    }

    public boolean checkForUniqueSeatNo(int seatNo, Concert concert) {
        for(ConcertSeatReservation reservation : concert.bookedSeatReservations) {
            if(reservation.getSeatNo() == seatNo) {
                return false;
            }
        }
        return true;
    }

    public void makeConcertSeatReservation(User user, Concert concert,  SeatType seatType) {
        Integer assignedSeatNo = concert.assignedUniqueSeatForConcert();
        ConcertSeatReservation reservation = new ConcertSeatReservation(20 + assignedSeatNo, user, concert , assignedSeatNo, seatType);
        concert.addConcertSeatReservation(reservation);
        concert.setTotalSeats(concert.getTotalSeats() - 1);
        System.out.println("Ticket is booked successfully");   
        return;
    }

    public void cancelConcertSeatReservation(int ticketId , String concertId) {
        Concert concert = findConcertById(concertId);
        if(concert == null) {
            System.out.println("No such concert found");
            return;
        }
        for(ConcertSeatReservation reservation : concert.bookedSeatReservations) {
            if(reservation.ticketId == ticketId) {
                concert.bookedSeatReservations.remove(reservation);
                concert.setTotalSeats(concert.getTotalSeats() + 1);
                System.out.println("Ticket Cancelled Successfully");
                return;
            }
        }
        System.out.println("No such ticket found");
        return;
    }

    public void bookSeatForConcert(String concertId , SeatType seatType , User user) {
        Concert concert = findConcertById(concertId);
        if(concert.getTotalSeats() <= 0) {
            System.out.println("No Seats Available");
            return;
        }
        makeConcertSeatReservation(user, concert, seatType);
    }
}
