package sort;

import java.util.Scanner;


public class selectionSortEx {
	/**
	 * 
	 * ���ĸ޼ҵ�
	 *
	 * @Method Name : selectionSort
	 * @param a	������ �迭
	 * @return ���ĵ� �迭�� ����
	 */
	public static int[] selectionSort(int a[]) {
		int now=0;
		int min=a[0];
		int minIndex=0;
		for(int i=0;i<a.length;i++) {
			
			for(int j=now;j<a.length;j++) {
				if(min>a[j]) {
					min=a[j];
					minIndex=j;
				}
			}
			a[minIndex]=a[i];
			a[i]=min;
			if(now+1<a.length)min=a[++now];
			minIndex=now;
			for(int k=0;k<a.length;k++) {
				System.out.print(a[k]+" ");
			}
			System.out.println();
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int array[]=new int[10];
		for(int i=0; i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		for(int i=0; i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		selectionSort(array);
	}

}
