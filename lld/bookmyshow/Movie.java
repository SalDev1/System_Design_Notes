package lld.bookmyshow;

/**
 * Movie
 */
public class Movie {
    int id;
    String movieName;
    int movieDurationInMinutes;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getMovieName() {
        return movieName;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public int getMovieDurationInMinutes() {
        return movieDurationInMinutes;
    }
    public void setMovieDurationInMinutes(int movieDurationInMinutes) {
        this.movieDurationInMinutes = movieDurationInMinutes;
    }
}