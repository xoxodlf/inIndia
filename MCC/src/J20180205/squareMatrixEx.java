package J20180205;

import java.util.Scanner;
import java.util.Arrays;
public class squareMatrixEx {
	public static void rearrange(int m, int[][] a) {
		int sort[]=new int[(m-2)*(m-2)];
		int k=0;
		for(int i=1;i<m-1;i++) {
			for(int j=1;j<m-1;j++) {
				sort[k]=a[i][j];
				k++;
			}
		}
		Arrays.sort(sort);
		k=0;
		for(int i=1;i<m-1;i++) {
			for(int j=1;j<m-1;j++) {
				a[i][j]=sort[k];
				k++;
			}
		}
	}
	
	public static void diagonal(int m, int[][] a) {
		int sum=0;
		for(int i=0;i<m;i++) {
			for(int j=0;j<m;j++) {
				if(i==j||i+j==m-1) {
					sum=sum+a[i][j];
					System.out.print(" "+a[i][j]+" ");
				}else System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("\nsum of the diagonal elements = "+sum );
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m = sc.nextInt();
		if(m<=3||m>=10) {
			System.out.println("The matrix size is out of range");
			return;
		}
		int matrix[][]=new int[m][m];
		for(int i=0;i<m;i++) {
			for(int j=0;j<m;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("Origin Matrix");
		for(int i=0;i<m;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Rearranged Matrix");
		rearrange(m,matrix);
		for(int i=0;i<m;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Diagonal Matrix");
		diagonal(m,matrix);
		
	}

}
