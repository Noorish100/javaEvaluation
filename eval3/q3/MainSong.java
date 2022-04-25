package com.masai;
import java.util.ArrayList;
import java.util.Scanner;
public class MainSong {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("add song name1  ");
		String so2=sc.next();
		Song s1=new Song(so2);
		System.out.println("add song name2");
		String so12=sc.next();
		Song s2=new Song(so12);
		System.out.println("add song name3");
		String so=sc.next();
		Song s3=new Song(so);
		System.out.println("add song name4");
		String so14=sc.next();
		Song s4=new Song(so14);
		PlayList p1=new PlayList();
		
		p1.addSong(s1);
		p1.addSong(s2);
		p1.addSong(s3);
		p1.addSong(s4);
		
		System.out.println(p1.getClass());
		
		Song son=new Song();
		
	
		
	}
	
	
	
}
