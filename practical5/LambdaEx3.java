//P5::Q3 Write a Java program using Lambda Expression with multiple parameters to add two 
//numbers.

package practical5;
import java.util.*;
interface Calculate{
	int calculate(int a,int b);
}

public class LambdaEx3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers :");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		Calculate cal = (int a, int b)-> (a+b);
		int result = cal.calculate(num1,num2);
		System.out.println("The result is "+result);
		sc.close();
	}
}

