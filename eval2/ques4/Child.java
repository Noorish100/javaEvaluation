package com.masai;

import java.util.Scanner;
public final class Child extends Java{
	Scanner sc=new Scanner(System.in);
	@Override
	void method1(){
		
			System.out.println("write no");
		int no=	sc.nextInt();
			Java j2=new Child();
		
		if(no>0&&no<10){

       System.out.println(sc.nextInt());

		}
		else{
				System.out.println("invalid no");
		}
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
