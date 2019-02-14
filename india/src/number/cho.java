package number;

import java.util.Scanner;

public class cho {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt(), m=sc.nextInt();
		int bn = n>m?n:m;
		int sn = n>m?m:n;
		for(int i=sn;i>0;i--){
			if(sn%i==0) {
				if(bn%i==0) {
					System.out.println("최대공약수는 "+i);
					break;
				}
			}
		}
		for(int i=1;i<=sn;i++) {
			if((bn*i)%sn==0) {
				System.out.println("최소공배수는  "+bn*i);
				break;
			}
		}
		
		
	}
}
