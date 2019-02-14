
package baekjoon;

import java.util.Scanner;
import java.util.Arrays;
class makePassword{
	int n,m;
	char[] origin;
	
	makePassword(char[] a,int n, int m){
		this.origin=a;
		this.n=n;
		this.m=m;
		Arrays.sort(origin);
	}
	void make(String s, int t) {
		if(t==m)return;
		s=s+origin[t];
		//System.out.println(s);
		if(s.length()==n) {
			int cntJ=0;
			int cntM=0;
			for(int i=0;i<n;i++) {
				if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
					cntM++;
				}else cntJ++;	
			}
			if(cntM>=1&&cntJ>=2)System.out.println(s);
			return;
		}else {
			for(int i=t+1;i<=m;i++) {
				make(s,i);
			}
		}
		
	}
}
/**
 * 
 * @Package : baekjoon
 * @FileName : makePasswordEx.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 15. 
 * 
 */
public class makePasswordEx {

	/**
	 * 
	 *
	 * @Method Name : main
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		char[]a=new char[m];
		for(int i =0;i<m;i++) {
			a[i]=sc.next().charAt(0);
		}
		makePassword b= new makePassword(a,n,m);
		for(int i=0;i<=m-n;i++) {
			b.make("", i);
		}
			

	}

	

}
