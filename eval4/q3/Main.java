package com.masai;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class Main {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Employee s1 = new Employee();
		
		FileOutputStream fos=new FileOutputStream("emp.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s1);
		
		oos.close();
		
		System.out.println("a1 object is serailized");
	
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emp.txt"));
		Employee a2 = (Employee)ois.readObject();
		a2.funx();		

	}

}