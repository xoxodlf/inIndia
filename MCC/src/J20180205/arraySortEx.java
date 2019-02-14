package J20180205;

import java.util.Arrays;
import java.util.Scanner;
public class arraySortEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int marks[]=new int[sc.nextInt()];
		for(int i=0;i<marks.length;i++) {
			marks[i]=sc.nextInt();
		}
		System.out.println("before "+Arrays.toString(marks));
		
		Arrays.sort(marks);
		System.out.println("after "+Arrays.toString(marks));
		
		
		
	}
		

}

