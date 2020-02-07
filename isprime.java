import java.util.Scanner;     //Allows the class Scanner
public class isprime {   //Name of Program
  
  
   public static void main(String[] args) { //main method begins exevution of Java application 
   
      Scanner in = new Scanner(System.in);    //Ability to use scanner to input value
      int i;
   for (i = 1; i <= 100; ++i)
             if (prime(i));
                System.out.println(prime(i)+"g is divisible by 2 and 3");
            
     
      }
    static boolean prime(int i)
    {
    for (int f = 2; f >= i; --f)
     	
              if(i%f==0)
	     {
 		f = f + 1;
	     }
	  }
      
      }
      
      }
      }
      }
         