/**
 * @Summary   : 
 * @Package : J20180223
 * @FileName : Jeerray.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 23.  
 * 
 */
package J20180223;

import java.util.Scanner;

/**
 * 
 * @Package : J20180223
 * @FileName : Jeerray.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 23. 
 * 
 */
public class Jeerray {
	static void arrange(int[]array,int[]result,boolean[]bary,int center,int n) {
		if(center-n<0||(center+n==array.length)) {
			return;
		}
		int max=-1;
		int smax=-1;
		if(n==0) {
			for(int i=0;i<array.length;i++) {
				if(!bary[i]) {
					if(max==-1)max=i;
					else max=array[i]>array[max]?i:max;
				}
			}
			result[center+n]=array[max];
			bary[max]=true;
		}else {
			for(int i=0;i<array.length;i++) {
				if(!bary[i]) {
					if(max==-1)max=i;
					else max=array[i]>array[max]?i:max;
				}
			}
			for(int i=0;i<array.length;i++) {
				if(!bary[i]&&array[i]!=array[max]) {
					if(smax==-1) {
						smax=i;
					}else {
						smax=array[i]>array[smax]?i:smax;
					}
				}
			}
			System.out.println(max+" "+smax);
			bary[max]=true;
			bary[smax]=true;
			result[center+n]=array[max];
			result[center-n]=array[smax];
		}
		arrange(array,result,bary,center,n+1);
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int center = (n-1)/2;
		int origin[]=new int[n];
		int result[]=new int[n];
		boolean[]bary=new boolean[n];
		for(int i=0;i<n;i++) {
			origin[i]=sc.nextInt();
		}
		arrange(origin,result,bary,center,0);
		for(int i=0;i<n;i++) {
			System.out.print(result[i]+" ");
		}
	}

}
