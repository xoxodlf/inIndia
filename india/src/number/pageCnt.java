package number;

import java.util.Scanner;

public class pageCnt {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		int page[]= new int[10];
		
		for(int i=1;i<=n;i++) {
			int a=i;
			while(a>0) {
				page[a%10]++;
				a=a/10;
			}
		}
		for(int i=0;i<page.length;i++) {
			System.out.print(page[i]+" ");
		}
		
	}

}
