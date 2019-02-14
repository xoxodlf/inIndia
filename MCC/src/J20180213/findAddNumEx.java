/**
 * @Summary   : 
 * @Package : J20180213
 * @FileName : findAddNumEx.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 13.  
 * 
 */
package J20180213;

import java.util.Scanner;

interface sumX{
	void find(int i);
}


class findAddNum implements sumX{
	int n;
	findAddNum(int n){
		this.n=n;
	}
	
	public void find(int i) {
		int sum=0;
		int cnt=0;
		int sumArray[]=new int[n-i];
		for(;i<n;i++) {
			if(sum<n) {
				sum=sum+i;
				sumArray[cnt++]=i;
			}else if(sum==n) {
				for(int j=0;j<cnt;j++) {
					System.out.print(sumArray[j]+" ");
				}
				System.out.println();
				return;
			}else return;
		}
	}
}

/**
 * 
 * @Package : J20180213
 * @FileName : findAddNumEx.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 13. 
 * 
 */
public class findAddNumEx {

	/**
	 * 
	 *
	 * @Method Name : main
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int m=sc.nextInt();
		findAddNum a= new findAddNum(m);
		for(int i=1;i<m;i++) {
			a.find(i);
		}

	}

}
