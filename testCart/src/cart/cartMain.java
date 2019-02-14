/**
 * @Summary   : 
 * @Package : cart
 * @FileName : cartMain.java
 * @Author : Yang TaeIl
 * @date : 2018. 9. 3.  
 * 
 */
package cart;

import java.util.ArrayList;
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
 * @FileName : cartMain.java
 * @Author : Yang TaeIl
 * @date : 2018. 9. 3. 
 * 
 */
public class cartMain {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session sess = factory.openSession();
		Transaction t = sess.beginTransaction();
		System.out.println("Please insert cart No");
		Scanner sc = new Scanner(System.in);
		
//		Item i1 = new Item("snack", 100, 1);
//		Item i2 = new Item("ice_cream", 120, 1);
//		Item i3 = new Item("juice", 120, 1);
//		Item i4 = new Item("noodle", 50, 1);
//		Item i5 = new Item("egg", 6, 1);
//		Item i6 = new Item("water", 10, 1);
//		
//		List<Item> list1 = new ArrayList<Item>();
//		list1.add(i1);
//		list1.add(i2);
//		list1.add(i3);
//		list1.add(i4);
//		list1.add(i5);
//		list1.add(i6);
//		
//		Cart c1 = new Cart(list1, "Taeil's Cart");
//		sess.persist(c1);
//		i1 = new Item("snack2", 100, 2);
//		i2 = new Item("ice_cream2", 120,2);
//		i3 = new Item("juice2", 120, 2);
//		
//		List<Item> list2 = new ArrayList<Item>();
//		list2.add(i1);
//		list2.add(i2);
//		list2.add(i3);
//		Cart c2 = new Cart(list2, "Le's Cart");
//		
//		sess.persist(c2);
		int cartNo = sc.nextInt();
		Query query= sess.createQuery("from Cart where cart_id="+cartNo);
		List<Cart> list = query.list();
		Iterator<Cart> itr = list.iterator();
		
		while(itr.hasNext()) {
			Cart c= itr.next();
			System.out.println("Name: "+c.getName());
			
			List<Item> itemList= c.getItems();
			Iterator<Item> iteItr= itemList.iterator();
			while(iteItr.hasNext()) {
				Item i = iteItr.next();
				System.out.println(i.toString());
			}
			
		}
		t.commit();
		sess.close();
		
	}
}
