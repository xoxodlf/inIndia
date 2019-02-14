/**
 * @Summary   : 
 * @Package : com.tb.bms.board.dao
 * @FileName : BoardDAO.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 13.  
 * 
 */
package com.tb.bms.board.dao;

import java.util.ArrayList;

import com.tb.bms.board.domain.BoardDTO;

/**
 * 
 * @Package : com.tb.bms.board.dao
 * @FileName : BoardDAO.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 13. 
 * 
 */
public interface BoardDAO {
	public void createBoard(BoardDTO board);
	public boolean isExist(String name);
	public ArrayList<BoardDTO> listAll();
	public void modifyBoard(BoardDTO board);
	public void deleteBoard(int boardNo);
	
}
