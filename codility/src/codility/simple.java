/**
 * @Summary   : 
 * @Package : codility
 * @FileName : simple.java
 * @Author : Yang TaeIl
 * @date : 2018. 11. 7.  
 * 
 */
package codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * 
 * @Package : codility
 * @FileName : simple.java
 * @Author : Yang TaeIl
 * @date : 2018. 11. 7.
 * 
 */
class simple {
	char[] cArr;
	int avg;
	public int solution(String S) {
		cArr = S.toCharArray();
		int cnt=0;
		for(int i=0;i<cArr.length;i++) {
			int tmp = getRight(i);
			if((tmp<=(cArr.length-i-1-tmp))) {
				cnt++;
				if(tmp==(cArr.length-i-1-tmp)&&cArr[i]<cArr[i-1]) {
					cnt--;
				}
			}
		}
		return cnt;
	}
	public int getRight(int index) {
		int cnt=0;
		for(int i=index+1;i<cArr.length;i++) {
			if(cArr[i-1]<=cArr[i]) cnt++;
		}
		return cnt;
	}
	
	
	public static void main(String[] args) {
		
		/*String T[] = {"test1a", "test2", "test1b", "test1c", "test3"};
		String R[] = {"Wrong answer", "OK', ':Runtime error", "OK", "Time limit exceeded"};*/
		simple s = new simple();
		System.out.println(s.solution("annnna"
				+ ""));
	}
}
