package reservation;

import java.text.ParseException;

import payment.Payment;
import room.DB;

public class Reservation {

	int bookingId;
	String dateOfArrival;
	double baseRate;
	double amount;
	int numberOfRoomsBooked;
	String type;
	String dateOfDeparture;
	String dateOfBooking;
	String email;
	String name;
	boolean isPaymentMade;
	boolean status;
	String ccNumber;

	public Reservation(String dateOfArrival, String dateOfDeparture, String type, int numberOfRoomsBooked) {
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

	// REMOVE ONE PARAMETER
	public void updateReservation(boolean status) {
		this.status = status;
		DB database = new DB();
		database.addToDatabase(this);
	}

	// ADDED NEW FUNCTION
	public void updatePaymentStatus(boolean isPaymentMade) {
		this.isPaymentMade = isPaymentMade;
	}

	public void create() {

	}

	public Reservation enterReservationDetails(String doa, String dod, String type, int norb) throws ParseException {

		DB rdb = new DB();
		Reservation res = null;

		boolean availiabilty = rdb.checkAvailability(doa, dod, norb);
		if (availiabilty) {
			double baserate=rdb.getBaseRate(doa);
			type = type.toLowerCase();
			switch (type) {
			case "prepaid":
				res = new Prepaid_Reservation(doa, dod, type, norb);
				res.baseRate=baserate;
				res.setAmount(((Prepaid_Reservation) res).calculateTotalAmount());
				break;
			}
			return res;
		} else {
			return null;
		}
	}

	public void enterGuestDetails(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public boolean enterCreditCardDetails(String ccNumber) {
		this.ccNumber = ccNumber;
		Payment pay = new Payment();
		return pay.createPayment(ccNumber);
	}

	public void emailReminder(String email, String name) {

	}

	public void updateReservationRecord(boolean isPaymentMade) {

	}

	public void endSession() {

	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}
