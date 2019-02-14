/**
 * @Summary   : 
 * @Package : cart
 * @FileName : delete.java
 * @Author : Yang TaeIl
 * @date : 2018. 9. 3.  
 * 
 */
package cart;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * 
 * @Package : cart
 * @FileName : delete.java
 * @Author : Yang TaeIl
 * @date : 2018. 9. 3. 
 * 
 */
public class delete {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session sess = factory.openSession();
		Transaction t = sess.beginTransaction();
		System.out.println("Please insert cart No");
		Scanner sc = new Scanner(System.in);
		int cartNo = sc.nextInt();
		try {
			Cart c = new Cart();
			c.setCart_id(cartNo);
			sess.delete(c);
			System.out.println("Delete Success");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		t.commit();
		sess.close();
	}
}
