package J20180202;

import java.util.Scanner;

class anagram{
	String origin;
	char[] data;
	int cnt=0;
	anagram(){}
	anagram(String s){
		origin=s;
		data=origin.toCharArray();
	}
	void printCnt() {
		System.out.println(cnt);
	}
	void swap(int i,int j){
	    char temp;
	    if(i==j) return;
	    temp = data[i];
	    data[i]=data[j];
	    data[j]=temp;
	    return;
	}
	void Permutation(int TotalN,int n){
	    int i;

	    if( n==1 ) {
	        for(i=0;i<TotalN;i++){
	            System.out.print(data[i]);
	        }
	        cnt++;
	        System.out.println();
	        return;
	    }

	    for(i=0;i<n;i++){
	        swap(i,n-1);
	        Permutation(TotalN,n-1);
	        swap(i,n-1);
	    }
	}
	
}

public class anagramEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s =sc.next();
		anagram a = new anagram(s);
		a.Permutation(s.length(), s.length());
		a.printCnt();
	}

}
