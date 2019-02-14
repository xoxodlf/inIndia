/**
 * @Summary   : 
 * @Package : baekjoon
 * @FileName : baekjoon1356.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 26.  
 * 
 */
package baekjoon;

import java.util.Scanner;

/**
 * 
 * @Package : baekjoon
 * @FileName : baekjoon1356.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 26. 
 * 
 */
public class baekjoon1356 {
	public static boolean isYou(String origin,int index) {
		if(index==origin.length())return false;
		int frontMulti=1;
		int backMulti=1;
		for(int i=0;i<index;i++) {
			frontMulti=frontMulti*Integer.parseInt(origin.charAt(i)+"");
		}
		for(int i=index;i<origin.length();i++) {
			backMulti=backMulti*Integer.parseInt(origin.charAt(i)+"");
		}
		//System.out.println(index+" "+frontMulti+" "+backMulti);
		if(frontMulti==backMulti)return true;
		else return false||isYou(origin,index+1);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String origin = sc.next();
		
		if(isYou(origin,1)) {
			System.out.println("YES");
		}else System.out.println("NO");

	}

}
