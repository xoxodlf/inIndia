package J20180202;

import java.util.Scanner;

class SmithNum{
	int num;
	SmithNum(){}
	SmithNum(int num){
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
	boolean isSmithNum() {
		int n=num;
		int sum=0;
		while(n>0) {
			sum=sum+n%10;
			n=n/10;
		}
		n=num;
		int sumOfDigitsFactors=0;
		
			for(int i=2;i<=n;i++) {
				if(n%i==0) {
					if(i>=10) {
						int j=i;
						int sumI=0;
						while(j>0) {
							sumI=sumI+j%10;
							j=j/10;
						}
						sumOfDigitsFactors=sumOfDigitsFactors+sumI;
					}else {
						sumOfDigitsFactors=sumOfDigitsFactors+i;
					}
					n=n/i;
					i=1;
					//System.out.println(n+" "+i);
				}
				
			}
			
			
		
		//System.out.println(sumOfDigitsFactors);
		if(sum==sumOfDigitsFactors)return true;
		else return false;
		
	}
}

public class SmithNumEx {
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int cnt=0;
		SmithNum a=new SmithNum();
		for(int i=m;i<=n;i++) {
			a=new SmithNum(i);
			if(!a.isPrime()&&a.isSmithNum()) {
				System.out.print(i+" ");
				cnt++;
				if(cnt%10==0)System.out.println("");
			}
		}

	}

}
