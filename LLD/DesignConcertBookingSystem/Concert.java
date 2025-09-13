package LLD.DesignConcertBookingSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Concert {
    String concertId;
    String concertName;
    String concertDate;
    String concertTime;
    String artistName;
    int totalSeats;
    List<ConcertSeatReservation> bookedSeatReservations;
    List<Integer> listOfOpenSeats;

    Concert(String concertId, String concertName, String concertDate, String concertTime, String artistName, int totalSeats) {
        this.concertId = concertId;
        this.concertName = concertName;
        this.concertDate = concertDate;
        this.concertTime = concertTime;
        this.artistName = artistName;
        this.totalSeats = totalSeats;
        bookedSeatReservations = new ArrayList<>();
        listOfOpenSeats = new ArrayList<>();
    }

    public String getConcertId() {
        return concertId;
    }

    public void setConcertId(String concertId) {
        this.concertId = concertId;
    }

    public String getConcertName() {
        return concertName;
    }
    public void setConcertName(String concertName) {
        this.concertName = concertName;
    }
    public String getConcertDate() {
        return concertDate;
    }
    public void setConcertDate(String concertDate) {
        this.concertDate = concertDate;
    }
    public String getConcertTime() {
        return concertTime;
    }
    public void setConcertTime(String concertTime) {
        this.concertTime = concertTime;
    }
    public String getArtistName() {
        return artistName;
    }
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
    public int getTotalSeats() {
        return totalSeats;
    }
    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }
    public void addConcertSeatReservation(ConcertSeatReservation reservation) {
        bookedSeatReservations.add(reservation);
    }
    public List<Integer> getOpenSeats() {
        return listOfOpenSeats;
    }
    public void setOpenSeats() {
        for(int i = 1 ; i <= totalSeats ; i++) {
            listOfOpenSeats.add(i);
        }
        Collections.shuffle(listOfOpenSeats);
    }
    public int assignedUniqueSeatForConcert() {
        if(listOfOpenSeats.isEmpty()) {
            System.out.println("All seats for the concert is booked");
        }
        return listOfOpenSeats.remove(0).intValue();
    }
}
