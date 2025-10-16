/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.writereadexample;

import java.io.*;

public class WriteReadExample {
    public static void main(String[] args) {
        try {
            // Write to a file
            FileWriter writer = new FileWriter("students.txt");
            writer.write("Denzyl Govender\nJohn Wick\nPuff Daddy");
            writer.close();
            System.out.println("File written successfully!");

            // Read from the file
            FileReader reader = new FileReader("students.txt");
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Student: " + line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
