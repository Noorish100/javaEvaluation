package com.masai;

import java.util.Scanner;

public class JaneQ2 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String k=",;:.?!";
		System.out.println("write article");
		String str=sc.nextLine();
		int c=0;
		int c1=0;
		int c2=0;
		String bag="";
	
		
	
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)==','||str.charAt(i)==';'||str.charAt(i)=='.'||str.charAt(i)=='?'||str.charAt(i)=='!') {
				c1++;
			}
			if(str.charAt(i)==' ') {
				c2++;
			}
		}
		System.out.println("no of unique words "+c1);
	
	
		
		String[] s1=str.split(" ");
		int c3=0;
		for(String i:s1) {
			if(i!=","&&i!="?"&&i!="."&&i!=";"&&i!="!") {
				c3++;
				System.out.println(i);
			}
		}
		System.out.println("no of words"+ c3);
		
	}
	
	
  
}
