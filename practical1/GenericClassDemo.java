package practical1;
//Practical 1: Assignments on Java Generics
//P1::Q1 Write a Java Program to demonstrate a Generic Class.

class GenericClass<T> {
    private T obj;
    
    public GenericClass(T obj) {
        this.obj = obj;
    }
    
    public T getObject() {
        return obj;
    }
    
    public void setObject(T obj) {
        this.obj = obj;
    }
}
public class GenericClassDemo{
	public static void main(String args[]){
		GenericClass<String> stringObject = new GenericClass<>("Hello World");
        System.out.println("Generic Class returns: "+stringObject.getObject());
		GenericClass<Integer> intObject = new GenericClass<>(5);
		
        System.out.println("Generic Class returns: "+intObject.getObject());
	}
}
