package J20180201;

import java.util.Scanner;

class uniqueNum{
	int num;
	int cnt[]=new int[10];
	uniqueNum(){}
	uniqueNum(int num){
		this.num=num;
	}
	boolean isUniqueNum() {
		int n=num;
		while(n>0) {
			cnt[n%10]++;
			if(cnt[n%10]>1) return false;
			n=n/10;
		}
		return true;
	}
}

public class uniqueNumEx {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int cnt=0;
		uniqueNum a=new uniqueNum();
		for(int i=m;i<=n;i++) {
			a=new uniqueNum(i);
			if(a.isUniqueNum()) {
				System.out.print(i+" ");
				cnt++;
				if(cnt%10==0) System.out.println("");
			}
			
		}

	}

}
