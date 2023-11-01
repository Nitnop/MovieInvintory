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

        movieList = LoadUnload.loadMoviesFromFile();
        //UserInput.next();
        userchoice = 0;

        while(userchoice != 6) {
            
            UserPromps.getUserprompts();
            
            userchoice = Idiotproofing.idiotResistnantInt();
            
            switch(userchoice){
                
                case 1:
                //UserInput.nextLine();
                SearchTitle(movieList);
                break;

                case 2:
                //UserInput.nextLine();
                SearchActor(movieList);
                break;

                case 3:
                //UserInput.nextLine();
                SearchGenre(movieList);
                break;

                case 4:
                //UserInput.nextLine();
                SearchYear(movieList);
                break;

                case 5:

                printMovieList();
                /*UserInput.nextLine();
                    AtoZmovieTitleList = Movie.sortTitleAtoZ(movieList);
                    System.out.println("\n");
                    for(Movie movtitle : AtoZmovieTitleList){
                        System.out.println(movtitle);
                    }
                    System.out.println("\n");  */                          
                    break;

                case 6:

                System.out.println("Exiting....");
                System.exit(0);
                break;

                

                default:
                
                System.out.println();
                System.out.println();
                System.out.println("Stop trying to break my shit and enter a number 1 - 6");
                System.out.println();
                System.out.println();
            }
                
        }
        //while(userchoice != 6);

    }
    
    public static void printMovieList(){
        AtoZmovieTitleList = Movie.sortTitleAtoZ(movieList);
        System.out.println("\n");
        for(Movie movtitle : AtoZmovieTitleList){
            System.out.println(movtitle);
            }
        System.out.println("\n");
        }
    
}
