package com.springProject.withoutXml;

public class Employee 
{
	private int eid;
	private String ename;
	private double salary;
	private String designation;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public AddressBean getAdd() {
		return add;
	}

	public void setAdd(AddressBean add) {
		this.add = add;
	}

	//dependency inject in the form of object
	private AddressBean add;

	public void printEmp()
	{
		
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(salary);
		System.out.println(designation);
		System.out.println(add);
	}

}
