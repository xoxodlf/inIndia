/**
 * @Summary   : 
 * @Package : webHiber1
 * @FileName : userDao.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 21.  
 * 
 */
package webHiber1;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * 
 * @Package : webHiber1
 * @FileName : userDao.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 21. 
 * 
 */
public class userDao {
	public static int register(user u) {
		int i=0;
		Session sess = new Configuration().configure().buildSessionFactory().openSession();
		Transaction t = sess.beginTransaction();
		i = (Integer)sess.save(u);
		t.commit();
		sess.close();
		return i;
	}
	
	public static user findById(int id) {
		Session sess = new Configuration().configure().buildSessionFactory().openSession();
		String hql = "from user where id= :id";
		user result=new user();
		try {
			Query query = sess.createQuery(hql);
			query.setParameter("id", id);
			List ee = query.list();
			result=(user)ee.get(0);
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}
}
