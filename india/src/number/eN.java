package number;

import java.util.Scanner;

public class eN {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();int cnt=0;
		boolean back=false;
		for(int i=1;;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(i);
			}
			if(i==n)back=true;
			if(back) i=i-2;
			cnt++;
			if(cnt==(2*n-1))break;
		}
	}
}
