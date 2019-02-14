/**
 * @Summary   : 
 * @Package : superAssignment
 * @FileName : UserDAO.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 27.  
 * 
 */
package superAssignment;

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
 * @FileName : UserDAO.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 27. 
 * 
 */
public class UserDAO {
	public int signup(User u) {
		int i=0;
		Session sess = new Configuration().configure().buildSessionFactory().openSession();
		Transaction t = sess.beginTransaction();
		
		try {
			Criteria cr = sess.createCriteria(User.class);
			cr.add(Restrictions.eq("emailId", u.getEmailId()));
			List ee = cr.list();
			if(ee.size()>0) return i;
		}catch (Exception e) {
			e.printStackTrace();
		}
		i = (Integer)sess.save(u);
		t.commit();
		sess.close();
		return i;
	}
	
	public User login(String emailId, String password) {
		User user = null;
		Session sess = new Configuration().configure().buildSessionFactory().openSession();
		try {
			Criteria cr = sess.createCriteria(User.class);
			cr.add(Restrictions.eq("emailId", emailId));
			cr.add(Restrictions.eq("password", password));
			List ee = cr.list();
			user = (User)ee.get(0);
		}catch (Exception e) {
			System.out.println("Login Fail");
		}
		return user;
	}
	
	public User findPassword(String emailId, String q1,String q2, String q3) {
		User user = null;
		Session sess = new Configuration().configure().buildSessionFactory().openSession();
		try {
			Criteria cr = sess.createCriteria(User.class);
			cr.add(Restrictions.eq("emailId", emailId));
			cr.add(Restrictions.eq("q1", q1));
			cr.add(Restrictions.eq("q2", q2));
			cr.add(Restrictions.eq("q3", q3));
			List ee = cr.list();
			user = (User)ee.get(0);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	public int changePassword(int userNo, String q1,String q2, String q3,String password) {
		int i=0;
		Session sess = new Configuration().configure().buildSessionFactory().openSession();
		Transaction t = sess.beginTransaction();
		try {
			String hql = "update User set password = :password where userNo= :userNo";
			Query query = sess.createQuery(hql);
			query.setString("password", password);
			query.setInteger("userNo", userNo);
			i=query.executeUpdate();
			t.commit();
			sess.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return i;
		
	}
}
