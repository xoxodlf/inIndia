package J20180207;

import java.util.Scanner;

class numToAscii{
	String a;
	char[] b;
	char[] c;
	int i=0;
	numToAscii(String a){
		this.a=a;
		b=a.toCharArray();
		c=new char[b.length];
	}
	void reverse(){
		
		for(int i=0;i<b.length;i++) {
			c[i]=b[b.length-i-1];
		}
	}
	void makeCode() {
		int n=0;
		String as="";
		while(i<c.length) {
			as=""+c[i]+c[i+1];
			if((65<=Integer.parseInt(as)&&Integer.parseInt(as)<=90)||(97<=Integer.parseInt(as)&&Integer.parseInt(as)<=122)||Integer.parseInt(as)==32) {
				System.out.print((char)Integer.parseInt(as));
				i=i+2;
			}else {
				as=""+c[i]+c[i+1]+c[i+2];
				System.out.print((char)Integer.parseInt(as));
				i=i+3;
			}
		}
	}
}

public class numToAsciiEx {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a;
		a=sc.next();
		numToAscii c=new numToAscii(a);
		c.reverse();
		c.makeCode();
	}

}