package J20180124;

import java.util.Scanner;

public class MenuDriven {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Area of circle");
		System.out.println("2. Area of square");
		System.out.println("3. Area of sphere");
		System.out.println("Choose the number.");
		int select = sc.nextInt();
		
		switch(select) {
		case 1 : System.out.print("radius :");
		int r=sc.nextInt();
		System.out.println("Area of circle is "+r*r*Math.PI);
		break;
		case 2 : System.out.print("width :");
		int w=sc.nextInt();
		System.out.println("Area of square is "+w*w);
		break;
		case 3 : System.out.print("sphere :");
		int r1=sc.nextInt();
		System.out.println("Area of sphere is "+r1*r1*4.0*Math.PI);
		break;
		default: System.out.println("wrong number");
		
		}
	}
}
