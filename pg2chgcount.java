/*
Java Program 2
MS-382 Introduction to Java
By: David Schrack

*/
import java.util.Scanner;     //Allows the class Scanner
public class pg2chgcount {   //Name of Program
  
  
   public static void main(String[] args) { //main method begins exevution of Java application 

      Scanner input = new Scanner(System.in);    //Ability to use scanner to input value
         String reply;
      
      int amount; //enter the price paid(s)
      int q;      //variable for quarter(s)
      int d;      //variable for dimes(s)
      int n;      //variable for nickle(s)
      int p;      //variable for pennie(s)
      int change; //variable for the change
      int i = 1;
         char x;        //initiate charater for x
   
	
   do
   {
      System.out.print("Enter cost of item (in cents <=100): ");     //Prompt user to select the cost of item
      amount = input.nextInt();                                     //Ability to have users to input and read variables

         //Calculation
      change = 100 - amount;
      System.out.print("Change is: "+change+ " and consist of: "); //Display the change from the amount
    
         if (amount <= 100);{       //if statement to help determind how many of each coin 
      
         q = change / 25;
         
         			if (q > 0) {
				change = change % 25;
				System.out.println(q + " quarter(s)");
            } 
         d = change / 10; 
               if (d > 0);     {
				change = change % 10;
				System.out.println(d + " dime(s)");
            }
            	
         n = change / 5;
			if (n > 0) {
				change = change % 5;
				System.out.println(n + " nickel(s)");
			}
			p = change;{
			System.out.println(p + " penny(s)");
		}
   }
          System.out.print(" Continue? (y/n)");    //Prompt User to enter y or n to continue
       reply = input.next();                    //Allow user to input a value to either enter y or n to continue

       x = reply.charAt(0);                    
        
        }
    while (i <= 1 && x == 'y');       //once user enter either y (yes) or n (no) it will either continue program or quits
   }
   }