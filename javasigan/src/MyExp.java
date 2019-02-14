import java.util.Scanner;
public class MyExp {
	int exp;
	int base;
	public MyExp(int base,int exp){
		this.exp=exp;
		this.base=base;
	}
	
	public int getValue() {
		int result=1;
		for(int i=0;i<exp;i++) {
			result=result*base;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("밑은 : ");
		int base = sc.nextInt();
		System.out.print("지수는 : ");
		int exp = sc.nextInt();
		MyExp a = new MyExp(base,exp);
		
		
		System.out.print(base+"의 "+exp+"승은 "+a.getValue()+"입니다.");
		
	}

}
