package dbcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class dbcon1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String query;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url,"hr","hr");
			
			query = "select * from users";
			//String insertQuery = "insert into users values ()";
			Statement stat = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = stat.executeQuery(query);
			while(rs.next()) {
				String s1=rs.getString(1);
				System.out.println("Query result: "+" userNo="+s1+" id="+rs.getString(2)+" name="+rs.getString(4)+" phone="+rs.getString(5));
			}
			conn.close();
			System.out.println("end of thin_conn");
		} catch (Exception e) {
			System.err.println("Exception: " +e);
			e.printStackTrace();
		}
	}

}


