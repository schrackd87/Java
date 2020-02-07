//Primes.java

class pg3loops
{
   public static void main (String [] args)
      {
w  for (i = 1; i <= 100; ++i)
             if (prime(i));
                System.out.println(i+"g is divisible by 2 and 3");
            
                     
}
    static void prime(int i)  
    {        int counter=0; 	  
          for(i =i; i>=1; i--)
	  {
             if(i%i==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     //Appended the Prime number to the String
	     prime = prime + i + " ";
	  }	
     return true;
       }	
}
