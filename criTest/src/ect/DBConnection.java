/**
 * @Summary   : 
 * @Package : ect
 * @FileName : DBConnection.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 30.  
 * 
 */
package ect;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 
 * @Package : ect
 * @FileName : DBConnection.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 30.
 * 
 */
public class DBConnection {
	Connection connection;

	public Connection getConnection() {
		connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC",
					"xoxodlf", "red240188");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

}
