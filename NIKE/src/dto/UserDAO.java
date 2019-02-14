/**
 * @Summary   : 
 * @Package : dto
 * @FileName : UserDAO.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 25.  
 * 
 */
package dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import func.DBConnection;

/**
 * 
 * @Package : dto
 * @FileName : UserDAO.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 25. 
 * 
 */
public class UserDAO {
	Connection con;
	
	public UserDAO(){
		con=(new DBConnection().getConnection());
	}
	
	public void insertUser(UserDTO user) {
		String query = "insert into users(id,password,name) values(?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, user.getId());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getName());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public UserDTO signIn(String id , String pw) {
		String query = "select * from users where id=? and password=?";
		ResultSet rs;
		UserDTO user = new UserDTO();
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, id);
			ps.setString(2, pw);
			rs = ps.executeQuery();
			while(rs.next()) {
				user.setUserNo(rs.getInt(1));
				user.setPassword(rs.getString(2));
				user.setName(rs.getString(3));
				user.setId(rs.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
}
