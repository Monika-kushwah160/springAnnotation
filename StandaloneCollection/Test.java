package com.springProject.StandaloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
		 System.out.println("start program");
		 System.out.println();
		   ApplicationContext context= new ClassPathXmlApplicationContext("com/springProject/StandaloneCollection/StandaloneConfig.xml");
		   Person p = (Person)context.getBean("prsn",Person.class);
		   System.out.println(p);
		   System.out.println();
		   System.out.println(p.getFeesStucture());
		   System.out.println();
		   System.out.println(p.getProperties());

	}

}
