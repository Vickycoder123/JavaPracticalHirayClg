package practical1;
//P1::Q2 Write a Java Program to demonstrate Generic Methods.
public class GenericMethods {
    
    
    public static <T> void printArray(T[] inputArray) {
        for (T element : inputArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        String[] stringArray = { "Hello", "World" };
        Character[] charArray = { 'H', 'e', 'l', 'l', 'o' };
        
        System.out.println("Elements of intArray: ");
        printArray(intArray);
        System.out.println("Elements of stringArray: ");
        printArray(stringArray);
        System.out.println("Elements of charArray: ");
        printArray(charArray);
    }
}