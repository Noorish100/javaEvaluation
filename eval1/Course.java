package com.masai;

public class Course {
      int courseid;
      String courseName;
      int courseFee;
	void displayCourseDetails() {
		System.out.println(courseid);
		System.out.println(courseName);
		System.out.println(courseFee);
	};
void authenticate(String x,String y) {
		if(x=="Admin"&&y=="1234") {
			Course d1=new Course();
			d1.courseid=10024;
			d1.courseName="masai";
			d1.courseFee=300000;
			d1.displayCourseDetails();
		}
		else {
			System.out.println("Invalid Username or password");
		}
	};
	
public static void main(String[] args) {
	
	Course d1=new Course();
	d1.authenticate("Admin","1234");
	d1.authenticate("user","9999");
}
	
}
