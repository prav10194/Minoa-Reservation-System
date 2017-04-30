import java.sql.*;
public class JDBC {

    public static void main(String[] args) {

        try {

           //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

           Connection conn = DriverManager.getConnection("jdbc:ucanaccess://C://Users//Pranav//Desktop//Reservation.accdb");

            Statement st = conn.createStatement();

            String sql = "Select * from ReservationRecords";

            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                System.out.println("\n"+rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t");
            
            }

        } catch (Exception e) {

            System.out.println("H"+e);

        }

    }

}