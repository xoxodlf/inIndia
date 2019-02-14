/**
 * @Summary   : 
 * @Package : d1
 * @FileName : Main.java
 * @Author : Yang TaeIl
 * @date : 2018. 7. 31.  
 * 
 */
package d1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * 
 * @Package : d1
 * @FileName : Main.java
 * @Author : Yang TaeIl
 * @date : 2018. 7. 31. 
 * 
 */
public class Main {

	public static void main(String[] args) throws Exception{
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		while(true) {
			Session sess = factory.openSession();
			
			Transaction t = sess.beginTransaction();
			
			InputStreamReader i = new InputStreamReader(System.in);
			BufferedReader r = new BufferedReader(i);
			System.out.println("1.insert");
			System.out.println("2.update");
			System.out.println("3.delete");
			System.out.println("other number end program");
			String s = r.readLine();
			if(!s.equals("1")&&!s.equals("2")&&!s.equals("3"))break;
			employee e1= new employee();
			if(s.equals("1")) {
				System.out.println("Enter Id");
				e1.setId(Integer.parseInt(r.readLine()));
				System.out.println("Enter First Name");
				e1.setFirstName(r.readLine());
				System.out.println("Enter Last Name");
				e1.setLastName(r.readLine());
				sess.persist(e1);
				
				System.out.println("insert success");
			}else if(s.equals("2")) {
				System.out.println("Enter Id");
				e1.setId(Integer.parseInt(r.readLine()));
				System.out.println("Enter First Name");
				e1.setFirstName(r.readLine());
				System.out.println("Enter Last Name");
				e1.setLastName(r.readLine());
				sess.update(e1);
				System.out.println("update success");
			}else if(s.equals("3")) {
				System.out.println("Enter Id");
				e1.setId(Integer.parseInt(r.readLine()));
				sess.delete(e1);
				System.out.println("delete success");
			}
			t.commit();
			sess.close();
		}
		
		
		
		
		
		
	}

}
