//Micellaneous.java
//Allows the class Scanner
public class pg2chgcount {   //Name of Program
{
   public static void main (String [] args)
      {
       System.out.println ("count up from 10");
       int i = 0;
       String reply;
       Scanner input = new Scanner (System.in);
       char oh;
       do
       {
       System.out.print (" " + i);
       i = i + 1;
             System.out.print(" Continue? Please Select Yes or No");
             reply = input.next();
       oh = reply.charAt(0);
       }
       while (discriminant <= 10 && oh == 'y' || oh == 'Y');
       System.out.print("Count to 10 with while loop: ");
       i = 1
       while (i <= 10)
   {    System.out.print(i + " ");
   }
   System.out.print("Use a four loop to count to 10: ");
   for (int j = 1; j < 10;)
   }
         }
