//import java.util.ArrayList;
import java.util.Scanner;
//import java.util.concurrent.CopyOnWriteArrayList;

public class FinalProjectDriver {
    
    static Scanner UserInput = new Scanner(System.in);
    static int managerPIN = 1234;
    static Boolean manager = false;
    //static CopyOnWriteArrayList<Movie> movieList = new CopyOnWriteArrayList<Movie>();
    //static ArrayList<Movie> AtoZmovieTitleList = new ArrayList<Movie>();
    static int userpassword;
    //static String title;
    //static String actor;
    //static String genre;
    //static String year;
    //static String titleSearch;
    //static int numOfindexToRemove;

    public static void main(String[] args){
        
        //movieList = Populator.startinglistMovie();

        // user needs a value probably bool and varriable call manager

        System.out.println("Login = 0\nContinue without login = 1");

        int userchoice = UserInput.nextInt();

        switch(userchoice){
            case 0:
            System.out.println("Enter Pin1:");
            userpassword = Idiotproofing.idiotResistnantInt();
            if(userpassword == managerPIN){
                
                Manager.Start();
                
                //manager = true;
                //System.out.println("Welcome Manager");
                
                /* 
                do {
                    UserPromps.getUserprompts(manager);
                    userchoice = UserInput.nextInt();

                    switch(userchoice){
                        
                        case 1:

                        UserInput.nextLine();
                        System.out.println("Enter Movie title...");
                        title = UserInput.nextLine();
                        System.out.println("Enter Movie main actor...");
                        actor = UserInput.nextLine();
                        System.out.println("Enter Movie genre...");
                        genre = UserInput.nextLine();
                        System.out.println("Enter Movie release year...");
                        year = UserInput.nextLine();
                        movieList.add(Populator.addMovie(title, actor, genre, year));
                        break;

                        case 2:
                        UserInput.nextLine();
                        Movie.removeMovie(movieList);
                        break;

                        case 3:
                        UserInput.nextLine();
                        AtoZmovieTitleList = Movie.sortTitleAtoZ(movieList);
                        for(Movie movtitle : AtoZmovieTitleList){
                            System.out.println(movtitle);
                        }                            
                        break;

                        case 4:
                        UserInput.nextLine();
                        Movie.SearchTitle(movieList);
                        break;

                        case 5:
                        UserInput.nextLine();
                        Movie.SearchActor(movieList);
                        break;

                        case 6:
                        UserInput.nextLine();
                        Movie.SearchGenre(movieList);
                        break;

                        case 7:
                        UserInput.nextLine();
                        Movie.SearchYear(movieList);
                        break;

                        case 8:
                        break;

                        default:
                        System.out.println("Stop trying to break my shit and enter a number 1 - 8");

                    }

                }while(userchoice != 8);
                */
            }
            else{
                User.Start();

                //System.out.println("Incorect password");
            }

            case 1:

            User.Start();
            //System.out.println("Welcome User");
            //UserPromps.getUserprompts();
            /* 
            do {
                UserPromps.getUserprompts(!manager);
                userchoice = UserInput.nextInt();

                switch(userchoice){
                    
                    case 1:
                    UserInput.nextLine();
                    Movie.SearchTitle(movieList);
                    break;

                    case 2:
                    UserInput.nextLine();
                    Movie.SearchActor(movieList);
                    break;

                    case 3:
                    UserInput.nextLine();
                    Movie.SearchGenre(movieList);
                    break;

                    case 4:
                    UserInput.nextLine();
                    Movie.SearchYear(movieList);
                    break;

                    case 5:
                    UserInput.nextLine();
                        AtoZmovieTitleList = Movie.sortTitleAtoZ(movieList);
                        for(Movie movtitle : AtoZmovieTitleList){
                            System.out.println(movtitle);
                        }                            
                        break;

                    default:
                    System.out.println("Stop trying to break my shit and enter a number 1 - 6");
                }
                    
            }while(userchoice != 6);
            */
        }
        

        




        // movie object needs title, leading actor, release year, genre

        //toDo:user input and validation probably make a method I can reuse

        //toDo switch statement to fire off Driven

        //method to add movie object

        //method to remove movie object

        //method to set movie title

        //method to set movie actor

        //method to set movie genre

        //method to set movie relese year

        // method to search for a movie name and print it and display it A to Z or Z to A

        // method to search for a movie genre and print it and display it A to Z or Z to A
        
        // method to search for a movie actor and print it and display it A to Z or Z to A

        //catch statement

        //some exit text

        

    }
    
}
