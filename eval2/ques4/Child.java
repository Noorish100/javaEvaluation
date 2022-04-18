package com.masai;

import java.util.Scanner;
public final class Child extends Java{
	@Override
	void method1(){
		System.out.println("child m1");
	}
	void method4() {
		System.out.println("m4 child");
	}
	
	
	
	public static void main(String[] args) {
		Java j1=new Child();
		
		j1.method1();
		j1.method2();
		j1.method3();
		((Child)j1).method4();
	}
	
	
	
	

}
