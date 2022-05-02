package com.masai;

//wait and notify method are used in two synchronised block when one
//synchornized block has to wait until its work get done after that it notify
//and and print the final and correct result

public class DeadLock {
	
	public static void main(String[] args) {
		A a1=new A();
		B b1=new B();
		
		ThreadA t1=new ThreadA(a1,b1);
		ThreadB t2=new ThreadB(a1,b1);
		t1.start();
		t2.start();
	}

}

class A{
	 public synchronized void funA(B b1){
		 System.out.println("fun a");
		 b1.fun2();
		 System.out.println("end a");
	 }
	 
	 public synchronized void fun1() {
		 System.out.println("inside a");
	 }
}

class B{
	 public synchronized void funB(A a1){
		 System.out.println("fun b");
		 a1.fun1();
		 System.out.println("end b");
	 }
	 
	 public synchronized void fun2() {
		 System.out.println("inside b");
	 }
}
class ThreadA extends Thread{
	A a1;
	B b1;
	
	public ThreadA(A a1,B b1) {
		this.b1=b1;
		this.a1=a1;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		a1.funA(b1);
	}
	
}

class ThreadB extends Thread{
	A a1;
	B b1;
	
	public ThreadB(A a1,B b1) {
		this.b1=b1;
		this.a1=a1;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		b1.funB(a1);
	}
	
}
