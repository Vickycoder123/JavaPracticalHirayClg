package com.hiray.DIS.BeanFact;
public class Employee {
	private String name;
	private int age;
	private int salary;
	public Employee(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public Employee() {
		this.name = "Vikaskumar";
		this.age = 22;
		this.salary = 89000;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("Name="+name+"\n"+"Age="+age+"\n"+"Salary="+salary);
	}
	
	
}
