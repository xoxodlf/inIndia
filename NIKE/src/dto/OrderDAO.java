/**
 * @Summary   : 
 * @Package : dto
 * @FileName : OrderDAO.java
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
 * @FileName : OrderDAO.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 26. 
 * 
 */
public class OrderDAO {
Connection con;
	
	public OrderDAO(){
		con=(new DBConnection().getConnection());
	}
	
	public List<OrderDTO> listAll(int userNo) {
		List<OrderDTO> list = new ArrayList<OrderDTO>();
		String query = "select i.*,o.orderNo,o.quantity,o.userNo,o.regdate from item i left outer join orderlist o on i.itemNo=o.itemNo where userNo=? order by o.regdate desc";
		ResultSet rs;
		try {
			PreparedStatement ps= con.prepareStatement(query);
			ps.setInt(1, userNo);
			rs=ps.executeQuery();
			while(rs.next()) {
				list.add(new OrderDTO(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getInt(8),rs.getDate(9)));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
