package shape;

import java.util.*;

public class drawTriangle {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		
		//first Triangle
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" * ");
			}
			System.out.println("");
		}
		System.out.println("");
		
		//second Triangle
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-(n-i-1);j++) {
				System.out.print(" * ");
			}
			System.out.println("");
		}
		System.out.println("");
		
		//third Triangle
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i>j)System.out.print("   ");
				else System.out.print(" * ");
			}
			System.out.println("");
		}
		System.out.println("");
		
		//fourth Triangle
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i<n-(j+1))System.out.print("   ");
				else System.out.print(" * ");
			}
			System.out.println("");
		}
		System.out.println("");
		
		
	}
}
