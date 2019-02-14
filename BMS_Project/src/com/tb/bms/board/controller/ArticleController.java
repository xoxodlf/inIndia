/**
 * @Summary   : 
 * @Package : com.tb.bms.board.controller
 * @FileName : AriticleController.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 16.  
 * 
 */
package com.tb.bms.board.controller;

import java.util.ArrayList;

import com.tb.bms.board.dao.ArticleDAOImplement;
import com.tb.bms.board.domain.ArticleDTO;

/**
 * 
 * @Package : com.tb.bms.board.controller
 * @FileName : AriticleController.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 16. 
 * 
 */
public class ArticleController {
	ArticleDAOImplement ArticleDAO= new ArticleDAOImplement();
	
	public void createArticle(ArticleDTO article) {
		ArticleDAO.createArticle(article);
	}
	public void modityArticle(ArticleDTO article) {
		ArticleDAO.modityArticle(article);
	}
	public ArrayList<ArticleDTO> listAll(int BoardNo){
		return ArticleDAO.listAll(BoardNo);
	}
	public void deleteAriticle(int articleNo) {
		ArticleDAO.deleteAriticle(articleNo);
	}
}
