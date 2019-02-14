/**
 * @Summary   : 
 * @Package : com.tb.bms.board.dao
 * @FileName : ArticleDAO.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 15.  
 * 
 */
package com.tb.bms.board.dao;

import java.util.ArrayList;

import com.tb.bms.board.domain.ArticleDTO;

/**
 * 
 * @Package : com.tb.bms.board.dao
 * @FileName : ArticleDAO.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 15. 
 * 
 */
public interface ArticleDAO {
	public void createArticle(ArticleDTO article);
	public void modityArticle(ArticleDTO article);
	public ArrayList<ArticleDTO> listAll(int boardNo);
	public void deleteAriticle(int articleNo);
}
