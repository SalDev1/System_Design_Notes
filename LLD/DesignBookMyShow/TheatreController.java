package LLD.DesignBookMyShow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import LLD.DesignBookMyShow.enums.City;

public class TheatreController {

    // A city will have multiple theatres.
    Map<City,List<Theatre>> cityVsTheatre;

    // Show me a list of allTheatres. 
    List<Theatre> allTheatres;

   TheatreController() {
      cityVsTheatre = new HashMap<>();
      allTheatres = new ArrayList<>();
   }

   void addTheatre(Theatre theatre, City city) {
     allTheatres.add(theatre);

     List<Theatre> theatres = cityVsTheatre.getOrDefault(city, new ArrayList<>());
     theatres.add(theatre);
     cityVsTheatre.put(city, theatres);
   }

   // Fetch all the shows from each theatre for the given movie.
   Map<Theatre,List<Show>> getAllShow(Movie movie , City city) {
     Map<Theatre,List<Show>> theatreVsShows = new HashMap<>();

     List<Theatre> theatres = cityVsTheatre.get(city);

     for(Theatre theatre : theatres) {
       List<Show> shows =  theatre.getShows();
       List<Show> movieShows = new ArrayList<>();

       for(Show show : shows) {
         if(show.movie.getId() == movie.getId()) {
            movieShows.add(show);
         }
       }
       // For each theatre , show a list of shows having this movie.
       theatreVsShows.put(theatre, movieShows);
     }
     return theatreVsShows;
   }

}
