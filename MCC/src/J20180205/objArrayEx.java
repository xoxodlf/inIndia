package J20180205;

class Acc{
	int a; int b;
	public void setData(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public void showData() {
		System.out.println("Value of a is "+a);
		System.out.println("Value of b is "+b);
	}
}

public class objArrayEx {
	
	public static void main(String[] args) {
		Acc obj[]=new Acc[2];
		obj[0]=new Acc();
		obj[1]=new Acc();
		obj[0].setData(1,3);
		obj[1].setData(4,6);
		
		System.out.println("For array element 0");
		obj[0].showData();
		System.out.println("For array element 1");
		obj[1].showData();
	}

}
