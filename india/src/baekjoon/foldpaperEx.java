/**
 * @Summary   : 
 * @Package : baekjoon
 * @FileName : foldpaper.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 14.  
 * 
 */
package baekjoon;

import java.util.Scanner;

/**
 * 
 * @Package : baekjoon
 * @FileName : foldpaperEx.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 14. 
 * 
 */
public class foldpaperEx {
	static boolean canF=true;
	static char[] fold;
	static int center;
	static void canFold(int n,char[] fold) {
		if(n+center>=fold.length||center-n<0) {
			return;
		}else {
			if(canF) {
				if(fold[center+n]!=fold[center-n]) {
					System.out.println(n);
					canFold(n+1,fold);
				}else {
					canF=false;
				}
			}
		}
	}
	/**
	 * 
	 *
	 * @Method Name : main
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		String[] a= new String[n];
		for(int i=0; i<n;i++) {
			a[i]= sc.next();
		}
		for(int i=0;i<n;i++) {
			fold=a[i].toCharArray();
			center = fold.length/2;
			canFold(1,fold);
			if(canF)System.out.println("YES");
			else System.out.println("NO");
			canF=true;
		}

	}

}
