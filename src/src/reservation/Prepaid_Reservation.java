package reservation;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import payment.Payment;

public class Prepaid_Reservation extends Reservation {


	public Prepaid_Reservation(String dateOfArrival, String dateOfDeparture, String type, int numberOfRoomsBooked) {
		super(dateOfArrival, dateOfDeparture, type, numberOfRoomsBooked);
		// TODO Auto-generated constructor stub
	}

	public double calculateTotalAmount() throws ParseException
	{
		//mydate.setTime(thedate);
		int diff = difference(dateOfArrival,dateOfDeparture);
		return((double)0.75*baseRate*diff);
	}
	
	public void create(Date doa,Date dod,String type,int norb)
	{
		
	}
	
	public boolean enterCreditCardDetails(String ccNumber) {
		//this must have a validating part too. 
		this.ccNumber = ccNumber;
		Payment pay = new Payment();
		return pay.createPayment(ccNumber);
	}
	
	public void enterGuestDetails(String name,String email)
	{
		//System.out.println("Prepaid mathod");
		super.enterGuestDetails(name, email);
	}
	
	public void updateReservation(boolean status) throws SQLException
	{
		super.updateReservation(status);	
		//super.enterCreditCardDetails(name, email);
	}

}
