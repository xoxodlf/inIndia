package baekjoon;

import java.util.Scanner;

/**
 * 
 * 
 * @Package : baekjoon
 * @FileName : baek2606.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 27. 
 *
 */


public class baek2606 {
	static int cnt =0;
	public static void seek(boolean link[][],int numberOfComputer,int num,boolean canVi[]) {
		//System.out.println("1");
		int[] linkedArray=new int[numberOfComputer];
		int cntInside=0;
		for(int i=1;i<numberOfComputer+1;i++) {
			if(link[num][i]) {
				if(!canVi[i]) {
					linkedArray[cntInside]=i;
					canVi[i]=true;
					cntInside++;
				}
			}
		}
		for(int i=0;i<numberOfComputer+1;i++) {
			System.out.println(canVi[i]);
		}
		cnt=cnt+cntInside;
		System.out.println("///////////////////////////////");
		for(int i=0;i<cntInside;i++) {
			seek(link,numberOfComputer,linkedArray[i],canVi);
		}
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int numberOfComputer=sc.nextInt();
		int n=sc.nextInt();
		boolean link[][]=new boolean[numberOfComputer+1][numberOfComputer+1];
		boolean canVi[]=new boolean[numberOfComputer+1];
		for(int i=0;i<n;i++) {
			int x=sc.nextInt();int y=sc.nextInt();
			link[x][y]=true;link[y][x]=true;
			System.out.println(i);
		}
		seek(link,numberOfComputer,1,canVi);
		System.out.println(cnt-1);
	}

}
