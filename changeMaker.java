import java.util.Scanner;
public class changeMaker {
    	/** 
           * 
           */
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      int amount;
      int q;
      int d;
      int n;
      int p;
      int reply;
      int change;
      char x;
   do{
      System.out.print("Enter the purchase price:");
      amount = input.nextInt();
      change = 100 - amount;
      System.out.print("Enter the change is: "+change);
    
         if (amount <= 100);{
      
         q = change / 25;
         
         			if (q > 0) {
				change = change % 25;
				System.out.println(q + " quarter's");
            }
            	
         d = change / 10; 
               if (d > 0);     {
				change = change % 10;
				System.out.println(d + " dime's");
            }
            	
         n = change / 5;
			if (n > 0) {
				change = change % 5;
				System.out.println(n + " nickel's");
			}
			p = change;{
			System.out.println(p + " pennies");
		}
   }
          
       System.out.print(" Continue? (y/n)");    //Prompt User to enter y or n to continue
       reply = input.next();                    //Allow user to input a value to either enter y or n to continue

       x = reply.charAt(0);                    
        
        }
    while (i <= 1 && x == 'y');       //once user enter either y (yes) or n (no) it will either continue program or quits
   }
   }
