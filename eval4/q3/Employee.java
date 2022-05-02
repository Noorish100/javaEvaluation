package com.masai;


import java.io.Serializable;

//Create the Student bean class with the following fields: roll: Integer name: String address: Address 
//Student Has Address email: String password: String

public class Employee extends Address{
	
	 int empId = 2122;
     String empname = "noor";
	 String email = "n";
	private String password = "nooru636";
	
	void funx(){
		Address a = new Employee();
		System.out.println(a);
	}
	

	@Override
	public String toString() {
		return "Student [empid=" + empId + ", name=" + empname + ", email=" + email + ", state=" + state + ", city=" + city + ", pincode=" + pincode +"]";
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Employee(int empId, String empname, String email, String password) {
		super();
		this.empId = empId;
		this.empname = empname;
		this.email = email;
		this.password = password;
	}


}