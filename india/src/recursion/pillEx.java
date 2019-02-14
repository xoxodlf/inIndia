/**
 * @Summary   : 
 * @Package : recursion
 * @FileName : pillEx.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 12.  
 * 
 */
package recursion;

import java.util.Scanner;

/**
 * �˾�Ա� ����� �� ���ϴ� �˰���
 * @Package : recursion 
 * @FileName : pillEx.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 12. 
 * 
 */

public class pillEx {
	
	/**
	 * 
	 * �˾� ���ϴ� �޼ҵ� ���
	 *
	 * @Method Name : pillCnt
	 * @param full �Ѿ�¥�� �˾�
	 * @param half ����¥�� �˾�
	 * @param pillArray �˾� ���� �����ϴ� �迭
	 * @return
	 */
	static long pillCnt(int full, int half,long [][]pillArray) {
		if((half==0&&full==1)||full==0) {
			pillArray[full][half]=1;
			return 1;
		}else if(half<0) {
			return 0;
		}
		if(pillArray[full][half]==0) {
			pillArray[full][half]=pillCnt(full-1,half+1,pillArray)+pillCnt(full,half-1,pillArray);
		}
		return pillArray[full][half];
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//int n=sc.nextInt();
		for(int i=1;i<31;i++) {
			long pillArray[][]=new long[2*i+1][2*i+1];
			System.out.println(i+" : "+pillCnt(i,0,pillArray));
		}
	}
}
