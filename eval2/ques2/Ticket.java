package com.masai;

public class Ticket {
  int ticketid;
  int price;
  int availableTickets;
  
  
  Ticket(){
	  
  }
  public int calculateTicketcost(int nooftickets) {
	  if(nooftickets>0) {
		 this.setAvailableTickets(this.availableTickets-nooftickets);
		  this.price=nooftickets*this.price;
				  return this.price;
	  }
	  return -1;
  }


public int getTicketid() {
	return ticketid;
}


public void setTicketid(int ticketid) {
	this.ticketid = ticketid;
}


public int getPrice() {
	return price;
}


public void setPrice(int price) {
	this.price = price;
}


public int getAvailableTickets() {
	return availableTickets;
}


public void setAvailableTickets(int availableTickets) {
	this.availableTickets = availableTickets;
}
  
  
}
