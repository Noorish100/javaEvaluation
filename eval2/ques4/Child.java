package com.masai;

import java.util.Scanner;
public final class Child extends Java{
	@Override
	void method1(){
		Java j1=new Child();
		Scanner sc=new Scanner(System.in);
		int k=j1.number;
		System.out.println("write no");
		k=sc.nextInt();
		if(k>0&&k<10) {
			System.out.println("no is"+k);
		}
		else {
			
			System.out.println("invalid no");
		}
	}
	void method4() {
		System.out.println(" child m4");
	}
	
	
	
	public static void main(String[] args) {
		Java j1=new Child();
		
		j1.method1();
		j1.method2();
		j1.method3();
		((Child)j1).method4();
	}
	
	
	
	

}
