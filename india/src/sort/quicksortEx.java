package sort;

import java.util.Scanner;

class quicksort{
	int array[]=new int [10];
	Scanner sc= new Scanner(System.in);
	void set() {
		for(int i=0;i<10;i++) {
			array[i]=sc.nextInt();
		}
	}
	
	void print() {
		for(int i=0;i<10;i++) {
			System.out.print(array[i]+" ");
		}System.out.println();
		
	}
	void swap(int i,int j) {
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	
	void sort(int i, int j, int p) {
		if(i<j) {
			int left=i;
			int right=p;
			
			while(i<j) {
				while(j>i&&array[j]>array[p])j--;
				while(i<j&&array[i]<array[p])i++;
				if(i==j) {
					break;
				}
				swap(i,j);
				print();
				i++;
			}
			swap(j,p);
			print();
			sort(left,j-1,j-1);
			sort(j+1,right,right);
			
		}
	}
}
//
public class quicksortEx {

	public static void main(String[] args) {
		quicksort a=new quicksort();
		a.set();
		a.sort(0, 9, 9);

	}

}
