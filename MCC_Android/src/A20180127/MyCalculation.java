package A20180127;

import java.util.Scanner;

class Calculation{
	protected int x,y,z;
	public Calculation() {x=3;y=6;}
	public Calculation(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public void add() {z=x+y; System.out.println("The sum of given number is "+z);}
}
class myCal extends Calculation{
	public myCal(int x, int y) {
		super(x,y);
	}

	public myCal() {
		super();
	}

	public void sub() {
		z=x-y;
		System.out.println("The difference between the given number is "+z);
	}
}
public class MyCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myCal a= new myCal();
		a.add();a.sub();
		Scanner sc= new Scanner(System.in);
		myCal b= new myCal(sc.nextInt(),sc.nextInt());
		b.add();b.sub();
	}

}
