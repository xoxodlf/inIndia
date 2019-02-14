/**
 * @Summary   : 
 * @Package : dto
 * @FileName : BasketDAO.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 26.  
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
 * @FileName : BasketDAO.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 26. 
 * 
 */
public class BasketDAO {
	Connection con;
	
	public BasketDAO(){
		con=(new DBConnection().getConnection());
	}
	
	public List<BasketDTO> getList(int userNo){
		List<BasketDTO> list = new ArrayList<BasketDTO>();
		String query = "select i.*,b.basketNo,b.quantity,b.userNo from item i left outer join basket b on i.itemNo=b.itemNo where userNo=?";
		ResultSet rs;
		try {
			PreparedStatement ps= con.prepareStatement(query);
			ps.setInt(1, userNo);
			rs=ps.executeQuery();
			while(rs.next()) {
				list.add(new BasketDTO(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getInt(8)));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public int getCnt(int userNo){
		List<BasketDTO> list = new ArrayList<BasketDTO>();
		String query = "select count(*) from item i left outer join basket b on i.itemNo=b.itemNo where userNo=?";
		ResultSet rs;
		int cnt=0;
		try {
			PreparedStatement ps= con.prepareStatement(query);
			ps.setInt(1, userNo);
			rs=ps.executeQuery();
			while(rs.next()) {
				cnt=rs.getInt(1);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
	
	
	public void buy(int userNo) {
		String query = "select i.*,b.basketNo,b.quantity,b.userNo from item i left outer join basket b on i.itemNo=b.itemNo where userNo=?";
		ResultSet rs;
		try {
			PreparedStatement ps= con.prepareStatement(query);
			ps.setInt(1, userNo);
			rs=ps.executeQuery();
			PreparedStatement ps1;
			PreparedStatement ps2;
			while(rs.next()) {
				ps1 = con.prepareStatement("insert into orderlist(userNo,itemNo,quantity,regdate) values(?,?,?,now())");
				ps1.setInt(1, userNo);
				ps1.setInt(2, rs.getInt(1));
				ps1.setInt(3, rs.getInt(7));
				ps1.executeUpdate();
				ps2 = con.prepareStatement("delete from basket where basketNo=?");
				ps2.setInt(1, rs.getInt(6));
				ps2.executeUpdate();
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
