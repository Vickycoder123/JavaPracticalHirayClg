package com.hiray.employee.SI;

public class Employee {
	private String name;
	private int age;
	private int salary;
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
