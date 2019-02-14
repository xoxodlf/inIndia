/**
 * @Summary   : 
 * @Package : superAssignment
 * @FileName : ArticleDAO.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 29.  
 * 
 */
package superAssignment;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

/**
 * 
 * @Package : superAssignment
 * @FileName : ArticleDAO.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 29. 
 * 
 */
public class ArticleDAO {
	public int registArticle(Article a) {
		int i=0;
		Session sess = new Configuration().configure().buildSessionFactory().openSession();
		Transaction t = sess.beginTransaction();
		i = (Integer)sess.save(a);
		
		t.commit();
		sess.close();
		return i;
	}
	
	public List<Article> listAll(int userNo){
		List<Article> list = new ArrayList<Article>();
		Session sess = new Configuration().configure().buildSessionFactory().openSession();
		try {
			Criteria cr = sess.createCriteria(Article.class);
			cr.add(Restrictions.eq("userNo", userNo));
			list = cr.list();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public List<Article> listAll(){
		List<Article> list = new ArrayList<Article>();
		Session sess = new Configuration().configure().buildSessionFactory().openSession();
		try {
			Criteria cr = sess.createCriteria(Article.class);
			list = cr.list();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void updateArticle(int articleNo, String status) {
		Session sess = new Configuration().configure().buildSessionFactory().openSession();
		Transaction t = sess.beginTransaction();
		if(status.equals("1"))status="Submit";
		else if(status.equals("2"))status="Review";
		else if(status.equals("3"))status="Accept";
		else if(status.equals("4"))status="Reject";
		String hql = "update Article set status = :status where articleNo = :articleNo ";
		Query query = sess.createQuery(hql);
		query.setParameter("status", status);
		query.setParameter("articleNo", articleNo);
		query.executeUpdate();
		t.commit();
		sess.close();
	}
	
	public void deleteArticle(int articleNo) {
		Session sess = new Configuration().configure().buildSessionFactory().openSession();
		Transaction t = sess.beginTransaction();
		Article a = new Article();
		a.setArticleNo(articleNo);
		sess.delete(a);
		t.commit();
		sess.close();
	}
}
