package com.masai;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;
public class DOB {
	
	
	String AcceptAge(int y,int m,int d) throws MyException{
		DateTimeFormatter form=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		try {
		LocalDate dob=LocalDate.of(y, m, d);
		String o=dob.format(form);
		LocalDate c1=LocalDate.now();
		Period p=Period.between(dob, c1);
		ChronoUnit.YEARS.between(dob, c1);
		
		if(ChronoUnit.YEARS.between(dob, c1)>=18) {
			return "1";
			
		}
		
		else if(ChronoUnit.YEARS.between(dob, c1)<0) {
			throw new MyException("dob can not be in future");
		}
		else if(ChronoUnit.YEARS.between(dob, c1)==0) {
			return "h";
		}

		
		}catch(Exception e) {
			System.out.println("please pass date in proper  format");
		}
	 return "0";
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		DOB d1=new DOB();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter year");
		int a1=sc.nextInt();
		System.out.println("enter month");
		int a2=sc.nextInt();
		System.out.println("enter date");
		int a3=sc.nextInt();
		try {
		String age=d1.AcceptAge(a1,a2,a3);
		   if(age=="1") {
			System.out.println("you are eligible");
		   }
		   if(age =="h") {
			   System.out.println("Happy birthday, you are eligible");
			   
		   }
		}
		catch(MyException e) {
			
			System.out.println("invalid");
			
		}
		
	}

}

class  MyException extends Exception{
	
	MyException(String s){
		super(s);
	}
}
