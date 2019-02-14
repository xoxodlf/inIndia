import java.util.Scanner;

public class dollarwonconvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double won,dallor;
		int exchange=1128;
		Scanner sc= new Scanner(System.in);
		
		System.out.print("원을 입력하세요:");
		won=sc.nextDouble();
		System.out.println(won+"원은 "+(won/1128)+"달러입니다.");
		
		System.out.print("달러를 입력하세요:");
		dallor=sc.nextDouble();
		System.out.println(dallor+"달러는 "+(dallor*1128)+"원입니다.");
	}

}
