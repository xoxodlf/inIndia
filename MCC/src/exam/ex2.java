package exam;

import java.util.Scanner;

public class ex2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		String[] st=new String[n];
		int max=0;
		for(int i=0;i<n;i++) {
			st[i]=sc.nextLine();
			max=max>st[i].length()?max:st[i].length();
		}
		for(int i=0;i<max;i++) {
			for(int j=0;j<n;j++) {
				if(i<st[j].length()) {
					System.out.print(st[j].charAt(i)+"  ");
				}else System.out.print("   ");
			}
			System.out.println();
		}
	}
}
