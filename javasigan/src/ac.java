import java.util.Scanner;

public class ac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;int a=1;double d=1.0;
		char grade='A';
		switch(grade) {
		case 'A' : sum+=100;
		case 'B' : sum+=50;
		case 'C' : sum+=30;
		case 'D' : sum+=10;
		}
		System.out.println(sum);
		a %= 3 / a + 3;
		
		d += 1.5 * 3 + a++;
		System.out.println(d);
	}

}
