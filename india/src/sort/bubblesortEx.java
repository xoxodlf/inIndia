package sort;

import java.util.Scanner;

class bubbleSort{
	Scanner sc= new Scanner(System.in);
	int[] array=new int[10];
	
	void set() {
		for(int i=0;i<10;i++) {
			array[i]=sc.nextInt();
		}
		print();
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
	void sort(){
		for(int i=1;i<10;i++) {
			for(int j=1;j<10-i+1;j++) {
				if(array[j-1]>array[j]) {
					swap(j,j-1);
					print();
				}
			}
		}
		
	}
}


public class bubblesortEx {

	public static void main(String[] args) {
		bubbleSort a =new bubbleSort();
		a.set();
		a.sort();

	}

}
