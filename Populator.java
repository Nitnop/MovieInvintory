import java.util.concurrent.CopyOnWriteArrayList;

public class Populator {

// this would normally be readign in from a file and saving out to a file but I guess thats the final project for this class

    public static CopyOnWriteArrayList<Movie> startinglistMovie(){
        CopyOnWriteArrayList<Movie> movieList = new CopyOnWriteArrayList<Movie>();
        //Movie movie;
        movieList.add(new Movie("The hunt for red october", "Sean Connery", "Action", "1985" ));
        movieList.add(new Movie("Terminator", "Arnold Schwarzenegger", "Action", "1984"));
        movieList.add(new Movie("Indiana Jones and the Last Crusade", "Harrison Ford", "action", "1989"));
        movieList.add(new Movie("Akira", "Katsuhiro Otomo", "Sci-fi/Action", "1988"));
        movieList.add(new Movie("Hook", "Robin Williams", "Fantacy", "1991"));
        movieList.add(new Movie("Groundhog Day", "Bill Murray", "Comedy/Romance", "1993"));
        movieList.add(new Movie("Army of Darkness", "Bruce Campbell", "Horror/Fantasy", "1992"));
        movieList.add(new Movie("Buffy the Vampire Slayer", "Kristy Swanson", "Horror/Fantasy", "1992"));
        movieList.add(new Movie("Ghost", "Patrick Swayze", "Romance/Fantasy", "1990"));
        movieList.add(new Movie("Edward Scissorhands", "Johnny Depp", "Fantasy/Romance", "1990"));
        return movieList;
    }

    public static Movie addMovie(String titleIn, String actorIn, String genreIn, String yearIn){
        Movie movie = new Movie(titleIn, actorIn, genreIn, yearIn);
        return movie;
    }
}
