//QuadtraticEquationPgrm.java
//MS-382 Fall 2016
//Developed in Java Language Bsic
//By: David Schrack
import java.util.Scanner;

import java.util.Scanner;

public class QuadtraticEquationPgrm

{
   public static void main(String[] args)
   {
            //This is to be able to solve the Quadratic Equation
            //For this program the fomula is Ax2+Bx+c=0
            //Numbers to be hard coded into this program are: A=
            //A=1 B=-8 C=15
      System.out.print("Welcome to the David Schrack's Quadtratic Equation Program v1.2");
      Scanner input = new Scanner (System.in);
      System.out.println("Given quadratic equation is: Ax2+Bx+C");
            
      int coA = 0;
      int coB = 0;
      int coC = 0;
                   
           /*
          System.out.print("Enter Value for A: "+A);
         A = input.nextInt();
              System.out.print("Enter Value for B: "+B);
          B = input.nextInt();
            System.out.print("Enter Value for C: "+C);
          C = input.nextInt();
        */
      System.out.print("Enter value for A: "); //User enters values for A
      coA = input.nextInt();
      System.out.print("Enter value for B: "); //User enters values for Bx
      coB = input.nextInt();
      System.out.print("Enter value for C: "); //User enters values for C
      coC = input.nextInt();
       double discriminant = Math.pow(coB, 2) - 4 * coA * coC;
                  
              
        if (discriminant < 0) {
   System.out.println("The equation has no real roots");
   System.exit(0);
}
           double R1 = (-coB + Math.sqrt(discriminant))/(2*coA);
      double R2 = (-coB - Math.sqrt(discriminant))/(2*coA);

      if ( discriminant >= 0)
       
      {
       System.out.println("The values of these roots entered are real and unequal");
      System.out.println("The number for the first root is as follows:"+R1);
      System.out.println("The number for the second root is as follows:"+R2);
      
       }
           else 
            {  
           System.out.println("Roots has only a single root"+R1);
           }
        
          }
}
           