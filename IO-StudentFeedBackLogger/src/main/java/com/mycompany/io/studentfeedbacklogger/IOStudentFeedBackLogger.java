
package com.mycompany.io.studentfeedbacklogger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class IOStudentFeedBackLogger {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        try {
          
            FileWriter writer = new FileWriter("student_feedback.txt");

            System.out.println("=== Student Feedback Logger ===");
            System.out.print("Enter student name: ");
            String name = input.nextLine();

            System.out.print("Enter module name: ");
            String module = input.nextLine();

            System.out.print("Enter feedback: ");
            String feedback = input.nextLine();

           
            writer.write("Student: " + name + " | Module: " + module + " | Feedback: " + feedback );

            writer.close();
            System.out.println("Feedback saved successfully!");
 
                      
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        } finally {
            input.close();
        }

    }
}
