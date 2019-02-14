package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayList<String> vowel=new ArrayList<String>();
		ArrayList<String> others=new ArrayList<String>();
		int cnt=0;
		boolean re=true;
		while(re) {
			String tmp=sc.next();
			tmp=tmp.toUpperCase();
			for(int i=0;i<tmp.length();i++) {
				if(tmp.charAt(i)=='.'||tmp.charAt(i)=='?'||tmp.charAt(i)=='!') {
					tmp=tmp.substring(0, i);
					re=false;
					break;
				}
			}
			if((tmp.charAt(0)=='A'||tmp.charAt(0)=='E'||tmp.charAt(0)=='I'||tmp.charAt(0)=='O'||tmp.charAt(0)=='U')
					&&(tmp.charAt(tmp.length()-1)=='A'||tmp.charAt(tmp.length()-1)=='E'||tmp.charAt(tmp.length()-1)=='I'||tmp.charAt(tmp.length()-1)=='O'||tmp.charAt(tmp.length()-1)=='U')) {
				cnt++;
				vowel.add(tmp);
			}else {
				others.add(tmp);
			}
		}
		System.out.println("NUMBER OF WORDS BEGINNING AND ENDING WITH A VOWEL = "+cnt);
		for(String tmp:vowel) {
			System.out.print(tmp+" ");
		}
		for(String tmp:others) {
			System.out.print(tmp+" ");
		}

	}

}
