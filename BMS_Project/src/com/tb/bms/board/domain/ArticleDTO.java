/**
 * @Summary   : 
 * @Package : com.tb.bms.board.domain
 * @FileName : ArticleDTO.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 9.  
 * 
 */
package com.tb.bms.board.domain;

/**
 * 
 * @Package : com.tb.bms.board.domain
 * @FileName : ArticleDTO.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 9. 
 * 게시글 관련 객체 선언 및 getter(), setter() 메소드 정의
 */
public class ArticleDTO {
	private int articleNo;
	private int userNo;
	private int boardNo;
	private String title;
	private String contents;
	
	public ArticleDTO(int articleNo, String title, String contents,int userNo, int boardNo){
		this.articleNo=articleNo;
		this.userNo=userNo;
		this.boardNo=boardNo;
		this.title=title;
		this.contents=contents;
	}

	public int getArticleNo() {
		return articleNo;
	}

	public void setArticleNo(int articleNo) {
		this.articleNo = articleNo;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
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

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}
	
	
}
