/**
 * @Summary   : 
 * @Package : com.tb.bms.board.dao
 * @FileName : BoardDAOImplement.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 13.  
 * 
 */
package com.tb.bms.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.tb.bms.board.domain.BoardDTO;

/**
 * 
 * @Package : com.tb.bms.board.dao
 * @FileName : BoardDAOImplement.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 13. 
 * 
 */
public class BoardDAOImplement implements BoardDAO{

	@Override
	public void createBoard(BoardDTO board) {
		Connection conn = null;
		PreparedStatement pstm = null;
		String query="insert into Boards(boardNo, title, info) values (SEQ_BOARDS.nextVal,?,?)";
		try {
			conn = DBConnection.DBConnection.getConnection();
			pstm = conn.prepareStatement(query);
			pstm.setString(1,board.getTitle());
			pstm.setString(2,board.getInfo());

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
	public boolean isExist(String title) {
		Connection conn = null;
		PreparedStatement pstm = null;
		boolean result=false;
		String query="select title from Boards where title=?";
		try {
			conn = DBConnection.DBConnection.getConnection();
			pstm = conn.prepareStatement(query);
			pstm.setString(1, title);

			ResultSet rs = pstm.executeQuery();
			if(rs.next()) {
				result=true;
			}
		} catch (SQLException e) {
			throw new RuntimeException("in check exception", e);
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
	public ArrayList<BoardDTO> listAll() {
		Connection conn = null;
		PreparedStatement pstm = null;
		ArrayList<BoardDTO> result=new ArrayList<BoardDTO>();
		String query="select * from Boards";
		try {
			conn = DBConnection.DBConnection.getConnection();
			pstm = conn.prepareStatement(query);

			ResultSet rs = pstm.executeQuery();
			if(rs.next()) {
				result.add(new BoardDTO(rs.getInt(1),rs.getString(2),rs.getString(3)));
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
	public void modifyBoard(BoardDTO board) {
		Connection conn = null;
		PreparedStatement pstm = null;
		String query="update Boards set title=?, info=? where boardNo=?";
		try {
			conn = DBConnection.DBConnection.getConnection();
			pstm = conn.prepareStatement(query);
			pstm.setString(1,board.getTitle());
			pstm.setString(2,board.getInfo());
			pstm.setInt(3,board.getBoardNo());

			pstm.executeQuery();
			
		} catch (SQLException e) {
			throw new RuntimeException("in check exception", e);
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
	public void deleteBoard(int boardNo) {
		Connection conn = null;
		PreparedStatement pstm = null;
		String query="delete from Boards where boardNo=?";
		try {
			conn = DBConnection.DBConnection.getConnection();
			pstm = conn.prepareStatement(query);
			pstm.setInt(1,boardNo);

			pstm.executeQuery();
			
		} catch (SQLException e) {
			throw new RuntimeException("in check exception", e);
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
