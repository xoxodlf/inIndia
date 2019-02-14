/**
 * @Summary   : 
 * @Package : J20180412
 * @FileName : ArrayListEx.java
 * @Author : Yang TaeIl
 * @date : 2018. 4. 12.  
 * 
 */
package J20180412;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
/**
 * 
 * @Package : J20180412
 * @FileName : ArrayListEx.java
 * @Author : Yang TaeIl
 * @date : 2018. 4. 12. 
 * 
 */
public class ArrayListEx {
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("10");
		al.add("20");
		al.add("30");
		al.add("40");
		System.out.println();
		//al.add(1,"BBBBBB");
	//	al.add("CCCCCC");
		//al.remove("AAAAAA");
		//al.remove(1);
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("10");
		al2.add("20");
		al2.add("50");
		
	//	al2.add("4");
		//al.addAll(1,al2);
		//al.addAll(al2);
		//al.removeAll(al2);
		System.out.println(al.size());
		al.retainAll(al2);
		al.set(0, "80");
		System.out.println(al.size());
		for(String s: al)System.out.println(s);
		al.add("20");
		System.out.println(al.contains("80"));
		System.out.println(al.indexOf("80"));
		System.out.println(al.lastIndexOf("20"));
		Collections.swap(al, 0, 1);
		//Collections.shuffle(al);
		Collections.reverse(al);
		Collections.sort(al,Collections.reverseOrder());
		ListIterator itr =al.listIterator(0);
		while(itr.hasNext()) System.out.println(itr.next());
		//		ArrayList<String> al2 = new ArrayList<String>(al);
//		for(String s: al2)System.out.println(s);
//		ArrayList<String> al3 = new ArrayList<String>(2);
//		al3.add("1");
//		System.out.println(al3.size());
		
		
		
		//assignment
		//ArrayList<String> al5 = (ArrayList<String>) al.subList(0, 1);
		//String[] array1=(String[]) al.toArray();
		al2=(ArrayList<String>) al.clone();
		for(int i=0;i<al2.size();i++) {
			System.out.println(al2.get(i));
		}
	}
}
