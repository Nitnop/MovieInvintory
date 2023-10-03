import java.util.Scanner;

public class Idiotproofing{

    

    static Scanner UserInput = new Scanner(System.in);

    public static int idiotResistnantInt(){
        
        while (!UserInput.hasNextInt()) UserInput.next();
        
        int choice = UserInput.nextInt();

        return choice;

    }


    
}
