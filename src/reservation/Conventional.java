package reservation;

import java.util.Date;

public class Conventional extends Reservation{

	
	public Conventional(String dateOfArrival, int numberOfRoomsBooked, String dateOfDeparture) {
		super(dateOfArrival, numberOfRoomsBooked, dateOfDeparture);
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
