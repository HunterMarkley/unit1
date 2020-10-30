package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        Scanner input = new Scanner(System.in);


        System.out.println("Welcome to Dog facts please choose a fact (1-5)");
         int myInt = 0;
         String name = input.nextLine();
       
        if (myInt <= 1){
            System.out.println("Dogs can read out emotions");

        }
        
    }
}