/**
 * @Summary   : 
 * @Package : J20180308
 * @FileName : goldenbach.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 8.  
 * 
 */
package J20180308;

import java.util.Scanner;

/**
 * 
 * @Package : J20180308
 * @FileName : goldenbach.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 8. 
 * 
 */
public class goldenbach {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int prime[]=new int[50];
		int cnt=0;
		if(9>=n||n>=50) {
			System.out.println("INVALID INPUT");
			return;
		}
		if(n%2==1) {
			System.out.println("INVALID INPUT, ODD");
			return;
		}
		
		boolean a[]=new boolean[51];
		for(int i=2;i<51;i++) {
			if(a[i]==false) {
				prime[cnt++]=i;
				int multi=1;
				int j=2;
				while(j<51) {
					multi=i*j++;
					if(multi>50)break;
					a[multi]=true;
				}
			}
		}
		for(int i=1;i<=cnt;i++) {
			for(int j=i;j<cnt;j++) {
				if(prime[i]+prime[j]>n)break;
				if(prime[i]+prime[j]==n) {
					System.out.println(prime[i]+", "+prime[j]);
				}
			}
		}
	}

}
