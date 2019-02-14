package J20180226;

import java.util.Scanner;

/**
 * 
 * 
 * @Package : J20180226
 * @FileName : stringCompare.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 26. 
 *
 */
public class stringCompare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		System.out.println(a.compareTo(b));

		System.out.println(a+b);
		System.out.println(a.concat(b));
	}

}
