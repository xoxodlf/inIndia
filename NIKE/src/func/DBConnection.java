package func;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.List;

/**
 * @Summary   : 
 * @Package : 
 * @FileName : DBConnection.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 25.  
 * 
 */

/**
 * 
 * @Package : 
 * @FileName : DBConnection.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 25. 
 * 
 */
public class DBConnection {
	Connection connection;
	public Connection getConnection() {
		connection = null;
		try {
		    Class.forName("com.mysql.jdbc.Driver").newInstance();
		    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cristopher?serverTimezone=UTC" , "xoxodlf", "red240188");
		} catch (Exception e) {
		   e.printStackTrace();
		}
		return connection;
	}
	
}
