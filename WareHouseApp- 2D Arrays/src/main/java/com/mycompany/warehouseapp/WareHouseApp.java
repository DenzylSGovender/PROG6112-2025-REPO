
package com.mycompany.warehouseapp;

import java.util.Scanner;
public class WareHouseApp {

    public static void main(String[] args) {
        
           // Create the 2D array representing the stock levels
        int[][] stock = {
            {10, 20, 30, 4},//Shoes
            {10, 25, 38, 14},// Shirts
            {10, 5, 3, 4}//Hats
        };
        
        String [] items= {"Shoes","Shirts","Hats"};
        
        //Print the stock table ( rows and columns)
        System.out.println("Stock received each week:" );
        
        
        for ( int row= 0; row < stock.length;row++)
        {
              for ( int col= 0; col < stock[row].length;col++)
              {
                  System.out.print(stock [row][col] + "\t" );  
              }
               System.out.println();  
        }
          System.out.println("--------------------------------------------" );
         
          //Print the total stock per item
        System.out.println("Total Stock per item" );
        
        for ( int row= 0; row < stock.length;row++)
        {
            int itemtotal=0;
              for ( int col= 0; col < stock[row].length;col++)
              {
               itemtotal +=  stock [row][col]; 
              }
               System.out.println( items[row] + " : " + itemtotal + " units");  
        }
   System.out.println("--------------------------------------------" );
        
         //Print a formatted report
        System.out.println("\n *********************Warehouse Inventory Report*********************" );
        System.out.println("Item \t\t Week1 \t\t Week2 \t\t Week3 \t\t Week4 \t\t Total" );
             
        for ( int row= 0; row < stock.length;row++)
        {
            int total= 0;
             System.out.print(items[row] + "\t\t");
              for ( int col= 0; col < stock[row].length;col++)
              {
                  System.out.print(stock [row][col] + "\t\t" );  
                  total += stock [row][col] ;   
              }
               System.out.println(total);  
        }
           
        
    }
}
