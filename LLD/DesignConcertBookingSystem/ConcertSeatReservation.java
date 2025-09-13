package LLD.DesignConcertBookingSystem;

public class ConcertSeatReservation {
    int ticketId;
    User user;
    Concert concert;
    Integer seatNo;
    SeatType seatType;

    ConcertSeatReservation(int ticketId , User user, Concert concert, Integer seatNo, SeatType seatType) {
        this.ticketId = ticketId;
        this.user = user;
        this.concert = concert;
        this.seatNo = seatNo;
        this.seatType = seatType;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Concert getConcert() {
        return concert;
    }

    public void setConcert(Concert concert) {
        this.concert = concert;
    }

    public Integer getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(Integer seatNo) {
        this.seatNo = seatNo;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }
}
