import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class JDBC {

    public static void main(String[] args) {

        try {

           //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

           Connection conn = DriverManager.getConnection("jdbc:ucanaccess://C://Users//Pranav//Desktop//Reservation.accdb");

            //Statement st = conn.createStatement();

            Statement st=conn.createStatement();
    		
            /*ResultSet rs=st.executeQuery("select count(*) from A");
            while(rs.next())
            {
                System.out.println(rs.getString(1));
            }*/
            
            //     rs1=st.executeUpdate("insert into Student(SID,First,Last,Address,City,State,Zip,Email,GPA) values ('"+SID+"','"+fn+"','"+ln+"','"+add+"','"+city+"','"+state+"','"+zip+"','"+email+"','"+gpa+"')");
    		//st.executeUpdate("INSERT into A VALUES(2,'Ab','ab',122,122)");
    		st.executeUpdate("INSERT into ReservationRecords VALUES(4,'January 2, 2010',122,122,1,'prepaid','January 4, 2010','January 5, 2010','p','p','p','p','1234')");
    		
    		System.out.println(timeStamp );

        } catch (Exception e) {

            System.out.println("H"+e);

        }

    }

}