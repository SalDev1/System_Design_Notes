package LLD.DesignBookMyShow;

import java.util.ArrayList;
import java.util.List;

public class Show {
    int show_id;
    Movie movie;
    Screen screen;
    int showStartTime;

    List<Integer> bookedSeatsIds = new ArrayList<>();

    public int getShow_id() {
        return show_id;
    }

    public void setShow_id(int show_id) {
        this.show_id = show_id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public int getShowStartTime() {
        return showStartTime;
    }

    public void setShowStartTime(int showStartTime) {
        this.showStartTime = showStartTime;
    }

    public List<Integer> getBookedSeatsIds() {
        return bookedSeatsIds;
    }

    public void setBookedSeatsIds(List<Integer> bookedSeatsIds) {
        this.bookedSeatsIds = bookedSeatsIds;
    }
}
