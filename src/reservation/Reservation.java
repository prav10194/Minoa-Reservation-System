package reservation;

import java.util.Date;

public class Reservation {
	
	int bookingId;
	String dateOfArrival;
	double baseRate;
	int numberOfRoomsBooked;
	String type;
	String dateOfDeparture;
	String dateOfBooking;
	String email;
	String name;
	boolean isPaymentMade;
	boolean status;
	String ccNumber;
	
	
	public Reservation(String dateOfArrival, int numberOfRoomsBooked, String type, String dateOfDeparture) {
		super();
		this.dateOfArrival = dateOfArrival;
		this.numberOfRoomsBooked = numberOfRoomsBooked;
		this.type = type;
		this.dateOfDeparture = dateOfDeparture;
	}
	
	
	public int getBookingId() {
		return bookingId;
	}


	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}


	public String getDateOfArrival() {
		return dateOfArrival;
	}


	public void setDateOfArrival(String dateOfArrival) {
		this.dateOfArrival = dateOfArrival;
	}


	public double getBaseRate() {
		return baseRate;
	}


	public void setBaseRate(double baseRate) {
		this.baseRate = baseRate;
	}


	public int getNumberOfRoomsBooked() {
		return numberOfRoomsBooked;
	}


	public void setNumberOfRoomsBooked(int numberOfRoomsBooked) {
		this.numberOfRoomsBooked = numberOfRoomsBooked;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getDateOfDeparture() {
		return dateOfDeparture;
	}


	public void setDateOfDeparture(String dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}


	public String getDateOfBooking() {
		return dateOfBooking;
	}


	public void setDateOfBooking(String dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isPaymentMade() {
		return isPaymentMade;
	}


	public void setPaymentMade(boolean isPaymentMade) {
		this.isPaymentMade = isPaymentMade;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public String getCcNumber() {
		return ccNumber;
	}


	public void setCcNumber(String ccNumber) {
		this.ccNumber = ccNumber;
	}


	public void updateReservation(boolean isPaymentMade,boolean status)
	{
		
	}
	
	public void create()
	{
		
	}
	
	public void enterreservationDetails(Date doa,Date dod,String type,int norb)
	{
		
	}
	
	public void enterGuestDetails(String name,String email)
	{
		
	}
	
	public boolean enterCreditCardDetails(String ccNumber)
	{
		return true;
	}
	
	public void emailReminder(String email,String name)
	{
	
	}

	public void updateReservationRecord(boolean isPaymentMade)
	{
		
	}
	
	public void endSession()
	{
		
	}
}
