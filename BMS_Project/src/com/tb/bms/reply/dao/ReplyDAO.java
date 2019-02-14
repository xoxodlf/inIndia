/**
 * @Summary   : 
 * @Package : com.tb.bms.reply.dao
 * @FileName : replyDAO.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 18.  
 * 
 */
package com.tb.bms.reply.dao;

import java.util.ArrayList;

import com.tb.bms.reply.domain.ReplyDTO;

/**
 * 
 * @Package : com.tb.bms.reply.dao
 * @FileName : replyDAO.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 18. 
 * 
 */
public interface ReplyDAO {
	public void createReply(ReplyDTO reply);
	public void modityReply(ReplyDTO reply);
	public ArrayList<ReplyDTO> listAll(int articleNo);
	public void deleteReply(int replyNo);
}
