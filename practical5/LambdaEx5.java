//P5::Q5 Write a Java program using Lambda Expression with or without return keyword.

package practical5;

import java.util.Scanner;

interface Area {
	double calculateArea(int length, int breadth);
}

public class LambdaEx5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lambda expression without using return");
		System.out.print("Enter the lenght of rectangle: ");
		int l = sc.nextInt();
		System.out.print("Enter the breadth of the rectangle: ");
		int b = sc.nextInt();
		Area a1 = (length, breadth) -> (length * breadth);
		System.out.println("Area of rectangle is " + a1.calculateArea(l, b));

		System.out.println("Lambda expression with using return");
		Area a2 = (length, breadth) -> {
			return length * breadth;
		};
		System.out.print("Enter the lenght of rectangle: ");
		l = sc.nextInt();
		System.out.print("Enter the breadth of the rectangle: ");
		b = sc.nextInt();
		System.out.println("Area of rectangle is " + a2.calculateArea(l, b));
		sc.close();
	}
}
