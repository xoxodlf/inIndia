/**
 * @Summary   : 
 * @Package : com.tb.bms.board.controller
 * @FileName : BoardController.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 14.  
 * 
 */
package com.tb.bms.board.controller;

import java.util.ArrayList;

import com.tb.bms.board.dao.BoardDAOImplement;
import com.tb.bms.board.domain.BoardDTO;

/**
 * 
 * @Package : com.tb.bms.board.controller
 * @FileName : BoardController.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 14. 
 * 
 */
public class BoardController {
	BoardDAOImplement BoardDAO=new BoardDAOImplement();
	
	public void createBoard(BoardDTO board) {
		BoardDAO.createBoard(board);
	}
	public boolean isExist(String name) {
		return BoardDAO.isExist(name);
	}
	public ArrayList<BoardDTO> listAll(){
		return BoardDAO.listAll();
	}
	public void deleteBoard(int boardNo) {
		BoardDAO.deleteBoard(boardNo);
	}
	public void modifyBoard(BoardDTO board) {
		BoardDAO.modifyBoard(board);
	}
}
