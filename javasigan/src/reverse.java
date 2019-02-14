import java.util.Scanner;

public class reverse {
	public static int numReverse(int originNum){
		int reverseNum=0;
		while(originNum>10) {
			reverseNum=reverseNum*10+originNum%10;
			originNum=originNum/10;
		}reverseNum=reverseNum*10+originNum%10;
		return reverseNum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int originNum =sc.nextInt();
		
		System.out.println(numReverse(originNum));
	}
	

}