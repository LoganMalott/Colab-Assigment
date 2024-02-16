
package inputoutputexample;
import java.util.Scanner;
public class InputOutputExample {

    public static void main(String[] args) {
         //Declare Variables
         int num = 5;
         String name;
         double gpa = 3.54;   //double is essentially "float"
         boolean vote = true;
         //Constant Variables
         final int ENROLL = 32;  

         //Output
         System.out.print("Hello world");
         System.out.println("Hello world"); //apends a newline to the end (print doesn't)
         System.out.println("\nComputer\t\tProg II");
         System.out.println();
    
         //Gather input from the user using the keyboard
         Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.println("Your name is: " + name);
    }
    
}
