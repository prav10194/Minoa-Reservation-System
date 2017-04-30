package reservation;

import java.util.Date;

public class Incentive extends Reservation{

	public Incentive(int bookingId, Date dateOfArrival, double baseRate, int numberOfRoomsBooked, String type,
			Date dateOfDeparture, Date dateOfBooking, String email, String name, boolean isPaymentMade, boolean status,
			String ccNumber) {
		super(bookingId, dateOfArrival, baseRate, numberOfRoomsBooked, type, dateOfDeparture, dateOfBooking, email, name,
				isPaymentMade, status, ccNumber);
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
