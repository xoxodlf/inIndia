/**
 * @Summary   : 
 * @Package : pj
 * @FileName : usersDAO.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 26.  
 * 
 */
package pj;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;



/**
 * 
 * @Package : pj
 * @FileName : usersDAO.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 26. 
 * 
 */
public class usersDAO {
	public static int register(users u) {
		int i=0;
		Session sess = new Configuration().configure().buildSessionFactory().openSession();
		Transaction t = sess.beginTransaction();
		i = (Integer)sess.save(u);
		t.commit();
		sess.close();
		return i;
	}
	
	public static users login(String id, String password) {
		Session sess = new Configuration().configure().buildSessionFactory().openSession();
		users user = null;
		String hql = "from users where id=? and password=?";
		try {
			Query query = sess.createQuery(hql);
			query.setString(0, id);
			query.setString(1, password);
			List ee = query.list();
			user=(users)ee.get(0);
			user.toString();
		} catch (Exception e) {
			System.out.println("login fail");
		}
		return user;
	}
}
