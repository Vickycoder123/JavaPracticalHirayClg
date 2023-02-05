//P5::Q6 Write a Java program using Lambda Expression to concatenate two strings.

package practical5;

import java.util.*;
interface Concatenate{
	String concatenate(String str1,String str2);
}

public class LambdaEx6{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String1: ");
		String s1 = sc.next();
		System.out.print("Enter the String2: ");
		String s2 = sc.next();
		Concatenate c1 = (str1,str2)->(str1+" "+str2);
		System.out.println("Concatenation of two strings is: "+c1.concatenate(s1,s2));
		sc.close();
	}
}
