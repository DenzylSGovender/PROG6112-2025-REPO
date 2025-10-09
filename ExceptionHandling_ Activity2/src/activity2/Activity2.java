
package activity2;

 import java.util.Scanner;
public class Activity2 {

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a double number: ");
            String input = scanner.nextLine();
            
            double number = Double.parseDouble(input);
            
            System.out.println("Entered number: " + number);
            
        } 
        
        catch (NumberFormatException ex) 
        {// System.err refers to the standard error stream in Java
            System.err.println("Invalid input. Please enter a valid double number.");
            double number = 0.0;
            
            System.out.println("Number set to 0.0");
        }

        scanner.close();
    }
}


