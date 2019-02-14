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
	
	public static users login(String id, String pw) {
		Session sess = new Configuration().configure().buildSessionFactory().openSession();
		users user = new users();
		try {
			Criteria cr = sess.createCriteria(users.class);
			cr.add(Restrictions.eq("id", id));
			cr.add(Restrictions.eq("pw", pw));
			List ee = cr.list();
			user=(users)ee.get(0);
			user.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
}
