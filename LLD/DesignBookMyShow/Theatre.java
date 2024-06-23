package LLD.DesignBookMyShow;

import java.util.ArrayList;
import java.util.List;

import LLD.DesignBookMyShow.enums.City;

/**
 * Theatre
 */
public class Theatre {
    int threatId;
    City city;
    String address;

    // A theatre can have multiple screens.
    List<Screen> screens = new ArrayList<>();

    // A theatre can have multiple shows.
    List<Show> shows = new ArrayList<>();

    public int getThreatId() {
        return threatId;
    }

    public void setThreatId(int threatId) {
        this.threatId = threatId;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Screen> getScreens() {
        return screens;
    }

    public void setScreens(List<Screen> screens) {
        this.screens = screens;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }
}