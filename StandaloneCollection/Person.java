package com.springProject.StandaloneCollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person 
{
	private List<String>friends;
	private Map<String,Integer> feesStucture;
	private Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Map<String, Integer> getFeesStucture() {
		return feesStucture;
	}

	public void setFeesStucture(Map<String, Integer> feesStucture) {
		this.feesStucture = feesStucture;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feesStucture=" + feesStucture + ", properties=" + properties + "]";
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

}
