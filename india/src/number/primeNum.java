package number;

public class primeNum {
	public static void main(String args[]) {
		int cnt =0;
		for(int i=1;i<101;i++) {
			for(int j=1;j<=i;j++) {
				if(i%j==0)cnt++;
			}
			if(cnt==2)System.out.println(i+"는 소수입니다.");
			cnt=0;
		}
	}
}
