/**
 * @Summary   : 
 * @Package : com.tb.bms.reply.controller
 * @FileName : ReplyController.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 18.  
 * 
 */
package com.tb.bms.reply.controller;

import java.util.ArrayList;

import com.tb.bms.reply.dao.ReplyDAOImplement;
import com.tb.bms.reply.domain.ReplyDTO;

/**
 * 
 * @Package : com.tb.bms.reply.controller
 * @FileName : ReplyController.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 18. 
 * 
 */
public class ReplyController {
	ReplyDAOImplement ReplyDAO=new ReplyDAOImplement();
	public void createReply(ReplyDTO reply) {
		ReplyDAO.createReply(reply);
	}
	public void modityReply(ReplyDTO reply) {
		ReplyDAO.modityReply(reply);
	}
	public ArrayList<ReplyDTO> listAll(int articleNo){
		return ReplyDAO.listAll(articleNo);
	}
	public void deleteReply(int replyNo) {
		ReplyDAO.deleteReply(replyNo);
	}
}
