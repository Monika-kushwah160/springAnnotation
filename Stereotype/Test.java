package com.springProject.Stereotype;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
		 ApplicationContext context= new ClassPathXmlApplicationContext("com/springProject/Stereotype/StereotypeConfig.xml");
		 Student s = (Student)context.getBean("student",Student.class);
		 System.out.println(s);
		
	}

}
