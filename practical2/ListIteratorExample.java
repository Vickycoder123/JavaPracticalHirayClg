package practical2;

//P2::Q2 Write a Java program to create List containing list of items and use ListIterator 
//interface to print items present in the list. Also print the list in reverse/ backword 
//direction.

import java.util.*;

public class ListIteratorExample{
	public static void main(String args[]){
		List<String> al = new ArrayList<String>();
		al.add("Apple");
		al.add("Pineapple");
		al.add("Grapes");
		al.add("Strawberry");
		ListIterator<String> litr = al.listIterator();
		System.out.println("Printing the list items using ListIterator in forward direction");
		while(litr.hasNext()){
			System.out.println("List element is: "+litr.next());
		}
		System.out.println("Printing the list elements using list iterator in reverse order");
		while(litr.hasPrevious()){
			System.out.println("List elements is: "+litr.previous());
		}
	}
}
