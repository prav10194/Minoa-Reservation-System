package reservation;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import payment.Payment;

public class Conventional extends Reservation{

	
	
	public Conventional(String dateOfArrival, String dateOfDeparture, String type, int numberOfRoomsBooked) {
		super(dateOfArrival, dateOfDeparture, type, numberOfRoomsBooked);
		// TODO Auto-generated constructor stub
	}

	public double calculateTotalAmount() throws ParseException
	{
		int diff=difference(dateOfArrival,dateOfDeparture);
		return((double)(baseRate*diff));
	}
	
	public void create(Date doa,Date dod,String type,int norb)
	{
		
	}
	
	public boolean enterCreditCardDetails(String ccNumber) {
		this.ccNumber = ccNumber;
		Payment pay = new Payment();
		return pay.createPayment(ccNumber);
	}
	
	
	public void enterGuestDetails(String name,String email)
	{
		super.enterGuestDetails(name, email);	
	}
	
	public void updateReservation(boolean status) throws SQLException
	{
		super.updateReservation(status);	
	}

}
