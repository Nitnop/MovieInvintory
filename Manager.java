public class Manager extends User {
    
    

    public static void Start(){
    
    
        do {
        
            UserPromps.getUserprompts(true);
        
            userchoice = Idiotproofing.idiotResistnantInt();

        switch(userchoice){
            
            case 1:
            addMovie();
            

            case 2:
            //UserInput.nextLine();
            Movie.removeMovie(movieList);
            break;

            case 3:
            //UserInput.nextLine();
            AtoZmovieTitleList = Movie.sortTitleAtoZ(movieList);
            for(Movie movtitle : AtoZmovieTitleList){
                System.out.println(movtitle);
            }                            
            break;

            case 4:
            //UserInput.nextLine();
            Movie.SearchTitle(movieList);
            break;

            case 5:
            //UserInput.nextLine();
            Movie.SearchActor(movieList);
            break;

            case 6:
            //UserInput.nextLine();
            Movie.SearchGenre(movieList);
            break;

            case 7:
            //UserInput.nextLine();
            Movie.SearchYear(movieList);
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



}
