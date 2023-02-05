
//Practical 4: Assignments on Map Interface
//P4::Q1 Write a Java program using Map interface containing list of items having keys and 
//associated values and perform the following operations:  x(MapExample)
//    a. Add items in the map.
//    b. Remove items from the map
//    c. Search specific key from the map
//    d. Get value of the specified key 
//    e. Insert map elements of one map in to other map.
//    f. Print all keys and values of the map.


package practical4;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int flag = 1;
        while (flag != -1) {
            System.out.print("Enter the key and values(String) separated by space :");
            map1.put(sc.nextInt(), sc.next());
            System.out.print("Enter -1 to exit input loop:");
            flag = sc.nextInt();
        }

        System.out.println("Map 1: " + map1);

        map2.putAll(map1);
        System.out.println("Map 2: " + map2);

        map2.remove(2);
        System.out.println("Map 2 after removing key 2: " + map2);
        System.out.print("Enter the key you want to check in Map 2: ");
        int key = sc.nextInt();
        if (map2.containsKey(key)) {
            System.out.println("Key " + key + " is present in Map 2");
        } else {
            System.out.println("Key " + key + " is not present in Map 2");
        }

        String value = map2.get(key);
        System.out.println("Value of key " + key + " is: " + value);

        for (Map.Entry<Integer, String> entry : map2.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        sc.close();
    }
}
