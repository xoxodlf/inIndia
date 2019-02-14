/**
 * @Summary   : 
 * @Package : com.tb.bms.board.dao
 * @FileName : ArticleDAOImplement.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 16.  
 * 
 */
package com.tb.bms.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.tb.bms.board.domain.ArticleDTO;

/**
 * 
 * @Package : com.tb.bms.board.dao
 * @FileName : ArticleDAOImplement.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 16. 
 * 
 */
public class ArticleDAOImplement implements ArticleDAO{


	@Override
	public void createArticle(ArticleDTO article) {
		Connection conn = null;
		PreparedStatement pstm = null;
		String query="insert into Articles(articleno, title, contents, userno,boardno) values (SEQ_ARTICLES.nextVal,?,?,?,?)";
		
		try {
			conn = DBConnection.DBConnection.getConnection();
			pstm = conn.prepareStatement(query);
			pstm.setString(1,article.getTitle());
			pstm.setString(2,article.getContents());
			pstm.setInt(3,article.getUserNo());
			pstm.setInt(4,article.getBoardNo());

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
	public void modityArticle(ArticleDTO article) {
		Connection conn = null;
		PreparedStatement pstm = null;
		String query="update Articles set title=?, contents=? where articleNo=?";
		
		try {
			conn = DBConnection.DBConnection.getConnection();
			pstm = conn.prepareStatement(query);
			pstm.setString(1,article.getTitle());
			pstm.setString(2,article.getContents());
			pstm.setInt(3,article.getArticleNo());

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
	public ArrayList<ArticleDTO> listAll(int boardNo) {
		Connection conn = null;
		PreparedStatement pstm = null;
		String query="select * from Articles where boardNo=?";
		
		ArrayList<ArticleDTO> result =new ArrayList<ArticleDTO>();
		try {
			conn = DBConnection.DBConnection.getConnection();
			pstm = conn.prepareStatement(query);
			pstm.setInt(1,boardNo);
			ResultSet rs=pstm.executeQuery();
			while(rs.next()) {
				result.add(new ArticleDTO(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5)));
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
	public void deleteAriticle(int articleNo) {
		Connection conn = null;
		PreparedStatement pstm = null;
		String query="delete from Articles where articleNo=?";
		
		try {
			conn = DBConnection.DBConnection.getConnection();
			pstm = conn.prepareStatement(query);
			pstm.setInt(1,articleNo);

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
