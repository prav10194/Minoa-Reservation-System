package room;

import java.util.Date;

public class RoomDB {
	double baseRate;
	int numberOfRoomsAvailable;
	Date checkInDate;
	public double getBaseRate() {
		return baseRate;
	}
	public void setBaseRate(double baseRate) {
		this.baseRate = baseRate;
	}
	public int getNumberOfRoomsAvailable() {
		return numberOfRoomsAvailable;
	}
	public void setNumberOfRoomsAvailable(int numberOfRoomsAvailable) {
		this.numberOfRoomsAvailable = numberOfRoomsAvailable;
	}
	public Date getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}
	public RoomDB(double baseRate, int numberOfRoomsAvailable, Date checkInDate) {
		super();
		this.baseRate = baseRate;
		this.numberOfRoomsAvailable = numberOfRoomsAvailable;
		this.checkInDate = checkInDate;
	}
	
	public boolean checkAvailability(Date doa,Date dod,int norb)
	{
		return true;
	}
	
	public void updateNumberOfRoomsAvailable()
	{
		
	}

}
