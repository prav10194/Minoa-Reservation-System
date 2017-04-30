package controller;

import java.util.Date;
import java.util.Scanner;

import reservation.Prepaid_Reservation;
import reservation.Reservation;

public class Controller {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date of Arrival: ");
		String doa = sc.nextLine();
		System.out.println();
		System.out.println("Enter Date of Departure : ");
		String dod = sc.nextLine();
		System.out.println();
		System.out.println("Type of Reservation : ");
		String type = sc.nextLine();
		System.out.println();
		System.out.println("No of Rooms Needed : ");
		int norb = sc.nextInt();
		enterReservationDetails(doa, dod, type, norb);
	}

	public Reservation createNewSession() {
		return null;
	}

	public static void enterReservationDetails(String doa, String dod, String type, int norb) {
		type = type.toLowerCase();
		switch (type) {
		case "prepaid":
			Prepaid_Reservation p=new Prepaid_Reservation(doa, norb, type, dod);
			
			break;
		case "sixty days in advance":

			break;
		case "conventional":

			break;
		case "incentive":

			break;
		}
	}

	public void enterGuestDetails(String name, String email) {

	}

	public void updatePaymentStatus(boolean isPaymentMade) {

	}

	public boolean enterCreditCardDetails(String ccNumeber) {
		return true;
	}

	public void updateReservation(boolean status) {

	}

	public void endSession() {

	}
}
