/**
 * @Summary   : 
 * @Package : d2
 * @FileName : MainD2.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 3.  
 * 
 */
package d2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * 
 * @Package : d2
 * @FileName : MainD2.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 3. 
 * 
 */
public class MainD2 {
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
			System.out.println("3.list");
			System.out.println("4.order");
			System.out.println("other number end program");
			product p1=new product();
			String s = r.readLine();
			if(!s.equals("1")&&!s.equals("2")&&!s.equals("3")&&!s.equals("4"))break;
			if(s.equals("1")) {
				System.out.println("Enter Product Id");
				p1.setProduct_Id(Integer.parseInt(r.readLine()));
				System.out.println("Enter Product Name");
				p1.setProduct_name(r.readLine());
				p1.setExpiry_Date(new Date());
				p1.setRate(0);
				sess.persist(p1);
			}else if(s.equals("2")) {
				System.out.println("Enter Product Id");
				p1.setProduct_Id(Integer.parseInt(r.readLine()));
				String hql="from product where Product_ID="+p1.getProduct_Id();
				
				try {
					Query query = sess.createQuery(hql);
					List ee=query.list();
					p1=(product)ee.get(0);
					System.out.println("Enter Product Name");
					p1.setProduct_name(r.readLine());
					System.out.println("If you want update expiry_date press 1 else press any other key");
					if(r.readLine().equals("1"))
						p1.setExpiry_Date(new Date());
					System.out.println("Enter Product Rate");
					p1.setRate(Double.parseDouble(r.readLine()));
					sess.update(p1);
				}catch(Exception e){
					System.out.println(e);
				}
			}
			else if(s.equals("3")) {
				System.out.println("---------------------------------LIST---------------------------------");
				String hql="from product";
				Query query = sess.createQuery(hql);
				List ee=query.list();
				for(Iterator it = ee.iterator(); it.hasNext();) {
					p1=(product) it.next();
					System.out.println(p1.toString());
				}
			}
			else if(s.equals("4")) {
				System.out.println("---------------------------------LIST---------------------------------");
				String hql="from product";
				Query query = sess.createQuery(hql);
				List ee=query.list();
				List<product> pl= new ArrayList<product>();
				List<product> orderList= new ArrayList<product>();
				List<Integer> quantity= new ArrayList<Integer>();
				for(Iterator it = ee.iterator(); it.hasNext();) {
					p1=(product) it.next();
					pl.add(p1);
					System.out.println(p1.toString());
				}
				while(true) {
					try {
						System.out.println("Choose product IDs if you finish order type 'end'");
						String a=r.readLine();
						if(a.equals("end")) {
							break;
						}
						for(product pr:pl) {
							if(pr.getProduct_Id()==Integer.parseInt(a)) {
								System.out.println("How may product do you want?");
								quantity.add(Integer.parseInt(r.readLine()));
								orderList.add(pr);
								System.out.println("Added!\n");
							}
						}
					}catch(Exception e) {
						System.out.println(e);
					}
				}
				float total=0;
				System.out.println("\n---------------------------------Total Bill---------------------------------");
				for(int j=0;j<orderList.size();j++) {
					System.out.println(orderList.get(j).getProduct_Id() + " "+orderList.get(j).getProduct_name()+" "+orderList.get(j).getRate()+"RP * "+quantity.get(j)+" = "+orderList.get(j).getRate()*quantity.get(j)+"RP");
					total+=orderList.get(j).getRate()*quantity.get(j);
				}
				System.out.println("Total amount : "+total+"RP");
				System.out.println("----------------------------------------------------------------------------\n");
			}
			t.commit();
			sess.close();
		}
		
	}
}
