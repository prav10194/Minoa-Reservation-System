package controller;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import reservation.Reservation;

public class Controller {

	static Reservation R = null;

	public static void main(String args[]) throws ParseException, SQLException {
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
		R = enterReservationDetails(doa, dod, type, norb);
		
		//Setting Current Date
		String timeStamp = new SimpleDateFormat("MM-dd-yyyy").format(Calendar.getInstance().getTime());
		R.setDateOfBooking(timeStamp);
		
		if (R != null) {
			// DO SOMETHING
			System.out.println("Room is Available.\nTotal Amount : " + R.getAmount());
			sc.nextLine();
			System.out.println("Enter Name: ");
			String name = sc.nextLine();
			System.out.println();
			System.out.println("Enter Email : ");
			String email = sc.nextLine();
			System.out.println();

			enterGuestDetails(name, email);
			System.out.println("Enter ccNumber : ");
			String ccNumber = sc.nextLine();
			if (enterCreditCardDetails(ccNumber)) {
				System.out.println("Payment Successfull");
				updatePaymentStatus(true);
				updateReservation(true);
			}
		} else {
			System.out.println("Room Not Availiabilty");
		}

	}

	public Reservation createNewSession() {
		return null;
	}

	public static Reservation enterReservationDetails(String doa, String dod, String type, int norb) throws ParseException, SQLException {
		Reservation R = new Reservation(doa, dod, type, norb);
		
		//System.out.println("Date: "+R.getDateOfBooking());
		R = R.enterReservationDetails(doa, dod, type, norb);
		if (R != null) {
			return R;
		} else {
			return null;
		}

	}

	public static void enterGuestDetails(String name, String email) {

		R.enterGuestDetails(name, email);
	}

	public static void updatePaymentStatus(boolean isPaymentMade) {
		R.updatePaymentStatus(isPaymentMade);
	}

	public static boolean enterCreditCardDetails(String ccNumber) {

		return R.enterCreditCardDetails(ccNumber);

	}

	public static void updateReservation(boolean status) throws SQLException {
		R.updateReservation(status);
	}

	public void endSession() {

	}
}
