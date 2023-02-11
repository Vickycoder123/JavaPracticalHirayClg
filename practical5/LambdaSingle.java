//P5::Q2 Write a Java program using Lambda Expression with single parameters.

package practical5;

import java.util.Scanner;

interface Greets{
	void greet(String name);
}

public class LambdaSingle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string name: ");
		String n1= sc.nextLine();
		Greets greeting = (name)-> System.out.println("Hello "+name+"!");
		greeting.greet(n1);
		sc.close();
	}
}