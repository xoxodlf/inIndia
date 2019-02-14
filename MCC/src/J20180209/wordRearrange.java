package J20180209;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

class words{
	StringTokenizer st;
	String origin;
	String cutted[];
	boolean isSelect[];
	int cnt=0;
	words(String s){
		origin=s;
		StringTokenizer st =new StringTokenizer(origin);
		cnt=st.countTokens();
		System.out.println("LENGTH : "+cnt);
	}
	void cut() {
		StringTokenizer st =new StringTokenizer(origin);
		cutted=new String[cnt];
		isSelect=new boolean[cnt];
		for(int i=0;i<cnt;i++) {
			cutted[i]=st.nextToken();
		}
	}
	void sort() {
		Arrays.sort(cutted);
	}
	void print() {
		for(int i=0;i<cutted.length;i++) {
			System.out.print(cutted[i]+" ");
		}
		
	}
	
	
}

public class wordRearrange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String origin = "";
		String a="";
		while(true) {
			a=sc.next();
			if(a.equals(".")||a.equals("!")||a.equals("?")) {
				break;
			}else {
				origin=origin+a+" ";
			}
		}
		words c=new words(origin);
		c.cut();
		c.sort();
		c.print();
	}

}
