package J20180305;

import java.util.Scanner;
class sentence{
	int vowels;
	int noOfWords;
	sentence(int vowels,int noOfwords){
		this.vowels=vowels;
		this.noOfWords=noOfwords;
	}
}

public class stringAnalysis {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int m=sc.nextInt();
		sentence[] sen=new sentence[m];
		int cntMark=0;
		int cntVowels=0;
		int cntWords=0;
		while(m>cntMark) {
			String tmp=sc.next();
			cntWords++;
			tmp=tmp.toUpperCase();
			for(int i=0;i<tmp.length();i++) {
				if(tmp.charAt(i)=='A'||tmp.charAt(i)=='E'||tmp.charAt(i)=='I'||tmp.charAt(i)=='O'||tmp.charAt(i)=='U') {
					cntVowels++;
				}else if(tmp.charAt(i)=='!'||tmp.charAt(i)=='?'||tmp.charAt(i)=='.') {
					sen[cntMark++]=new sentence(cntVowels,cntWords);
					cntVowels=0;
					cntWords=0;
				}
			}
		}
		System.out.println("Sentense\t\tNo. of Vowels\t\tNo. of Words");
		for(int i=0;i<m;i++) {
			System.out.println(i+1+"\t\t\t"+sen[i].vowels+"\t\t\t"+sen[i].noOfWords);
		}
		System.out.println();
		for(int i=0;i<m;i++) {
			System.out.print(i+1+"\t\t\t");
			for(int j=0;j<sen[i].vowels*3;j++) {
				System.out.print("V");
			}System.out.println();
			System.out.print("\t\t\t");
			for(int j=0;j<sen[i].noOfWords*3;j++) {
				System.out.print("W");
			}System.out.println();
		}
		
	}

}
