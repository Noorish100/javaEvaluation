package com.masai;

import java.util.List;
import java.util.Scanner;

public class MainofMobile {

	public static void main(String[] args) {
		Mobile m1=new Mobile();
		Scanner sc=new Scanner(System.in);
	
		int c=0;
		while(c<4) {
		
			System.out.println("enter companyname");
			String c1=sc.next();
			
			
			List<String> get=m1.getModels(c1);
			if(c==3) {
				for(String s:get) {
					System.out.println(s);
				}
			System.out.println("array"+get);
			}
			System.out.println("enter model");
			String mod=sc.next();
			String add=m1.addMobile(c1,mod);
			System.out.println("say stop");
			String y=sc.next();
			if(y=="yes") {
				break;
			}
		
			
			c++;
		}
		
	
		
	}
	
}
