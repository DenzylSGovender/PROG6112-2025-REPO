
package myframe;


import javax.swing.*;
//import javax.swing.JButton;
//import javax.swing.JFrame;

public class MyFrame {
    public static void main(String[] args) {
        // Create a JFrame instance
        JFrame frame = new JFrame("My Frame");

        //Sometimes the Frame doesnt appear as normal so you will need to 
        //clean and build your application couple times
        
        // Set the size of the frame
        frame.setSize(500, 600);

        JButton button = new JButton("Click Me");
          // Add the button to the frame
        frame.add(button);
      
        JButton button2 = new JButton("Help Me");
           frame.add(button2);
          // Set the layout to null to manually set the position of the button
        frame.setLayout(null);
        
           // Set the position and size of the button
        button.setBounds(100, 100, 100, 50); // x, y, width, height
          button2.setBounds(200, 100, 100, 50); 
        // Make the frame visible
        frame.setVisible(true);
  
    }
}
