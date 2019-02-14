/**
 * @Summary   : 
 * @Package : com.tb.bms.reply.dao
 * @FileName : ReplyDAOImplement.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 18.  
 * 
 */
package com.tb.bms.reply.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.tb.bms.board.domain.ArticleDTO;
import com.tb.bms.reply.domain.ReplyDTO;

/**
 * 
 * @Package : com.tb.bms.reply.dao
 * @FileName : ReplyDAOImplement.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 18. 
 * 
 */
public class ReplyDAOImplement implements ReplyDAO{

	@Override
	public void createReply(ReplyDTO reply) {
		Connection conn = null;
		PreparedStatement pstm = null;
		String query="insert into Replies(replyno, contents, articleno,userno) values (SEQ_ARTICLES.nextVal,?,?,?)";
		
		try {
			conn = DBConnection.DBConnection.getConnection();
			pstm = conn.prepareStatement(query);
			pstm.setString(1,reply.getContents());
			pstm.setInt(2,reply.getArticleNo());
			pstm.setInt(3,reply.getUserNo());

			pstm.executeQuery();
		} catch (SQLException e) {
			throw new RuntimeException("in insert exception", e);
		} finally {
			try {
				if (pstm != null)
					pstm.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void modityReply(ReplyDTO reply) {
		Connection conn = null;
		PreparedStatement pstm = null;
		String query="update Replies set contents=? where replyno=?";
		
		try {
			conn = DBConnection.DBConnection.getConnection();
			pstm = conn.prepareStatement(query);
			pstm.setString(1,reply.getContents());
			pstm.setInt(2,reply.getReplyNo());

			pstm.executeQuery();
		} catch (SQLException e) {
			throw new RuntimeException("in update exception", e);
		} finally {
			try {
				if (pstm != null)
					pstm.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public ArrayList<ReplyDTO> listAll(int articleNo) {
		Connection conn = null;
		PreparedStatement pstm = null;
		String query="select * from Replies where articleNo=?";
		ArrayList<ReplyDTO> result =new ArrayList<ReplyDTO>();
		try {
			conn = DBConnection.DBConnection.getConnection();
			pstm = conn.prepareStatement(query);
			pstm.setInt(1, articleNo);
			ResultSet rs=pstm.executeQuery();
			while(rs.next()) {
				result.add(new ReplyDTO(rs.getInt(1),rs.getInt(3),rs.getInt(4),rs.getString(2)));
			}
		} catch (SQLException e) {
			throw new RuntimeException("in listAll exception", e);
		} finally {
			try {
				if (pstm != null)
					pstm.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	@Override
	public void deleteReply(int replyNo) {
		Connection conn = null;
		PreparedStatement pstm = null;
		String query="delete from Replies where replyNo=?";
		
		try {
			conn = DBConnection.DBConnection.getConnection();
			pstm = conn.prepareStatement(query);
			pstm.setInt(1,replyNo);

			pstm.executeQuery();
		} catch (SQLException e) {
			throw new RuntimeException("in delete exception", e);
		} finally {
			try {
				if (pstm != null)
					pstm.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
