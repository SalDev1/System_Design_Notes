package LLD.DesignCarRentalSystem;

public class Bill {
    
    Reservation reservation;
    double totalBillAmount;
    boolean isBillPaid;

    Bill(Reservation reservation) {
        this.reservation = reservation;
        this.totalBillAmount = computeBillAmount();
        this.isBillPaid = false;
    }

    private double computeBillAmount() {
       return 100.0;
    }
}
