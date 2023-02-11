package com.dependency.CI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCI {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("DIConBeans.xml");
		Employee emp = (Employee)context.getBean("empdes");
		emp.display();
	}

}
