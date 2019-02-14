package J20180205;

import java.util.Scanner;

class CirletPrimeNum{
	int num;
	CirletPrimeNum(){}
	CirletPrimeNum(int num){
		this.num=num;
	}
	boolean isPrime(){
		int cnt=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0)cnt++;
		}
		if(cnt==2)return true;
		else return false;
	}
	void change() {
		int n=num;
		int cnt=0;
		int primeNumcnt=0;
		while(n>0) {
			n=n/10;
			cnt++;
		}
		n=num;
		for(int i=0;i<cnt;i++) {
			n=n/(int)Math.pow(10, cnt-1)+n%(int)Math.pow(10, cnt-1)*10;
			num=n;
			if(isPrime()) {
				//System.out.println(num+" is prime number");
				primeNumcnt++;
			}else {
				//System.out.println(num+" is not prime number");
			}
		}
		if(primeNumcnt==cnt) {
			System.out.print(num+" ");
			CirletPrimeNumEx.cntPrint++;
			if(CirletPrimeNumEx.cntPrint%10==0)System.out.println();
		}//else System.out.println(num+" is Not CirletPrimeNumber");
	}
}
public class CirletPrimeNumEx {
	public static int cntPrint=0;
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		CirletPrimeNum a= new CirletPrimeNum();
		//a.change();
		for(int i=m;i<=n;i++) {
			a= new CirletPrimeNum(i);
			a.change();
		}
		
	}

}
