//P5::Q4 Write a Java program using Lambda Expression to calculate the following: 
//a. Convert Fahrenheit to Celcius
//b. Convert Kilometers to Miles.

package practical5;

import java.util.*;
interface TempConvert{
	double tempConvert(double temperature);
	
}
interface DistConvert{
	
	double distConvert(double distance);
}

public class LambdaEx4{
	public static void main(String args[]){
		TempConvert t1 = (temperature)->(((temperature-32)*5)/9);
		DistConvert d1 = (distance)->(distance * 0.621371);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the temperature in Fahrenheit: ");
		double temp = sc.nextDouble();
		System.out.print("The temperature in Celsius is "+String.format("%.2f", t1.tempConvert(temp))+" C\n");
		System.out.print("Enter the distance in kilometers: ");
		double dist = sc.nextDouble();
		System.out.print("The distance in miles is "+String.format("%.2f",d1.distConvert(dist))+" miles.");
		sc.close();
	}
}
