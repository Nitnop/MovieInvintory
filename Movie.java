import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class Movie {


    

    public Movie(){
        title = "null";
        actor = "null";
        genre = "null";
        year = "null";
    }

    public Movie(String titleIn, String actorIn, String genreIn, String yearIn){
        //Movie movie = new Movie();
        this.title = titleIn;
        this.actor = actorIn;
        this.genre = genreIn;
        this.year = yearIn;
        
    }
    static String titleSearch;
    static int numOfindexToRemove;
    protected String title;
    protected String actor;
    protected String genre;
    protected String year;
    static int searchHits;

    
    static Scanner UserInput = new Scanner(System.in);

    public void setTitle(){
        System.out.println("Enter movie title:");
        this.title = UserInput.next();
    }

    public void setActor(){
        System.out.println("Enter movie actor:");
        this.actor = UserInput.next();
    }    

    public void setGenre(){
        System.out.println("Enter movie genre:");
        this.genre = UserInput.next();
    }

    public void setYear(){
        this.year = UserInput.next();
    }

    static void setWorkingList(){

    }
    public String toString(){
        return "[" + title + ", " + actor + ", " + genre + ", " + year + "]";
    }

    public String getTitle(){
        return title;
    }
    public String getActor(){
        return actor;
    }
    public String getGenre(){
        return genre;
    }
    public String getYear(){
        return year;
    }
    public static ArrayList<Movie> sortTitleAtoZ(CopyOnWriteArrayList<Movie> movieList){
        ArrayList<Movie> AtoZmovieList = new ArrayList<Movie>(movieList);
        AtoZmovieList.sort(Comparator.comparing(Movie::getTitle));
        return AtoZmovieList;
    }
    public static ArrayList<Movie> sortTitleZtoA(CopyOnWriteArrayList<Movie> movieList){
        ArrayList<Movie> ZtoAmovieList = new ArrayList<Movie>(movieList);
        ZtoAmovieList.sort(Comparator.comparing(Movie::getTitle));
        Collections.reverse(ZtoAmovieList);
        return ZtoAmovieList;
    }
    public static ArrayList<Movie> sortActorAtoZ(CopyOnWriteArrayList<Movie> movieList){
        ArrayList<Movie> AtoZActorList = new ArrayList<Movie>(movieList);
        AtoZActorList.sort(Comparator.comparing(Movie::getActor));
        return AtoZActorList;
    }
    public static ArrayList<Movie> sortActorZtoA(CopyOnWriteArrayList<Movie> movieList){
        ArrayList<Movie> ZtoAActorList = new ArrayList<Movie>(movieList);
        ZtoAActorList.sort(Comparator.comparing(Movie::getActor));
        Collections.reverse(ZtoAActorList);
        return ZtoAActorList;
    }
    public static ArrayList<Movie> sortGenreAtoZ(CopyOnWriteArrayList<Movie> movieList){
        ArrayList<Movie> AtoZGenreList = new ArrayList<Movie>(movieList);
        AtoZGenreList.sort(Comparator.comparing(Movie::getGenre));
        return AtoZGenreList;
    }
    public static ArrayList<Movie> sortGenreZtoA(CopyOnWriteArrayList<Movie> movieList){
        ArrayList<Movie> ZtoAGenreList = new ArrayList<Movie>(movieList);
        ZtoAGenreList.sort(Comparator.comparing(Movie::getGenre));
        Collections.reverse(ZtoAGenreList);
        return ZtoAGenreList;
    }
    
    /* 
    public static void removeMovie(CopyOnWriteArrayList<Movie> movieList){
        System.out.println("What movie would you like to remove from the library? Enter title");
                        
        for (Movie mov : movieList){
            System.out.println(mov);
        }
                        
        titleSearch = UserInput.next();

        for (Movie movieTitle : movieList){

            if (movieTitle.getTitle() != null && movieTitle.getTitle().contains(titleSearch)){
                                                                
                System.out.println(movieTitle);                              
                numOfindexToRemove = movieList.indexOf(movieTitle);
                //System.out.println("Are you sure you want to delete " + movieTitle);
                //System.out.println("yes = 0\nno = 1");
                //int answer = UserInput.nextInt();
                movieList.remove(numOfindexToRemove);
            }                           
        }    
    }

    */

    public static void SearchTitle(CopyOnWriteArrayList<Movie> movieList){

        System.out.println("Enter the title you'd wish to find...");
        
        titleSearch = UserInput.next();

        
        for (Movie movieTitle : movieList){

            if (movieTitle.getTitle() != null && movieTitle.getTitle().contains(titleSearch)){
                                                                
                searchHits++;
                System.out.println(movieTitle);

                checkInStock();
            }

        }
        if (searchHits == 0){
            System.out.println("No results...");
        }
        searchHits = 0; 
    }

    public static void SearchActor(CopyOnWriteArrayList<Movie> movieList){
        
        System.out.println("Enter the actor you'd wish to find...");

        String ActorSearch = UserInput.next();

        for (Movie movieActor : movieList){

            if (movieActor.getActor() != null && movieActor.getActor().contains(ActorSearch)){
                                                                
                System.out.println(movieActor);
            }

            else {
                System.out.println("No results...");
            }
        }
    }

    public static void SearchGenre(CopyOnWriteArrayList<Movie> movieList){

        System.out.println("Enter the genre you'd wish to find...");

        String GenreSearch = UserInput.next();

        for (Movie movieGenre : movieList){

            if (movieGenre.getGenre() != null && movieGenre.getGenre().contains(GenreSearch)){
                                                                
                System.out.println(movieGenre);
            }

            else {
                System.out.println("No results...");
            }
        }
    }

    public static void SearchYear(CopyOnWriteArrayList<Movie> movieList){
        System.out.println("Enter the year you'd wish to find...");

        String YearSearch = UserInput.next();

        for (Movie movieYear : movieList){

            if (movieYear.getYear() != null && movieYear.getYear().equals(YearSearch)){
                                                                
                System.out.println(movieYear);
            }

            else {
                System.out.println("No results...");
            }
        }
    }

    public static void checkInStock(){
        System.out.println("Lest see if its in stock...");
        System.out.println(DVD.inStock());
        System.out.println(VHS.inStock());
        
        
    }

}