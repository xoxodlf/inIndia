/**
 * @Summary   : 
 * @Package : J20180226
 * @FileName : StringEx.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 26.  
 * 
 */
package J20180226;

/**
 * 
 * @Package : J20180226
 * @FileName : StringEx.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 26. 
 * 
 */
public class StringEx {
	
	public static void main(String args[]) {
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("JAVA111111111111");
		System.out.println(sb);

		System.out.println(sb.capacity());
		
		sb.insert(2,"GOOD");
		System.out.println(sb);
		
		sb.replace(0, 2, "Replace");
		System.out.println(sb);
		String s1=sb.toString();
		s1=s1.replace("JAVA", "C++");
		System.out.println(s1);
		sb.delete(1, 3);
		System.out.println(sb);
		sb.reverse();
		sb.ensureCapacity(32);
		System.out.println(sb.capacity());
		sb.ensureCapacity(50);
		System.out.println(sb.capacity());
	}
}
