package shape;

import java.util.Scanner;

public class money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int won[] = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		for (int i = 0; i < won.length; i++) {
			System.out.println(won[i] + "�� ���� " + (money / won[i]) + "�� �Դϴ�.");
			money %= won[i];
		}
	}

}
