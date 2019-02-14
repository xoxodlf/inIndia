import java.util.Scanner;
public class cal {
	int a;
	int b;
	
	public cal() {}
	public void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	public int calculate(String c) {
		while(true) {
		switch(c) {
			case "+":
				return a+b;
			case "-":
				return a-b;
			case "*":
				return a*b;
			case "/":
				return a/b;
		}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		String c = sc.next();
		cal t= new cal();
		t.setValue(a, b);
		System.out.println(t.calculate(c));
	}

}
