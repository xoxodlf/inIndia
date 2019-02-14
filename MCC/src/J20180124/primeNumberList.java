package J20180124;

import java.util.Scanner;

public class primeNumberList {
	public static void main(String args[]) {
		int cnt =0;int cntLine=0;
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt()+1;
		for(int i=1;i<n;i++) {
			for(int j=1;j<=i;j++) {
				if(i%j==0)cnt++;
			}
			if(cntLine==10) {
				System.out.println("");
				cntLine=0;
			}
			if(cnt==2) {
				System.out.print(i+" ");
				cntLine++;
			}
			cnt=0;
		}
	}
		
	
}
