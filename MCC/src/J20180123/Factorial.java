package J20180123;

public class Factorial {
	public static void main(String args[]){
		int num=5;
		int fac=1;
		while(num>0) {
			fac=fac*num;
			num--;
		}
		System.out.println(fac);
		
	}
}
