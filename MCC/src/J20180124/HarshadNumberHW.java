package J20180124;

import java.util.Scanner;

public class HarshadNumberHW {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m= sc.nextInt();
		int cnt=0;
		System.out.println("Harshad Number");
		for(int i=1;i<=m;i++) {
			int n=i;
			int sum=0;
			while(n>0) {
				sum=sum+n%10;
				n=n/10;
			}
			if(i%sum==0) {
				System.out.print(i+" ");
				cnt++;
				if(cnt%10==0)System.out.println("");
			}
		}
	}

}
