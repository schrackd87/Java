//Schrack_Chapter4.java
//MS-382 Fall 2016
//Chapter 4
//Developed in Java Language Bsic
//By: David Schrack

import java.util.Scanner;     //Allows the class Scanner
public class schrack_chapter4 {   //Name of Program
  
  
   public static void main(String[] args) { //main method begins exevution of Java application 
   
      Scanner input = new Scanner(System.in);    //Ability to use scanner to input value
      int tempC;
      int tempF; 
      double temp = 0;
      int i = 0;
      String reply;
      char x;    
      
      do{
       
         System.out.print("Enter either 1. For Fahrenheit to Celcius Converstion and 2. For Celcius to Fahrenheit: ");     //Prompt user to select which converstion they want
         temp = input.nextInt();                                     //Ability to have users to input and read variables
      
      
         if (temp == 1) {
         //Have user select to convert Fahrenheit into Celcius
            System.out.print("Please enter number for Fahrenheit: ");     //Prompt user to select the cost of item
            tempC = input.nextInt();
            System.out.printf("The temperature is " +tempC+ " Fahrenheit in Ceclius is: %.1f\n", f2c(tempC));
         
         }
         else //Have user select to convert Celcius into Fahrenheit
            System.out.print("Please enter number for Celcius: ");     //Prompt user to select the cost of item
         tempF = input.nextInt();
         System.out.printf("The temperature is: " +tempF+ " Celcius in Fahrenheit is %.1f\n", c2f(tempF));
         
         System.out.print("Convert another temp?");    //Prompt User to enter y or n to continue
         reply = input.next();                    //Allow user to input a value to either enter y or n to continue
      
         x = reply.charAt(0);   
      }   
      while (i <= 1 && x == 'y');       //once user enter either y (yes) or n (no) it will either continue program or quits
   
   }
    
   public static double f2c(int tempC) //Convert F2C
   {
   
      return ((5.0 / 9.0) * ( tempC - 32 ));
   }
   
   public static double c2f(int tempF)//converts c2f
   {
      return(tempF * (9.0 / 5.0) + 32);
   }
}