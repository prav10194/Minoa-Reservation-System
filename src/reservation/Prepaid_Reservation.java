package reservation;

import java.util.Date;

public class Prepaid_Reservation extends Reservation {


	public Prepaid_Reservation(String dateOfArrival, int numberOfRoomsBooked, String type, String dateOfDeparture) {
		super(dateOfArrival, numberOfRoomsBooked, type, dateOfDeparture);
		// TODO Auto-generated constructor stub
	}

	public double calculateTotalAmount()
	{
		return 0;
	}
	
	public void create(Date doa,Date dod,String type,int norb)
	{
		
	}
	
	public void enterGuestDetails(String name,String email)
	{
		
	}
	
	public void updateReservation(boolean status)
	{
		
	}

}
