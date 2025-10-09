
package activity;

import java.util.Scanner;
public class Activity {

 
    public static void main(String[] args) {
        String[] firstNames = {"Ally", "Ranvir", "Charlie", "Shaun", "Eve", "Charlene", "Grace", "Whitney"};
        Scanner scanner = new Scanner(System.in);

     try 
        {
            System.out.print("Enter an index (0-7) to retrieve a first name: ");
            int index = scanner.nextInt();

            if (index >= 0 && index < firstNames.length) 
            {
                String firstName = firstNames[index];
               
                System.out.println("First Name at index " + index + ": " + firstName);
            } 
            
            else 
            {
                System.out.println("Invalid index. Please enter a number between 0 and 7.");
            }
        } 
       
        catch (java.util.InputMismatchException ex) 
        {
            System.out.println("Invalid input. Please enter a valid integer index.");
        } 
        
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array index out of bounds. Please enter an index between 0 and 7.");
        }

        scanner.close();

    }
    
}
