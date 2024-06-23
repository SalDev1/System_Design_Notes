package LLD.DesignBookMyShow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import LLD.DesignBookMyShow.enums.City;

public class MovieController {

    Map<City,List<Movie>> cityVsMovies; // List of all movies available in a certain city.
    List<Movie>allMovies;  // List of all the movies available.

    
    MovieController() {
        cityVsMovies = new HashMap<>();
        allMovies = new ArrayList<>();
    }

    void addMovie(Movie movie , City city) {
        
        allMovies.add(movie);

        List<Movie> movies = cityVsMovies.getOrDefault(city,new ArrayList<>());
        movies.add(movie);
        cityVsMovies.put(city,movies);
    }

    Movie getMovieByName(String movieName) {
        for(Movie movie : allMovies) {
            if(movie.getMovieName().equals(movieName)) {
                return movie;
            }
        }
        return null;
    }

    // Helps you fetch all the movies running in the specific city.
    List<Movie> getMovieByCity(City city) {
        return cityVsMovies.get(city);
    }

    // ALL CRUD Operations down below.
}
