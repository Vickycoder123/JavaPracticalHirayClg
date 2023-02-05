//Practical 2:: Assignments on List Interface
//P2::Q1 Write a Java program to create List containing list of items of type String and use for-
//--each loop to print the items of the list.
package practical2;

import java.util.*;

public class ListExample{
	public static void main(String args[]){
		List<String> al = new ArrayList<String>();
		al.add("Apple");
		al.add("Pineapple");
		al.add("Grapes");
		al.add("Strawberry");
		System.out.println("Printing the list items using for-each loop");
		for(String item: al){
			System.out.println("List element is: "+item);
		}
	}
}