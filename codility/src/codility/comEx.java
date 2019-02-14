/**
 * @Summary   : 
 * @Package : codility
 * @FileName : camEx.java
 * @Author : Yang TaeIl
 * @date : 2018. 12. 11.  
 * 
 */
package codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @Package : codility
 * @FileName : camEx.java
 * @Author : Yang TaeIl
 * @date : 2018. 12. 11. 
 * 
 */
public class comEx implements Comparable<comEx>{
	String name;
	int age;
	
	public comEx(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int compareTo(comEx o) {
		int result = 1;
		if(getAge()<o.getAge()) result = -1;
		else if(getAge()==o.getAge()) result = 0;
		return result;
	}
	
	public static void main(String[] args) {
		comEx a = new comEx("x",3);
		
		List<comEx> li = new ArrayList<comEx>();
		li.add(a);
		a = new comEx("b",1);
		li.add(a);
		a = new comEx("c",2);
		li.add(a);
		Collections.sort(li);
		
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i).getName()+" "+li.get(i).getAge());
		}
	}
}
