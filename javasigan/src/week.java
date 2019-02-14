import java.util.Scanner;

public class week {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int week=sc.nextInt();
		
		switch(week) {
		case 0:
			System.out.println("SUNDAY");
			break;
		case 1:
			System.out.println("MONDAY");
			break;
		case 2:
			System.out.println("TUESDAY");
			break;
		case 3:
			System.out.println("WEDNESDAY");
			break;
		case 4:
			System.out.println("THURSDAY");
			break;
		case 5:
			System.out.println("FRIDAY");
			break;
		case 6:
			System.out.println("SATURDAY");
			break;
		default:
			System.out.println("다시입력하삼.");
		}
	}

}
