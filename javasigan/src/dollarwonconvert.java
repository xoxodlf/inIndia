import java.util.Scanner;

public class dollarwonconvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double won,dallor;
		int exchange=1128;
		Scanner sc= new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ���:");
		won=sc.nextDouble();
		System.out.println(won+"���� "+(won/1128)+"�޷��Դϴ�.");
		
		System.out.print("�޷��� �Է��ϼ���:");
		dallor=sc.nextDouble();
		System.out.println(dallor+"�޷��� "+(dallor*1128)+"���Դϴ�.");
	}

}
