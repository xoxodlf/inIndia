package J20180123;

import java.util.Scanner;

public class Factorial2 {
	
	static int fac(int num) {
		if(num==1)return 1;
		else return num*fac(num-1);
	}
	
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		
		System.out.println(fac(num));
	}
}
