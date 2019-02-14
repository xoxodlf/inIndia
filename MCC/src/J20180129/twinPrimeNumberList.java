package J20180129;

import java.util.Scanner;

class primeNum{
	int value;
	primeNum(int value){this.value=value;}
	boolean isPrime(){
		int cnt=0;
		for(int i=1;i<=value;i++) {
			if(value%i==0)cnt++;
		}
		if(cnt==2)return true;
		else return false;
	}
}

public class twinPrimeNumberList {
	public static void main(String args[]) {
		int cntLine=0;
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt()+1;
		for(int i=1;i<n;i++) {
			primeNum a=new primeNum(i);
			if(a.isPrime()) {
				primeNum b=new primeNum(i+2);
				if(b.isPrime()) {
					System.out.print("("+i+","+(i+2)+")"+" ");
					cntLine++;
					if(cntLine%5==0)System.out.println("");
				}
			}
		}
	}
}
