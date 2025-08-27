
package com.mycompany.assignmentsupport;

import java.util.ArrayList;
import java.util.Scanner;

public class HeroManager {
    private ArrayList<Hero> heroList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    
    public void addHero() {
        System.out.print("Enter Hero ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Hero Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Power Level (1-100): ");
        int power = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Special Ability: ");
        String ability = sc.nextLine();

        Hero h = new Hero(id, name, power, ability);
        heroList.add(h);
        System.out.println("Hero added successfully!\n");
    }

    // Search hero
    public void searchHero() {
        System.out.print("Enter Hero ID to search: ");
        String id = sc.nextLine();

        for (Hero h : heroList) {
            if (h.getId().equalsIgnoreCase(id)) {
                System.out.println("Hero found:\n" + h);
                return;
            }
        }
        System.out.println("No hero found with ID " + id);
    }

    // Update hero
    public void updateHero() {
        System.out.print("Enter Hero ID to update: ");
        String id = sc.nextLine();

        for (Hero h : heroList) {
            if (h.getId().equalsIgnoreCase(id)) {
                System.out.print("Enter New Name: ");
                h.setName(sc.nextLine());

                System.out.print("Enter New Power Level (1-100): ");
                h.setPowerLevel(Integer.parseInt(sc.nextLine()));

                System.out.print("Enter New Special Ability: ");
                h.setAbility(sc.nextLine());

                System.out.println("Hero updated successfully!");
                return;
            }
        }
        System.out.println("No hero found with ID " + id);
    }

    // Delete hero
    public void deleteHero() {
        System.out.print("Enter Hero ID to delete: ");
        String id = sc.nextLine();

        for (Hero h : heroList) {
            if (h.getId().equalsIgnoreCase(id)) {
                heroList.remove(h);
                System.out.println("Hero deleted successfully.");
                return;
            }
        }
        System.out.println("No hero found with ID " + id);
    }

    // Report
    public void heroReport() {
        System.out.println("\n=== Hero Battle Report ===");
        if (heroList.isEmpty()) {
            System.out.println("No heroes available.");
        } else {
            for (Hero h : heroList) {
                System.out.println(h + "\n----------------");
            }
        }
    }

    // Exit
    public void exitApp() {
        System.out.println("Exiting Battle Arena... Goodbye!");
        System.exit(0);
    }
}
