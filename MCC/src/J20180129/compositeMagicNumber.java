package J20180129;

import java.util.Scanner;

class numCMN{
	int num;
	int cnt=0;
	numCMN(int num){
		this.num=num;
	}
	numCMN(){}
	boolean isComposite() {
		for(int i=1;i<=num;i++) {
			if(num%i==0)cnt++;
			if(cnt>2)return true;
		}
		return false;
	}
	
	boolean isMagicNum() {
		int n=num;
		int k=num;
		int sum=0;
		while(k>=10) {
			while(n>0) {
				sum=sum+n%10;
				n=n/10;
			}
			k=sum;
			n=sum;
			sum=0;
		}
		if(k==1)return true;
		else return false;
			
	}
}

public class compositeMagicNumber {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int cnt=0;
		numCMN a= new numCMN();
		System.out.println("THE COMPOSITE MAGIC INTEGERS ARE:");
		for(int i=m;i<=n;i++) {
			a= new numCMN(i);
			if(a.isComposite()) {
				if(a.isMagicNum()) {
					System.out.print(i+" ");
					cnt++;
					if(cnt%10==0)System.out.println("");
				}
			}
		}
		System.out.println("\nFREQUENCY OF COMPOSITE MAGIC INTEGERS IS:" +cnt);
	}
}
