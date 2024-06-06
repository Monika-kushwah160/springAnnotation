package com.springProject.Stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student 
{
	@Value("Monika Kushwah")
	private String sname;
	@Value("Khargone")
	private String city;
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", city=" + city + "]";
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
