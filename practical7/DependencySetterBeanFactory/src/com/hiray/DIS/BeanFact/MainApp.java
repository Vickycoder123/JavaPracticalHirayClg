package com.hiray.DIS.BeanFact;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("Beans.xml");
		Employee emp = (Employee)factory.getBean("employeeDes");
		emp.display();
	}

}
