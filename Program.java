package edu.sbcc.cs105;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Input the number of tickets you want to sell: ");
		int totalNum = scnr.nextInt();
		TicketSeller tSell = new TicketSeller(totalNum);
		int recieve = 1;
		while(recieve > -5) {
			System.out.println("Input requested tickets: ");
			int req = scnr.nextInt();
			recieve = tSell.requestTickets(req);
			if(recieve > 0) {
				System.out.printf("Thank you for your purchase. There are %d tickets remaining.\n",recieve);
			}
			else if(recieve == 0) {
				System.out.println("Thank you for your purchase. There are no tickets remaining.");
				int buyers = tSell.getNumberOfBuyers();
				System.out.printf("You have had %d buyers.",buyers);
				break;
			}
			else {
				System.out.println("Too many tickets requested, please try again.");
			}
			
		}

	}

}
