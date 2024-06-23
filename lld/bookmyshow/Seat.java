package lld.bookmyshow;

import lld.bookmyshow.enums.SeatCategory;

public class Seat {
    int id;
    int row;
    SeatCategory SeatCategory;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getRow() {
        return row;
    }
    public void setRow(int row) {
        this.row = row;
    }
    public SeatCategory getSeatCategory() {
        return SeatCategory;
    }
    public void setSeatCategory(SeatCategory seatCategory) {
        SeatCategory = seatCategory;
    }
}
