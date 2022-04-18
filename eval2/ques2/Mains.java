package com.masai;
import java.util.Scanner;
public class Mains {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Ticket t1=new Ticket();
		
		System.out.println("enter avl ticket");
		t1.setAvailableTickets(sc.nextInt());
		System.out.println("enter ticket id");
		t1.setTicketid(sc.nextInt());
		System.out.println("no of ticket");
		int not=sc.nextInt();
		System.out.println("enter price ");
		t1.setPrice(sc.nextInt());
		int pri=t1.calculateTicketcost(not);
		System.out.println("total price= "+pri);
		int p1=t1.getAvailableTickets();
		int p2=t1.getTicketid();
		System.out.println("available ticket "+p1);
		System.out.println("ticket id "+p2);
		System.out.println("no of ticket "+not);
		
		
		
	}

}
