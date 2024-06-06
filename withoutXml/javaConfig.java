package com.springProject.withoutXml;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaConfig 
{
	@Bean(name = "id1")
	public Employee getEmp()
	{
		AddressBean ab = new AddressBean(121 ,"kgn","mp");
		Employee ab1 = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id,name,salary,desigination");
		int id = sc.nextInt();
		String name = sc.next();
		double salary = sc.nextDouble();
		String designation = sc.next();
		
		ab1.setEid(id);
		ab1.setEname(name);
		ab1.setSalary(salary);
		ab1.setDesignation(designation);
		ab1.setAdd(ab);
		return ab1;
	}

}
