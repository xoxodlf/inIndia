/**
 * @Summary   : 
 * @Package : J20180220
 * @FileName : sentencesEx.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 20.  
 * 
 */
package J20180220;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 
 * @Package : J20180220
 * @FileName : sentencesEx.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 20. 
 * 
 */
public class sentencesEx {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> al=new ArrayList<String>(); 
		int n= sc.nextInt();
		int cntDot=0;
		int cnt=0;
		while(cntDot<n) {
			String s= sc.next();
			cnt++;
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='.'||s.charAt(i)=='?') {
					cntDot++;
					String tmp="";
					for(int j=0;j<i;j++) {
						tmp=tmp+s.charAt(j);
					}
					s=tmp;
					break;
				}
			}
			al.add(s);
		}
		System.out.println("Total number of words "+cnt);
		String assignS[]=new String[cnt];
		int assignI[]=new int[cnt];
		int k=0;
		while(cnt!=0) {
			
			String tmp=al.get(0);
			al.remove(0);
			cnt--;
			int cntWord=1;
			for(int i=0;i<cnt;i++) {
				if(cnt==0)break;
				if(al.get(i).equals(tmp)) {
					cntWord++;
					al.remove(i);
					i--;
					cnt--;
					if(cnt==1)break;
				}
			}
			assignS[k]=tmp;
			assignI[k]=cntWord;
			k++;
			//System.out.println(tmp+"    "+cntWord);
		}
		for(int i=0;i<k;i++) {
			for(int j=i+1;j<k;j++) {
				if(assignI[i]>assignI[j]) {
					int temp=assignI[i];
					assignI[i]=assignI[j];
					assignI[j]=temp;
					String tmp=assignS[i];
					assignS[i]=assignS[j];
					assignS[j]=tmp;
				}
			}
		}
		for(int i=0;i<k;i++) {
			System.out.println(assignS[i]+"  "+assignI[i]);
		}
	}
}
