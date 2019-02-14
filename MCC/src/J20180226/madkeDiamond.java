/**
 * @Summary   : 
 * @Package : J20180226
 * @FileName : madkeDiamond.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 26.  
 * 
 */
package J20180226;

import java.util.Scanner;

/**
 * 
 * @Package : J20180226
 * @FileName : madkeDiamond.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 26. 
 * 
 */
public class madkeDiamond {
	public static void printLower(char[] c,int n) {
		if(c.length/2+n==c.length)return;
		for(int i=0;i<c.length;i++) {
			if(i<c.length/2+n&&i>c.length/2-n)System.out.print(" ");
			else System.out.print(c[i]);
		}
		System.out.println();
		printLower(c,n+1);
	}
	
	public static void printUper(char[] c,int n) {
		if(n==-1)return;
		for(int i=0;i<c.length;i++) {
			if(i<c.length/2+n&&i>c.length/2-n)System.out.print(" ");
			else System.out.print(c[i]);
		}
		System.out.println();
		printUper(c,n-1);
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String origin=sc.next();
		printLower(origin.toCharArray(),0);
		printUper(origin.toCharArray(),origin.length()/2-1);
	}
}
