
package fileioexample;


import java.io.*;//this is the package to import

public class FileIOExample {
    public static void main(String[] args) {
        // Define the file name- Where is the file going to be created?
     //Where would you want to create your file??
   String fileName = "example.txt";

 String filepath = "C:/Users/dengovender/OneDrive - ADvTECH Ltd/Desktop/VC WORK 2023/Example.txt";
     //Remember to change the back slash to foward slash
       
     // Write to the file
        try {
            FileWriter fileWriter = new FileWriter(filepath);
         //  FileWriter fileWriter = new FileWriter(fileName);
          
           //You use FileWriter to open the file for writing- in this case its creating the actual file
           
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//Is used to efficiently write text to a file
//Collects all the characters in memory first and then writes to textfile

//Here you could implement exception handling should something happen during writing
            
            // Text to be written to the file
            String textToWrite = "Hello, this is an example of file input and output in Java.";
            bufferedWriter.write(textToWrite);

            // Close the BufferedWriter to flush and close the file
            bufferedWriter.close();
            System.out.println("Text has been written to the file.");
            
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }

        // Read from the file
        try {
            //FileReader fileReader = new FileReader(fileName);
            FileReader fileReader = new FileReader(filepath);
            
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Read text from the file and print it
            String line;
            System.out.println("Reading from the file:");
            
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
//Here we using a while loop to read line by line and display
//It will continue reading until there are no more lines to read 
//(Indicated by readline returning null)
            
            // Close the BufferedReader
            bufferedReader.close();
            
        } catch (IOException e) {
            System.err.println("Error reading from the file: " + e.getMessage());
        }
    }
}

