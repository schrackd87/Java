import java.util.Scanner;     //Allows the class Scanner
public class q3 {   //Name of Program
  
  
   public static void main(String[] args) { //main method begins exevution of Java application 
   
      Scanner in = new Scanner(System.in);    //Ability to use scanner to input value
      System.out.print("Enter 3 unique numbers");
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();
    
      if (a < b){
         if (b < c) {
            System.out.print(""+a+"<"+b+"<"+c);
      }
      else if (b  c) {
            System.out.print(""+c+"<"+b+"<"+a);
      }
      if (a < c) {
           System.out.print(""+b+"<"+a+"<"+c);
           }
           else {
                System.out.print(""+b+"<"+c+"<"+a);
           }
          
          
          
          }
           }
           }
           