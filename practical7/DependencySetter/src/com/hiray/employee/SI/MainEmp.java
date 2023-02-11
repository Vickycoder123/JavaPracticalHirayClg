package com.hiray.employee.SI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEmp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("BeansEmp.xml");
		Employee emp = (Employee)context.getBean("employeeDes");
		emp.display();
	}

}
