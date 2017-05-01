package room;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import reservation.Reservation;



public class DB {
	int counter=1;
	Connection conn = null;
	public DB() throws SQLException {
		System.out.println("SET CONNECTION HERE");
		// TODO Auto-generated constructor stub
		 conn = DriverManager.getConnection("jdbc:ucanaccess://C://Users//Pranav//Desktop//Reservation.accdb");
	
	}
	public boolean checkAvailability(String doa,String dod,int norb)
	{
		System.out.println("Check Here");
		return true;
	}
	
	public void updateNumberOfRoomsAvailable()
	{
		
	}
	public void addToDatabase(Reservation R) throws SQLException{
		System.out.println("ADD HERE");
		Statement st=conn.createStatement();
		st.executeUpdate("INSERT into ReservationRecords VALUES("+ counter +", '"
        +R.getDateOfArrival()+"','"
        +R.getBaseRate()+"','"
				+R.getAmount()+"','"
        +R.getNumberOfRoomsBooked()+"','"
				+R.getType()+"','"
        +R.getDateOfDeparture()+"','"
				+R.getDateOfBooking()+"','"
        +R.getEmail()+"','"
				+R.getName()+"','"
        +R.isPaymentMade()+"','"
				+R.isStatus()+"','"
        +R.getCcNumber()+"')");             
		
		counter=counter+1;
	}
	public double getBaseRate(String doa) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("RETURN BASE RATE OF THE ARRIVAL DATE:"+" "+doa);
		Statement st=conn.createStatement();
		ResultSet rs=null;
        rs=st.executeQuery("select * from BaseRate where date='"+doa+"'");
        while(rs.next())
        {
            return rs.getDouble(2);
        }
		return 100;
	}

}
