//Practical 3 Assignments on Set Interface
//P3::Q1 Write a Java program to create a Set containing list of items of type String and print 
//the items in the list using Iterator interface. Also print the list in reverse/ backword 
//direction.

package practical3;


import java.util.*;
public class SetExample{
	public static void main(String args[]){
		Set<String> set1 = new HashSet<String>();
		set1.add("One");
		set1.add("Two");
		set1.add("Three");
		set1.add("Four");
		set1.add("One");
		Iterator<String> itr = set1.iterator();
		System.out.println("Printing the set items using Iterator");
		while(itr.hasNext()){
			System.out.println("List element is: "+itr.next());
		}
		List<String> al = new ArrayList<String>();
		al.addAll(set1);
		ListIterator<String> litr = al.listIterator();
		System.out.println("Printing the set elements using list iterator in reverse order");
		while(litr.hasNext()){
			litr.next();
		}
		while(litr.hasPrevious()){
			System.out.println("List elements is: "+litr.previous());
		}
	}
}
