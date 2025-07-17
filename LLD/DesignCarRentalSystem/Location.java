package LLD.DesignCarRentalSystem;

public class Location {
    String address;
    int pinCode;
    String city;
    String state;
    String country;

    Location(String address, int pinCode, String city, String state, String country) {
        this.address = address;
        this.pinCode = pinCode;
        this.city = city;
        this.state = state;
        this.country = country;
    }
}
