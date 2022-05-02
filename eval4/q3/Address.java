package com.masai;


import java.io.Serializable;

public class Address implements Serializable {
	
	 String state="bihar";  
	String city="patna";
	String pincode="44";
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String state, String city, String pincode) {
		super();
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}	
}