package shape;

import java.util.Scanner;

public class max_min_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, temp, min = 1, max = 0;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();

		// x�� �� ū ��
		if (x < y) {
			temp = y;
			y = x;
			x = temp;
		}

		// �ִ�����
		for (int i = 1; i <= y; i++) {
			if (x % i == 0 && y % i == 0)
				max = i;
		}
		System.out.println("�ִ������� : " + max);

		// �ּҰ����
		int i = 2;
		while (i <= y) {
			if (x % i == 0 && y % i == 0) {
				min = min * i;
				x = x / i;
				y = y / i;
			} else {
				i++;
			}
		}
		System.out.println("�ּҰ������ : " + (min * x * y));
	}

}
