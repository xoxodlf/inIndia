/**
 * @Summary   : 
 * @Package : exam
 * @FileName : ex3.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 7.  
 * 
 */
package exam;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @Package : exam
 * @FileName : ex3.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 7. 
 * 
 */
public class ex3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int cntPalin=0;
		boolean re=true;
		boolean isSave=true;
		ArrayList<String> al = new ArrayList<String>();
		while(re){
			String tmp=sc.next();
			tmp=tmp.toUpperCase();//accept in upper case
			int length=tmp.length();
			char[] a=tmp.toCharArray();
			for(int i=0;i<length;i++){
				if(a[i]=='.'||a[i]==','||a[i]=='?'){
					tmp="";
					for(int j=0;j<i;j++){
					tmp=tmp+a[j];
					}
					tmp=tmp.toUpperCase();
					a=tmp.toCharArray();
					re=false;
					break;
				}
			}
			for(int i=0;i<tmp.length()/2;i++){
				if(a[i]!=a[tmp.length()-i-1]){
					isSave=false;
				}
				
			}
			if(isSave){
				al.add(tmp);
				cntPalin++;
			}
			isSave=true;
		}
		if(cntPalin==0){
			System.out.println("NO PALINDROMIC WORDS");
			return;
		}
		for(int i=0;i<cntPalin;i++){
			System.out.print(al.get(i)+" ");
		}
		System.out.println("\nNUMBER OF PALINDROMIC WORDS : "+cntPalin);
	}
}
