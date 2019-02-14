package J20180123;

import java.util.Scanner;

public class Fibonacci {
	
	static int fibonacci(int n) {
		if(n==2) return 1;
		else if(n==1) return 0;
		else return fibonacci(n-1)+fibonacci(n-2);
		
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			System.out.print(fibonacci(i)+" ");
			i++;
		}
		
		
	}
}
