package J20180124;

import java.util.Scanner;

public class EvilNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("INPUT : " + num);
		String binary="";
		while(num>0) {
			binary=binary+(num%2);
			num=num/2;
		}
		int cnt=0;
		System.out.print("BINARY EQUVALENT : ");
		for(int i=binary.length()-1;i>=0;i--) {
			System.out.print(binary.charAt(i));
			if(binary.charAt(i)=='1') {
				cnt++;
			}
		}
		
		System.out.println("\n"+"NO OF 1's : "+cnt);
		if(cnt%2==0) {
			System.out.println("EVIL NUMBER");
		}else {
			System.out.println("NOT AN EVIL NUMBER");
		}
		
	}

}
