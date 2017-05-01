package reservation;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Prepaid_Reservation extends Reservation {


	public Prepaid_Reservation(String dateOfArrival, String dateOfDeparture, String type, int numberOfRoomsBooked) {
		super(dateOfArrival, dateOfDeparture, type, numberOfRoomsBooked);
		// TODO Auto-generated constructor stub
	}

	public double calculateTotalAmount() throws ParseException
	{
		Calendar mydate = new GregorianCalendar();
		Date doa = new SimpleDateFormat("mm-dd-yyyy", Locale.ENGLISH).parse(dateOfArrival);
		Date dod = new SimpleDateFormat("mm-dd-yyyy", Locale.ENGLISH).parse(dateOfDeparture);
		
		//mydate.setTime(thedate);
		int diff = (int)( (dod.getTime() - doa.getTime()) / (1000 * 60 * 60 * 24) );
		System.out.println("Baserate: "+baseRate);
		return((double)0.75*baseRate*diff);
	}
	
	public void create(Date doa,Date dod,String type,int norb)
	{
		
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
