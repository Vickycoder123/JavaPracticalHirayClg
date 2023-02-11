//Practical 5:: Assignments on Lambda Expression
//P5:: Q1 Write a Java program using Lambda Expression to print ”Hello World”.


package practical5;

public class LambdaEx{
	public static void main(String args[]){
		Greeting greeting = ()->System.out.println("Hello World");
		greeting.greet();
	}
}

interface Greeting{
	void greet();
}
