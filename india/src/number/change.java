package number;

import java.util.Scanner;

public class change {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("������ �ִ� ���� �Է��ϼ���.");
		int m=sc.nextInt();
		System.out.println("5������ "+m/50000+"��");
		m=m%50000;
		System.out.println("1������ "+m/10000+"��");
		m=m%10000;
		System.out.println("5õ���� "+m/5000+"��");
		m=m%5000;
		System.out.println("1õ���� "+m/1000+"��");
		m=m%1000;
		System.out.println("500���� "+m/500+"��");
		m=m%500;
		System.out.println("100���� "+m/100+"��");
		m=m%100;
		System.out.println("50���� "+m/50+"��");
		m=m%50;
		System.out.println("10���� "+m/10+"��");
		m=m%10;
		System.out.println("5���� "+m/5+"��");
		m=m%5;
		System.out.println("1���� "+m/1+"��");
		m=m%1;
	}
}
