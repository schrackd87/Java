import java.util.Scanner;

public class Temp {


public static void main ( String[] args )
{
    Scanner input = new Scanner ( System.in );

    System.out.println("Enter your values to convert:");
    double tempCelsius = input.nextDouble();
    double tempFahrenheit = input.nextDouble();

 //call f


    System.out.printf("The temperature of celsius in Fahrenheit is %f.1\n", toFahrenheit(tempCelsius)); //call toFahrenheit here

    //call c

    System.out.printf("The temperature of fahrenheit in Celsius is %f.1\n", ( tempFahrenheit ));//call toCelsius here
}
public static double toFahrenheit( double tempCelsius )
{ 
    return(tempCelsius * 9.0 / 5.0) + 32;

}
public static double toCelsius( double tempFahrenheit )
{ 
    return ((5.0 / 9.0) * ( tempFahrenheit - 32 ));

}
