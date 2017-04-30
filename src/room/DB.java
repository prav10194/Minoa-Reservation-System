package room;


import reservation.Reservation;

public class DB {

	public DB() {
		System.out.println("SET CONNECTION HERE");
		// TODO Auto-generated constructor stub
	}
	public boolean checkAvailability(String doa,String dod,int norb)
	{
		System.out.println("Check Here");
		return true;
	}
	
	public void updateNumberOfRoomsAvailable()
	{
		
	}
	public void addToDatabase(Reservation R){
		System.out.println("ADD HERE");
	}
	public double getBaseRate(String doa) {
		// TODO Auto-generated method stub
		System.out.println("RETURN BASE RATE OF THE ARRIVAL DATE:"+" "+doa);
		return 100;
	}

}
