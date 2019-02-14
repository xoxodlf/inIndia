/**
 * @Summary   : 
 * @Package : com.tb.bms.board.domain
 * @FileName : BoardDTO.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 9.  
 * 
 */
package com.tb.bms.board.domain;

/**
 * 
 * @Package : com.tb.bms.board.domain
 * @FileName : BoardDTO.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 9. 
 * 게시판 관련 객체 선언 및 getter(), setter() 메소드 정의
 */
public class BoardDTO {
	private int boardNo;
	private String title;
	private String info;
	
	public BoardDTO(int boardNo,String title, String info){
		this.boardNo=boardNo;
		this.title=title;
		this.info=info;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	
}
