//Triangle.java
import java.util.Scanner;
class Quiz
{
   public static void main (String [] args)
      {
       System.out.println ("Triangle Hypotenuse");
       
       Scanner input = new Scanner (System.in);
             int a;
       int b;
                 System.out.print("Enter value for A: "); //User enters values for A
      a = input.nextInt();
      System.out.print("Enter value for B: "); //User enters values for Bx
      b = input.nextInt();
      
       double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b,2)); 

      System.out.print("The value for C is: "+c); //User enters values for C
         
      
       }
}