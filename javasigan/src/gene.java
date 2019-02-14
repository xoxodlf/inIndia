import java.sql.*;

public class gene {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String url = "jdbc:oracle:thin:@192.168.60.216:1521:orcl";
			String query;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url,"jake","kim");
			
			query = "select title from movie";
			
			Statement stat = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = stat.executeQuery(query);
			while(rs.next()) {
				String s1=rs.getString(1);
				System.out.println("Query result: "+s1);
			}
			conn.close();
			System.out.println("end of thin_conn");
		} catch (Exception e) {
			System.err.println("Exception: " +e);
			e.printStackTrace();
		}
	}

}

