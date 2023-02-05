package practical1;
//P1::Q3 Write a Java Program to demonstrate Wildcards in Java Generics.

import java.util.*;
public class WildCardExample {
    public static void printList(List<? extends Number> list) {
        for (Object element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(12.23);
        doubleList.add(13.98);
        doubleList.add(56.238);
        
        //List<String> stringList = new ArrayList<>();
        //stringList.add("Hello");
        //stringList.add("World");
        
        System.out.print("Array list with integer Elements: ");
        printList(intList);
        System.out.print("Array list with Double Elements: ");
        printList(doubleList);
        //printList(stringList);
    }
}