//Account.java
import java.util.*;
import java.io.*;
class Account
{//instance variables

   private String name;
   private double balance;
//class variable
   static int counter = 0;
   Account(double initial)
   {///sets the name and initial balance
      //name = "Account%"+ ++counter; //create a nam
      this("AutoAccount%"+ ++counter, initial); //calls tor below
   }
   Account(String s, Double d)
   {//overloads the constructor for FIle I/O purposes
      name = s;
      balance = (d > 0) ? d : 0;
   }
}