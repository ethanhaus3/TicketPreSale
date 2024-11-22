package edu.sbcc.cs105;

public class TicketSeller {
	public static int MAXIMUM_TICKETS_ALLOWED = 4;
	public static int TOO_MANY_TICKETS_REQUESTED = -1;
	
	int ticketQuan;
	int buyerNum = 0;
	
	public TicketSeller(int initialTicketAllotment) {
		this.ticketQuan = initialTicketAllotment;
	}
	
	public int requestTickets(int ticketRequest) {
		if(ticketRequest <= ticketQuan && ticketRequest <= MAXIMUM_TICKETS_ALLOWED) {
			ticketQuan = ticketQuan - ticketRequest;
			buyerNum++;
			return ticketQuan;
		}
		//else if(){
			//return TOO_MANY_TICKETS_REQUESTED;
		//}
		else {
			return TOO_MANY_TICKETS_REQUESTED;
		}
	}
		
	
	public int getNumberOfBuyers() {
		return buyerNum;
	}
}
