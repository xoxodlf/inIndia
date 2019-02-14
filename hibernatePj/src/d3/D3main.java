/**
 * @Summary   : 
 * @Package : d3
 * @FileName : D3main.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 16.  
 * 
 */
package d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import d2.product;

/**
 * 
 * @Package : d3
 * @FileName : D3main.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 16. 
 * 
 */
public class D3main {

	public static void main(String[] args)  throws Exception{
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		while(true) {
			Session sess = factory.openSession();
			Transaction t = sess.beginTransaction();
			InputStreamReader i = new InputStreamReader(System.in);
			BufferedReader r = new BufferedReader(i);
			
			System.out.println("1.insert");
			System.out.println("2.Find how many books by title");
			System.out.println("3.Find books by author");
			System.out.println("4.Find total books in library");
			System.out.println("5.List order by author");
			System.out.println("other number end program");
			book b1 = new book();
			String s = r.readLine();
			if(!s.equals("1")&&!s.equals("2")&&!s.equals("3")&&!s.equals("4")&&!s.equals("5"))break;
			if(s.equals("1")) {
				System.out.println("Enter Book ID");
				b1.setBno(Integer.parseInt(r.readLine()));
				System.out.println("Enter Book title");
				b1.setTitle(r.readLine());
				System.out.println("Enter Book author");
				b1.setAuthor(r.readLine());
				System.out.println("Enter Book number of books");
				b1.setNumberOfBooks(Integer.parseInt(r.readLine()));
				Date d1 = new Date();
				System.out.println("Enter Book publications year");
				d1.setYear(Integer.parseInt(r.readLine()));
				System.out.println("Enter Book publications month");
				d1.setMonth(Integer.parseInt(r.readLine()));
				System.out.println("Enter Book publications date");
				d1.setDate(Integer.parseInt(r.readLine()));
				b1.setPublications(d1);
				sess.persist(b1);
			}else if(s.equals("2")) {
				System.out.println("Enter Book title");
				b1.setTitle(r.readLine());
				String hql="from book where title= :title";
				try {
					Query query = sess.createQuery(hql);
					query.setParameter("title", b1.getTitle());
					List ee=query.list();
					for(Iterator it = ee.iterator(); it.hasNext();) {
						b1=(book) it.next();
						System.out.println(b1.getTitle()+" - author : "+b1.getAuthor()+", Number of books : "+b1.getNumberOfBooks()+"");
					}
				}catch(Exception e){
					System.out.println(e);
				}
			}else if(s.equals("3")) {
				System.out.println("Enter Book Author");
				b1.setAuthor(r.readLine());
				String hql="from book where author='"+b1.getAuthor()+"'";
				try {
					Query query = sess.createQuery(hql);
					List ee=query.list();
					System.out.println("\n---------------------------------LIST---------------------------------");
					for(Iterator it = ee.iterator(); it.hasNext();) {
						b1=(book) it.next();
						System.out.println(b1.getTitle()+" - author : "+b1.getAuthor()+", Number of books : "+b1.getNumberOfBooks()+"");
					}
					System.out.println("----------------------------------------------------------------------\\n");
				}catch(Exception e){
					System.out.println(e);
				}
			}else if(s.equals("4")) {
				System.out.print("\nTotal books in the library is ");
				String hql="from book";
				try {
					int cnt=0;
					Query query = sess.createQuery(hql);
					List ee=query.list();
					for(Iterator it = ee.iterator(); it.hasNext();) {
						b1=(book) it.next();
						System.out.println(b1.toString());
					}
					System.out.println(cnt+"\n");
				}catch(Exception e){
					System.out.println(e);
				}
			}else if(s.equals("5")) {
				System.out.println("\n-------------------------List order by author-------------------------");
				String hql="from book order by author";
				try {
					Query query = sess.createQuery(hql);
					List ee=query.list();
					for(Iterator it = ee.iterator(); it.hasNext();) {
						b1=(book) it.next();
						System.out.println(b1.toString());
					}
				}catch(Exception e){
					System.out.println(e);
				}
				System.out.println("------------------------------------------------------------------------");
			}
			
			t.commit();
			sess.close();
		}
	}

}
