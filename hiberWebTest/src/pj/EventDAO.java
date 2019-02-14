/**
 * @Summary   : 
 * @Package : pj
 * @FileName : EventDAO.java
 * @Author : Yang TaeIl
 * @date : 2018. 9. 3.  
 * 
 */
package pj;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

/**
 * 
 * @Package : pj
 * @FileName : EventDAO.java
 * @Author : Yang TaeIl
 * @date : 2018. 9. 3. 
 * 
 */
public class EventDAO {
	public Event select(int eventId) {
		System.out.println("---------------------inevent");
		Event event = null;
		Session sess = new Configuration().configure().buildSessionFactory().openSession();
		try {
			Criteria cr = sess.createCriteria(Event.class);
			cr.add(Restrictions.eq("eventId",eventId));
			List ee = cr.list();
			event = (Event) ee.get(0);
		} catch (Exception e) {
			e.getStackTrace();
		}
		return event;
	}
}
