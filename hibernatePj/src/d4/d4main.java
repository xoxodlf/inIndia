/**
 * @Summary   : 
 * @Package : d4
 * @FileName : d4main.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 17.  
 * 
 */
package d4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import d3.book;

/**
 * 
 * @Package : d4
 * @FileName : d4main.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 17.
 * 
 */
public class d4main {

	public static void main(String[] args) throws IOException {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		while (true) {
			Session sess = factory.openSession();
			Transaction t = sess.beginTransaction();
			InputStreamReader i = new InputStreamReader(System.in);
			BufferedReader r = new BufferedReader(i);

			System.out.println("1.insert");
			System.out.println("2.List order by grade");
			System.out.println("3.The Topper in each grade");
			System.out.println("4.Fail Student List");
			System.out.println("5.List order by total");
			System.out.println("6.Average marks");
			System.out.println("7.Rank");
			polo p1;
			String s = r.readLine();
			if (!s.equals("1") && !s.equals("2") && !s.equals("3") && !s.equals("4") && !s.equals("5")&& !s.equals("6")&& !s.equals("7"))
				break;
			if (s.equals("1")) {
				try {
					System.out.println("Enter Student ID");
					int id = Integer.parseInt(r.readLine());
					System.out.println("Enter Student name");
					String name = r.readLine();
					System.out.println("Enter Sub1 marks");
					int sub1 = Integer.parseInt(r.readLine());
					System.out.println("Enter Sub2 marks");
					int sub2 = Integer.parseInt(r.readLine());
					System.out.println("Enter Sub3 marks");
					int sub3 =Integer.parseInt(r.readLine());
					p1 = new polo(id, name, sub1, sub2, sub3);
					sess.persist(p1);
				}catch(Exception e) {
					System.out.println(e);
				}
			} else if (s.equals("2")) {
				try {
					Criteria cr = sess.createCriteria(polo.class);
					cr.addOrder(Order.asc("grade"));
					List ee = cr.list();
					for (Iterator it = ee.iterator(); it.hasNext();) {
						p1 = (polo) it.next();
						System.out.println(p1.toString());
					}
				} catch (Exception e) {
					System.out.println(e);
				}
			}
			else if (s.equals("3")) {
				try {
					Criteria cr = sess.createCriteria(polo.class);
					cr.setProjection(Projections.max("sub1"));
					List ee = cr.list();
					System.out.println("Sub1 Top score = "+ee.get(0));
				} catch (Exception e) {
					System.out.println(e);
				}
				try {
					Criteria cr = sess.createCriteria(polo.class);
					cr.setProjection(Projections.max("sub2"));
					List ee = cr.list();
					System.out.println("Sub2 Top score = "+ee.get(0));
				} catch (Exception e) {
					System.out.println(e);
				}
				try {
					Criteria cr = sess.createCriteria(polo.class);
					cr.setProjection(Projections.max("sub3"));
					List ee = cr.list();
					System.out.println("Sub3 Top score = "+ee.get(0));
				} catch (Exception e) {
					System.out.println(e);
				}
			}else if (s.equals("4")) {
				try {
					Criteria cr = sess.createCriteria(polo.class);
					cr.add(Restrictions.eq("result", "Fail"));
					List ee = cr.list();
					System.out.println("Fail Student : "+ee.size());
					for (Iterator it = ee.iterator(); it.hasNext();) {
						p1 = (polo) it.next();
						System.out.println(p1.toString());
					}
				} catch (Exception e) {
					System.out.println(e);
				}
			}else if (s.equals("5")) {
				try {
					Criteria cr = sess.createCriteria(polo.class);
					cr.addOrder(Order.desc("total"));
					List ee = cr.list();
					for (Iterator it = ee.iterator(); it.hasNext();) {
						p1 = (polo) it.next();
						System.out.println(p1.toString());
					}
				} catch (Exception e) {
					System.out.println(e);
				}
			}else if (s.equals("6")) {
				try {
					Criteria cr = sess.createCriteria(polo.class);
					cr.setProjection(Projections.avg("sub1"));
					List ee = cr.list();
					System.out.println("sub1 averge marks : "+ee.get(0));
				} catch (Exception e) {
					System.out.println(e);
				}
				try {
					Criteria cr = sess.createCriteria(polo.class);
					cr.setProjection(Projections.avg("sub2"));
					List ee = cr.list();
					System.out.println("sub2 averge marks : "+ee.get(0));
				} catch (Exception e) {
					System.out.println(e);
				}
				try {
					Criteria cr = sess.createCriteria(polo.class);
					cr.setProjection(Projections.avg("sub3"));
					List ee = cr.list();
					System.out.println("sub3 averge marks : "+ee.get(0));
				} catch (Exception e) {
					System.out.println(e);
				}
				try {
					Criteria cr = sess.createCriteria(polo.class);
					cr.setProjection(Projections.avg("total"));
					List ee = cr.list();
					System.out.println("total averge marks : "+ee.get(0));
				} catch (Exception e) {
					System.out.println(e);
				}
			}else if (s.equals("7")) {
				try {
					Criteria cr = sess.createCriteria(polo.class);
					cr.addOrder(Order.desc("total"));
					cr.add(Restrictions.eq("result", "Pass"));
					List ee = cr.list();
					int dupli=0;
					for(int j=0;j<ee.size();j++) {
						if(j!=0) {
							if(((polo)ee.get(j-1)).getTotal()==((polo)ee.get(j)).getTotal())
								System.out.println(j+1-(++dupli)+" : "+ee.get(j).toString());
							else {
								dupli=0;
								System.out.println(j+1-(dupli)+" : "+ee.get(j).toString());
							}
						}else {
							System.out.println(j+1+" : "+ee.get(j).toString());
						}
						
					}
				} catch (Exception e) {
					System.out.println(e);
				}
			}
			
			t.commit();
			sess.close();
		}

	}
}
