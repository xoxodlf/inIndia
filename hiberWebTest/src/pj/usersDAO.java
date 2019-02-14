/**
 * @Summary   : 
 * @Package : pj
 * @FileName : usersDAO.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 26.  
 * 
 */
package pj;

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
	
	public void update(int userNo, int eventId) {
		Session sess = new Configuration().configure().buildSessionFactory().openSession();
		Transaction t = sess.beginTransaction();
		String hql ="update users set eventId= :eventId where userNo = :userNo";
		Query query = sess.createQuery(hql);
		query.setInteger("userNo", userNo);
		query.setInteger("eventId", eventId);
		query.executeUpdate();
		t.commit();
		
	}
	
	public static users login(users u) {
		Session sess = new Configuration().configure().buildSessionFactory().openSession();
		users user = null;
		try {
			Criteria cr = sess.createCriteria(users.class);
			cr.add(Restrictions.eq("userId", u.getUserId()));
			cr.add(Restrictions.eq("password", u.getPassword()));
			List ee = cr.list();
			user=(users)ee.get(0);
			user.toString();
		} catch (Exception e) {
			System.out.println("LogInFail");
		}
		return user;
	}
	
	public List<users> eList(String eventNo){
		List<users> list = new ArrayList<users>();
		Session sess = new Configuration().configure().buildSessionFactory().openSession();
		try {
			Criteria cr = sess.createCriteria(users.class);
			cr.add(Restrictions.eq("eventId", eventNo));
			list = cr.list();
			System.out.println(list.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
