package FemPackage;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import FemPackage.User;

public class UserDAO {

	public String addUserDetails(String userName, String password, String email,
            String phone, String city) {
        try {
    	    Configuration cfg=new Configuration();  
    	    cfg.configure("hibernate.cfg.xml");//1.populates the data of the configuration file  
    	      
    	    //2.creating session factory object  
    	    SessionFactory factory=cfg.buildSessionFactory();  
    	      
    	    //3.creating session object  
    	    Session session=factory.openSession();  

 
            // 4. Starting Transaction
            Transaction transaction = session.beginTransaction();
            User user = new User();
            user.setUserName(userName);
            user.setPassword1(password);
            user.setEmail(email);
            user.setCity(city);
            user.setPhone(phone);
            session.save(user);
            transaction.commit();
            //System.out.println("\n\n Details Added \n");
            
 
        } catch (HibernateException e) {
            //System.out.println(e.getMessage());
           // System.out.println("error");
        	return e.getMessage();
        }
        return "Details Added";
	}

}
