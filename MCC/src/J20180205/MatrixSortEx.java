package J20180205;

import java.util.Scanner;
import java.util.Arrays;


public class MatrixSortEx {

	public static void show(int[][] a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(Arrays.toString(a[i]));
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		
		for(int i=0;i<n;i++) {
			a[i]=new int[n];
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int max=a[0][0];
		int xM=0;
		int yM=0;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(max<a[i][j]) {
					max=a[i][j];
					xM=i;
					yM=j;
				}
			}
		}
		System.out.println("Max num is "+max+ ", It is "+(xM+1)+","+(yM+1));
		int sMax=-1;
		xM=0;
		yM=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(max==a[i][j])continue;
				if(sMax<a[i][j]) {
					sMax=a[i][j];
					xM=i;
					yM=j;
				}
			}
		}
		System.out.println("Second Max num is "+sMax+ ", It is "+(xM+1)+","+(yM+1));
		
		show(a);
		System.out.println();
		for(int i=0;i<n;i++) {
			Arrays.sort(a[i]);
		}
		show(a);
		System.out.println();
		
		
	}

}
