//P3::Q2  Write a Java program using Set interface containing list of items and perform the 
//following operations: 
//a. Add items in the set.
//b. Insert items of one set in to other set.
//c. Remove items from the set
//d. Search the specified item in the set


package practical3;

import java.util.*;
public class SetExample2 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Cherry");
        set1.add("Grape");
        System.out.println("Set 1: " + set1);

        set2.addAll(set1);
        Scanner sc = new Scanner(System.in);
        System.out.println("Set 2: " + set2);
        
        set2.remove("Banana");
        System.out.println("Set 2 after removing Banana: " + set2);
	    
	    System.out.print("Enter the element you want to search from set2: ");
        String item = sc.next();
        if (set2.contains(item)) {
            System.out.println("Item " + item + " is present in Set 2");
        } else {
            System.out.println("Item " + item + " is not present in Set 2");
        }
        sc.close();
    }
}
