package J20180209;

import java.util.Scanner;


class oneNum{
	int num;
	oneNum(int num){
		this.num=num;
	}
	public oneNum() {
		// TODO Auto-generated constructor stub
	}
	void print(){
		switch (num) {
		case 0: System.out.println("ZERO");
		break;
		case 1: System.out.println("ONE");
		break;
		case 2: System.out.println("TWO");
		break;
		case 3: System.out.println("THREE");
		break;
		case 4: System.out.println("FOUR");
		break;
		case 5: System.out.println("FIVE");
		break;
		case 6: System.out.println("SIX");
		break;
		case 7: System.out.println("SEVEN");
		break;
		case 8: System.out.println("EIGHT");
		break;
		case 9: System.out.println("NINE");
		break;
		}
	}
}

class tenNum extends oneNum{

	tenNum(int num) {
		super(num);
	}
	void print(){
		if(num%100>=10&&num%100<=19) {
		switch (num%100) {
			case 10: System.out.println("TEN");
			break;
			case 11: System.out.println("ELEVEN");
			break;
			case 12: System.out.println("TWOELVE");
			break;
			case 13: System.out.println("THRTEEN");
			break;
			case 14: System.out.println("FOURTEEN");
			break;
			case 15: System.out.println("FIFTEEN");
			break;
			case 16: System.out.println("SIXTEEN");
			break;
			case 17: System.out.println("SEVENTEEN");
			break;
			case 18: System.out.println("EIGHTTEEN");
			break;
			case 19: System.out.println("NINETEEN");
			break;
			}
		}else {
			switch((num%100)/10) {
			case 2: System.out.print("TWENTY ");
			break;
			case 3: System.out.print("THRTY ");
			break;
			case 4: System.out.print("FOURTY ");
			break;
			case 5: System.out.print("FIFTY ");
			break;
			case 6: System.out.print("SIXTY ");
			break;
			case 7: System.out.print("SEVENTY ");
			break;
			case 8: System.out.print("EIGHTTY ");
			break;
			case 9: System.out.print("NINETY ");
			break; 
			}
			switch(num%10) {
			case 1: System.out.println("ONE");
			break;
			case 2: System.out.println("TWO");
			break;
			case 3: System.out.println("THREE");
			break;
			case 4: System.out.println("FOUR");
			break;
			case 5: System.out.println("FIVE");
			break;
			case 6: System.out.println("SIX");
			break;
			case 7: System.out.println("SEVEN");
			break;
			case 8: System.out.println("EIGHT");
			break;
			case 9: System.out.println("NINE");
			break;
			}
		}
	}
}

class hundNum extends tenNum{

	hundNum(int num) {
		super(num);
	}
	void print(){
		switch(num/100) {
		case 1: System.out.print("ONE ");
		break;
		case 2: System.out.print("TWO ");
		break;
		case 3: System.out.print("THREE ");
		break;
		case 4: System.out.print("FOUR ");
		break;
		case 5: System.out.print("FIVE ");
		break;
		case 6: System.out.print("SIX ");
		break;
		case 7: System.out.print("SEVEN ");
		break;
		case 8: System.out.print("EIGHT ");
		break;
		case 9: System.out.print("NINE ");
		break;
		}
		System.out.print("HUNDRED AND ");
		super.print();
	}
	
}

public class numToEngEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		oneNum a=new oneNum();
		if(num>999) {
			System.out.println("out of range");
			return;
		}
		else if(num>99) {
			a= new hundNum(num);
		}else if(num>9) {
			a= new tenNum(num);
		}else if(num>=0) {
			a = new oneNum(num);
		}else {
			System.out.println("out of range");
			return;
		}
			
		a.print();
	}

}
