

package com.mycompany.assignmentsupport;

import java.util.Scanner;


public class AssignmentSupport {

    public static void main(String[] args) {
         HeroManager manager = new HeroManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Superhero Battle Arena ===");
            System.out.println("1. Add a Hero");
            System.out.println("2. Search for a Hero");
            System.out.println("3. Update a Hero");
            System.out.println("4. Delete a Hero");
            System.out.println("5. View Hero Report");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            String choice = sc.nextLine();
            switch (choice) {
                case "1": manager.addHero(); break;
                case "2": manager.searchHero(); break;
                case "3": manager.updateHero(); break;
                case "4": manager.deleteHero(); break;
                case "5": manager.heroReport(); break;
                case "6": manager.exitApp(); break;
                default: System.out.println("Invalid choice. Try again!");
            }
        }
    }
    
}
