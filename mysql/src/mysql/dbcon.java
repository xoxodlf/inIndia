/**
 * @Summary   : 
 * @Package : mysql
 * @FileName : dbcon.java
 * @Author : Yang TaeIl
 * @date : 2018. 7. 16.  
 * 
 */
package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * @Package : mysql
 * @FileName : dbcon.java
 * @Author : Yang TaeIl
 * @date : 2018. 7. 16. 
 * 
 */
public class dbcon {

	/**
	 * 
	 *
	 * @Method Name : main
	 * @param args
	 */
		public static void main(String[] args) {
	        Connection connection = null;
	        Statement st = null;
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_ex?serverTimezone=UTC" , "xoxodlf", "red240188");
	            st = connection.createStatement();
	 
	            String sql;
	            sql = "select * FROM tbl_board;";
	 
	            ResultSet rs = st.executeQuery(sql);
	            int cnt=0;
	            while (rs.next()) {
	               cnt++;
	                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6));
	            }
	            System.out.println(cnt);
	            rs.close();
	            st.close();
	            connection.close();
	        } catch (SQLException se1) {
	            se1.printStackTrace();
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        } finally {
	            try {
	                if (st != null)
	                    st.close();
	            } catch (SQLException se2) {
	            }
	            try {
	                if (connection != null)
	                    connection.close();
	            } catch (SQLException se) {
	                se.printStackTrace();
	            }
	        }    
	    }




}
