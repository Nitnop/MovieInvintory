import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class User extends Movie{
    
    static String titleSearch;
    static Scanner UserInput = new Scanner(System.in);
    static int userchoice = UserInput.nextInt();
    static CopyOnWriteArrayList<Movie> movieList = new CopyOnWriteArrayList<Movie>();
    static ArrayList<Movie> AtoZmovieTitleList = new ArrayList<Movie>();
    


    public static void Start(){

        movieList = Populator.startinglistMovie();

        

        do {
            
            UserPromps.getUserprompts();
            
            userchoice = Idiotproofing.idiotResistnantInt();
            
            switch(userchoice){
                
                case 1:
                //UserInput.nextLine();
                Movie.SearchTitle(movieList);
                break;

                case 2:
                //UserInput.nextLine();
                Movie.SearchActor(movieList);
                break;

                case 3:
                //UserInput.nextLine();
                Movie.SearchGenre(movieList);
                break;

                case 4:
                //UserInput.nextLine();
                Movie.SearchYear(movieList);
                break;

                case 5:
                //UserInput.nextLine();
                    AtoZmovieTitleList = Movie.sortTitleAtoZ(movieList);
                    for(Movie movtitle : AtoZmovieTitleList){
                        System.out.println(movtitle);
                    }                            
                    break;

                default:
                System.out.println("Stop trying to break my shit and enter a number 1 - 6");
            }
                
        }while(userchoice != 6);

    }    

    
}
