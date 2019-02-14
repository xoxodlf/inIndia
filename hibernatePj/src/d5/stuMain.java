/**
 * @Summary   : 
 * @Package : d5
 * @FileName : stuMain.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 18.  
 * 
 */
package d5;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * 
 * @Package : d5
 * @FileName : stuMain.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 18. 
 * 
 */
public class stuMain {

	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session sess = factory.openSession();
		Transaction t = sess.beginTransaction();
		
		RelnStudentCourse course1= new RelnStudentCourse();
		course1.setCourse("Korean");
		RelnStudentCourse course2= new RelnStudentCourse();
		course2.setCourse("English");
		RelnStudentCourse course3= new RelnStudentCourse();
		course3.setCourse("Tamil");
		RelnStudentCourse course4= new RelnStudentCourse();
		course4.setCourse("Japanese");
		
		List<RelnStudentCourse> list1 = new ArrayList<RelnStudentCourse>();
		list1.add(course1);
		list1.add(course2);
		
		List<RelnStudentCourse> list2 = new ArrayList<RelnStudentCourse>();
		list2.add(course3);
		list2.add(course4);
		
		RelnStudent stu1= new RelnStudent();
		stu1.setName("Taeil");
		stu1.setStudent(list1);
		
		RelnStudent stu2= new RelnStudent();
		stu2.setName("Gyeole");
		stu2.setStudent(list2);
		
		sess.persist(stu1);
		sess.persist(stu2);
		System.out.println("Getting in");
		
		Query query= sess.createQuery("from RelnStudent");
		List<RelnStudent> list = query.list();
		Iterator<RelnStudent> itr = list.iterator();
		
		while(itr.hasNext()) {
			RelnStudent s= itr.next();
			System.out.println("Name: "+s.getName());
			
			List<RelnStudentCourse> courseList= s.getStudent();
			Iterator<RelnStudentCourse> courseItr= courseList.iterator();
			while(courseItr.hasNext()) {
				RelnStudentCourse q1 = courseItr.next();
				System.out.println(q1.getCourse());
			}
			
		}
		t.commit();
		sess.close();
		System.out.println("success");
	}

}
