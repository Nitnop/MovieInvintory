// replace populator class with read and write to txt file

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;


public class LoadUnload {

    static Scanner stdIn = new Scanner(System.in);
    Movie testObject;

    public static void loadFile(){
        System.out.println("Enter file name");
        try(ObjectInputStream fileIn = new ObjectInputStream(new FileInputStream(stdIn.nextLine())){
            while (true){
                testObject = (Movie) fileIn.readObject();
                testObject.display();
            }
        } // end try and close fileIn automatically
        catch (EOFException e){
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }
    } //end loadFile method

    
    public static void saveFile(ArrayList<Movie> saveMovie){
        System.out.println("Enter file name: ");

        try(ObjectInputStream fileOut = new ObjectInputStream(new FileInputStream(stdIn.nextLine())){
            while (true){
                fileOut.writeObject(saveMovie);
            }
        }
        catch (EOFException e){
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }
    }


}
