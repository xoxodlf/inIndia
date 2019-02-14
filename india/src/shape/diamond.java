package shape;

import java.util.*;

public class diamond {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = n/2;
		for(int i=0;i<m;i++) {
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(j>=(m-i)&&j<=(m+i)) System.out.print(" * ");
				else System.out.print("   ");
			}
			System.out.println("");
		}
		for(int i=m;i>=0;i--) {
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(j>=(m-i)&&j<=(m+i)) System.out.print(" * ");
				else System.out.print("   ");
			}
			System.out.println("");
		}
	}
}
