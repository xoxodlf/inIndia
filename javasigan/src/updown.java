import java.util.Scanner;

public class updown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = (int)(Math.random()*50+1);
		int a=-1;
		int cnt=0;
		while(x!=a) {
		System.out.print("숫자를 입력하세용:");
		a=sc.nextInt();
		cnt++;
		if(a>x) {
			System.out.println("DOWN");
		}else if(a<x) {
			System.out.println("UP");
		}else {
			System.out.println(cnt+"번 만에 정ㅋ답ㅋ");
		}
		
		
		}
	}

}
