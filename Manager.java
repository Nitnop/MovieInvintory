import java.util.concurrent.CopyOnWriteArrayList;

abstract class Manager extends User {
    
    

    public static void Start(){
        
        
        UserInput.nextLine();
        //userchoice = 0;

        do {
        
            UserPromps.getUserprompts(true);
            
            userchoice = Idiotproofing.idiotResistnantInt();

        switch(userchoice){
            
            case 1:
            addMovie();
            

            case 2:
            //UserInput.nextLine();
            removeMovie(movieList);
            break;

            case 3:
            printMovieList();
            //UserInput.nextLine();
            //AtoZmovieTitleList = Movie.sortTitleAtoZ(movieList);
            //for(Movie movtitle : AtoZmovieTitleList){
            //    System.out.println(movtitle.title);
            //}                            
            break;

            case 4:
            //UserInput.nextLine();
            SearchTitle(movieList);
            break;

            case 5:
            //UserInput.nextLine();
            SearchActor(movieList);
            break;

            case 6:
            //UserInput.nextLine();
            SearchGenre(movieList);
            break;

            case 7:
            //UserInput.nextLine();
            SearchYear(movieList);
            break;

            //case 8:
            //break;

            default:
            System.out.println("Stop trying to break my shit and enter a number 1 - 8");

        }

    }while(userchoice != 8);


    }

    private static void addMovie(){
        UserInput.nextLine();
            System.out.println("Enter Movie title...");
            String title = UserInput.nextLine();
            System.out.println("Enter Movie main actor...");
            String actor = UserInput.nextLine();
            System.out.println("Enter Movie genre...");
            String genre = UserInput.nextLine();
            System.out.println("Enter Movie release year...");
            String year = UserInput.nextLine();
            movieList.add(Populator.addMovie(title, actor, genre, year));
            

    }

    private static void removeMovie(CopyOnWriteArrayList<Movie> movieList){
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


}
