package com.springProject.withoutXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
		Employee emp = (Employee)context.getBean("id1");
		emp.printEmp();
		

	}

}
