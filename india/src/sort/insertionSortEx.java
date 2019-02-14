package sort;

import java.util.Scanner;

class insertionSort{
	Scanner sc= new Scanner(System.in);
	int[] array=new int[10];
	
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
	
	void sort(){
		for(int i=1;i<10;i++) {
			int temp=array[i];
			for(int j=i-1;j>=0;j--) {
				if(array[j]>temp) {
					array[j+1]=array[j];
					array[j]=temp;
				}else {
					array[j+1]=temp;
					break;
				}
			}
			print();
		}
	}
}

public class insertionSortEx {

	public static void main(String[] args) {
		insertionSort a =new insertionSort();
		a.set();
		System.out.println("----------------------");
		a.sort();
	}

}
