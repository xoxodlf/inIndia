package number;

import java.util.Scanner;

public class change {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("가지고 있는 돈을 입력하세요.");
		int m=sc.nextInt();
		System.out.println("5만원권 "+m/50000+"장");
		m=m%50000;
		System.out.println("1만원권 "+m/10000+"장");
		m=m%10000;
		System.out.println("5천원권 "+m/5000+"장");
		m=m%5000;
		System.out.println("1천원권 "+m/1000+"장");
		m=m%1000;
		System.out.println("500원권 "+m/500+"개");
		m=m%500;
		System.out.println("100원권 "+m/100+"개");
		m=m%100;
		System.out.println("50원권 "+m/50+"개");
		m=m%50;
		System.out.println("10원권 "+m/10+"개");
		m=m%10;
		System.out.println("5원권 "+m/5+"개");
		m=m%5;
		System.out.println("1원권 "+m/1+"개");
		m=m%1;
	}
}
