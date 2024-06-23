package lld.bookmyshow;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lld.bookmyshow.enums.City;
import lld.bookmyshow.enums.SeatCategory;

public class BookMyShow {
    MovieController movieController;
    TheatreController theatreController;

    BookMyShow() {
       movieController = new MovieController();
       theatreController = new TheatreController();
    }

    // During the initialization of the BookMyShow , we want to invoke / preload
    // movies using createMovies method. 
    private void createMovies() {
        
        // create Movie 1;
        Movie avengers = new Movie();
        avengers.setId(1);
        avengers.setMovieName("AVENGERS");
        avengers.setMovieDurationInMinutes(128);

        // create movie 2
        Movie avatar = new Movie();
        avatar.setId(2);
        avatar.setMovieName("AVATAR");
        avatar.setMovieDurationInMinutes(188);

        // Add the movies along with the city name.
        movieController.addMovie(avatar, City.Bangalore);
        movieController.addMovie(avatar, City.Delhi);
        movieController.addMovie(avengers, City.Bangalore);
        movieController.addMovie(avengers, City.Delhi);
    }

    private void createTheatre() {
        Movie avengerMovie = movieController.getMovieByName("AVENGERS");
        Movie avatarMovie = movieController.getMovieByName("AVATAR");


        // Create InoxTheatre
        Theatre inoxTheatre = new Theatre();
        inoxTheatre.setThreatId(1);
        inoxTheatre.setScreens(createScreen());
        inoxTheatre.setCity(City.Bangalore);

        List<Show> inoxShows = new ArrayList<>();
        Show inoxMorningShow = createShows(1,inoxTheatre.getScreens().get(0),avengerMovie,8);
        Show inoxEveningShow = createShows(2,inoxTheatre.getScreens().get(0),avatarMovie,16);

        inoxShows.add(inoxMorningShow);
        inoxShows.add(inoxEveningShow);
        inoxTheatre.setShows(inoxShows);


        // Create PVR Theatre.
        Theatre pvrTheatre = new Theatre();
        pvrTheatre.setThreatId(1);
        pvrTheatre.setScreens(createScreen());
        pvrTheatre.setCity(City.Delhi);

        List<Show> pvrShows = new ArrayList<>();
        Show pvrMorningShow = createShows(1,pvrTheatre.getScreens().get(0),avengerMovie,8);
        Show pvrEveningShow = createShows(2,pvrTheatre.getScreens().get(0),avatarMovie,16);
        pvrShows.add(pvrMorningShow);
        pvrShows.add(pvrEveningShow);
        pvrTheatre.setShows(pvrShows);

        theatreController.addTheatre(inoxTheatre, City.Bangalore);
        theatreController.addTheatre(pvrTheatre, City.Delhi);
    }

    // Creating a screen in a theatre for a movie to be shown.
    private List<Screen> createScreen() {
        List<Screen> screens = new ArrayList<>();
        Screen screen1 = new Screen();

        screen1.setId(1);
        screen1.setSeats(createSeats());
        screens.add(screen1);

        return screens;
    }

    // Creating a show with the movie name + screen name + showTimings.
    private Show createShows(int showId , Screen screen , Movie movie , int showStartTime) {
        Show newShow = new Show();
        newShow.setShow_id(showId);
        newShow.setScreen(screen);
        newShow.setMovie(movie);
        newShow.setShowStartTime(showStartTime);
        
        return newShow;
    }


    // Creating 100 seats in each screen for each movie show.
    private List<Seat> createSeats() {
        List<Seat> seats = new ArrayList<>();

        //1 to 40 : SILVER
        for (int i = 0; i < 40; i++) {
            Seat seat = new Seat();
            seat.setId(i);
            seat.setSeatCategory(SeatCategory.SLIVER);
            seats.add(seat);
        }

        //41 to 70 : SILVER
        for (int i = 40; i < 70; i++) {
            Seat seat = new Seat();
            seat.setId(i);
            seat.setSeatCategory(SeatCategory.GOLD);
            seats.add(seat);
        }

        //1 to 40 : SILVER
        for (int i = 70; i < 100; i++) {
            Seat seat = new Seat();
            seat.setId(i);
            seat.setSeatCategory(SeatCategory.PLATINUM);
            seats.add(seat);
        }

        return seats;

    }

    void initialize() {
        createMovies();
        createTheatre();
    }

    private void createBooking(City userCity , String movieName) {
        // 1. search the movie by location.
        List<Movie> movies = movieController.getMovieByCity(userCity);

        // 2. select the movie which you want to see , I want to see Avengers.
        Movie interestedMovie = null;
        for(Movie movie : movies) {
            if(movie.getMovieName().equals(movieName)) {
                interestedMovie = movie;
            }
        }

        // 3. Fetch all the theatres running this particular movie in specified city. 
        Map<Theatre,List<Show>> showsTheatreWise = theatreController.getAllShow(interestedMovie, userCity);
        
        // 4. Choose the particular show user selects to watch the movie. 
        // For now , we select the first key-value pair of the showsTheatreWise. 
        Map.Entry<Theatre,List<Show>> entry = showsTheatreWise.entrySet().iterator().next();
        List<Show> runningShows = entry.getValue();
        Show interestedShow = runningShows.get(0);


        // 5. Select the seat.
        int seatNumber = 30;
        List<Integer> bookSeats = interestedShow.getBookedSeatsIds();

        // If the seat is not selected , then only book the seat. 
        if(!bookSeats.contains(seatNumber)) {

            // start the payment process.
            bookSeats.add(seatNumber);

            Booking booking = new Booking();
            List<Seat> myBookedSeats = new ArrayList<>();

            // Show all the selected seats for the particular screen made by the user.
            // Seats are selected on the particular screen where the movie will be showned.
            for(Seat screenSeat : interestedShow.getScreen().getSeats()) {
                if(screenSeat.getId() == seatNumber) {
                    myBookedSeats.add(screenSeat);
                }
            }

            booking.setBookedSeats(myBookedSeats);
            booking.setShow(interestedShow);
        }
        else {
            System.out.println("Seat already booked , try again");
            return;
        }
        System.out.println("BOOKING SUCCESSFUL");
    }

    public static void main(String[] args) {
        BookMyShow bookMyShow = new BookMyShow();

        bookMyShow.initialize();
        bookMyShow.createBooking(City.Bangalore, "AVENGERS");
        bookMyShow.createBooking(City.Bangalore, "AVENGERS");
    }
}
