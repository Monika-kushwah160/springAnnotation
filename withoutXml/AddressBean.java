package com.springProject.withoutXml;

public class AddressBean 
{
	private int homeNumber;
	private String city;
	private String state;
	public AddressBean(int homeNumber, String city, String state) {
		super();
		this.homeNumber = homeNumber;
		this.city = city;
		this.state = state;
	}
	@Override
	public String toString() {
		return "AddressBean [homeNumber=" + homeNumber + ", city=" + city + ", state=" + state + "]";
	}
	public AddressBean() {
		super();
		// TODO Auto-generated constructor stub
	}

}
