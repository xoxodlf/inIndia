/**
 * @Summary   : 
 * @Package : dto
 * @FileName : ItemDAO.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 25.  
 * 
 */
package dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import func.DBConnection;

/**
 * 
 * @Package : dto
 * @FileName : ItemDAO.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 25. 
 * 
 */
public class ItemDAO {
	Connection con;
	
	public ItemDAO(){
		con=(new DBConnection().getConnection());
	}
	
	public List<ItemDTO> listAll(){
		ArrayList<ItemDTO> list = new ArrayList<ItemDTO>();
		String query = "select * from item";
		ResultSet rs;
		try {
			PreparedStatement ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				list.add(new ItemDTO(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5)));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public ItemDTO selectOne(int itemNo){
		String query = "select * from item where itemNo=?";
		ResultSet rs;
		ItemDTO item = new ItemDTO();
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, itemNo);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				item=new ItemDTO(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return item;
	}
	
	
	public void insertToCart(int itemNo,int userNo,int quantity){
		String query = "insert into basket(userNo,itemNo,quantity) values(?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, userNo);
			ps.setInt(2, itemNo);
			ps.setInt(3, quantity);
			ps.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateCart(int basketNo,int quantity){
		String query = "update basket set quantity=? where basketNo=?";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, quantity);
			ps.setInt(2, basketNo);
			ps.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteCart(int basketNo){
		String query = "delete from basket where basketNo=?";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, basketNo);
			ps.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
