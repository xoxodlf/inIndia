/**
 * @Summary   : 
 * @Package : com.tb.bms.reply.domain
 * @FileName : replyDTO.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 9.  
 * 
 */
package com.tb.bms.reply.domain;

/**
 * 
 * @Package : com.tb.bms.reply.domain
 * @FileName : replyDTO.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 9. 
 * 댓글 관련 객체 선언 및 getter(), setter() 메소드 정의
 */
public class ReplyDTO {
	private int replyNo;
	private int articleNo;
	private int userNo;
	private String contents;
	
	public ReplyDTO(int replyNo,int articleNo, int userNo,String contents){
		this.replyNo=replyNo;
		this.articleNo=articleNo;
		this.userNo=userNo;
		this.contents=contents;
	}

	public int getReplyNo() {
		return replyNo;
	}

	public void setReplyNo(int replyNo) {
		this.replyNo = replyNo;
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

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}
	
	
	

}
