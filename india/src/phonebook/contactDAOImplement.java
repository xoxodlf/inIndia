/**
 * @Summary   : 
 * @Package : phonebook
 * @FileName : contactDAO.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 21.  
 * 
 */
package phonebook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * 
 * @Package : phonebook
 * @FileName : contactDAOImplement.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 21. 
 * 
 */
public class contactDAOImplement implements contactDAO{
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	
	public void insertContact(contact insert) {
		String query="insert into contacts (contactNum,name,phoneNumber,birthday,relation,shortNum) values(SEQ_contacts.NEXTVAL,'"+insert.getName()+"','"+insert.getPhoneNum()+"','"+insert.getBirthDay()+"','"+insert.getRelation()+"',"+insert.getShortNum()+")";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url,"hr","hr");
			System.out.println(query);
			Statement stat = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stat.executeUpdate(query);
			conn.close();
		} catch (Exception e) {
			System.err.println("Exception: " +e);
			e.printStackTrace();
		}
		
	}
	
	public void deleteContact(String phoneNum) {
		String query="delete from contacts where phonenumber='"+phoneNum+"'";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url,"hr","hr");
			System.out.println(query);
			Statement stat = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stat.executeUpdate(query);
			conn.close();
		} catch (Exception e) {
			System.err.println("Exception: " +e);
			e.printStackTrace();
		}
	}
	
	public void updateContact(String phoneNum,contact update) {
		String query="update contacts set name='"+update.getName()+"',phoneNumber='"+update.getPhoneNum()+"',BIRTHDAY='"+update.getBirthDay()+"',relation='"+update.getRelation()+"',shortNum='"+update.getShortNum()+"' where PHONENUMBER='"+phoneNum+"'";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url,"hr","hr");
			System.out.println(query);
			Statement stat = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stat.executeUpdate(query);
			conn.close();
		} catch (Exception e) {
			System.err.println("Exception: " +e);
			e.printStackTrace();
		}
	}
	
	public contact searchContactByNumber(String s) {
		String query ="select * from contacts where phoneNumber='"+s+"'";
		contact tmp;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url,"hr","hr");
			Statement stat = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = stat.executeQuery(query);
			tmp=new contact();
			while(rs.next()) {
				tmp=new contact(rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6));
			}
			rs.close();
			conn.close();
			return tmp;
		} catch (Exception e) {
			System.err.println("Exception: " +e);
			e.printStackTrace();
			tmp=new contact();
			return tmp;
		}
	}
	
	public ArrayList<contact> searchContactByName(String s) {
		String query ="select * from contacts where name='"+s+"'";
		contact tmp;
		ArrayList<contact> result=new ArrayList<contact>();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url,"hr","hr");
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(query);
			tmp=new contact();
			while(rs.next()) {
				tmp=new contact(rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6));
				result.add(tmp);
			}
			rs.close();
			stat.close();
			conn.close();
			return result;
		} catch (Exception e) {
			System.err.println("Exception: " +e);
			e.printStackTrace();
			return result;
		}
	}
	
	public ArrayList<contact> listAll() {
		String query ="select * from contacts";
		contact tmp;
		ArrayList<contact> result=new ArrayList<contact>();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url,"hr","hr");
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(query);
			tmp=new contact();
			while(rs.next()) {
				tmp=new contact(rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6));
				result.add(tmp);
			}
			rs.close();
			stat.close();
			conn.close();
			return result;
		} catch (Exception e) {
			System.err.println("Exception: " +e);
			e.printStackTrace();
			return result;
		}
	}
	
	
}
