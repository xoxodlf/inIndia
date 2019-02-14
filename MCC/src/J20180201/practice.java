package J20180201;

import java.util.Scanner;

class numPrac{
	int num;
	int cnt=0;
	numPrac(int num){
		this.num=num;
	}
	numPrac(){}
	boolean isPrime() {
		for(int i=1;i<=num;i++) {
			if(num%i==0)cnt++;
			if(cnt>2)return false;
		}
		return true;
	}
	
	boolean isReverseEqual() {
		String reverse="";
		int n=num;
		while(n>0) {
			reverse=reverse+n%10;
			n=n/10;
		}
		if(Integer.parseInt(reverse)==num) return true;
		else return false;
	}
}

public class practice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int cnt=0;
		numPrac a=new numPrac();
		for(int i=m;i<=n;i++) {
			a=new numPrac(i);
			if(a.isPrime()&&a.isReverseEqual()) {
				System.out.print(i+" ");
				cnt++;
				if(cnt%10==0)System.out.println("");
			}
		}

	}

}
