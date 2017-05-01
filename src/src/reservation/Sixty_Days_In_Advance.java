package reservation;

import java.util.Date;

public class Sixty_Days_In_Advance extends Reservation{

	
	

	public Sixty_Days_In_Advance(String dateOfArrival, int numberOfRoomsBooked, String type, String dateOfDeparture) {
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
	
	public void emailReminder(String email,String name)
	{
		
	}


}
