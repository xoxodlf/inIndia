/**
 * @Summary   : 
 * @Package : codility
 * @FileName : sum.java
 * @Author : Yang TaeIl
 * @date : 2018. 11. 14.  
 * 
 */
package codility;

import java.util.HashMap;

/**
 * 
 * @Package : codility
 * @FileName : sum.java
 * @Author : Yang TaeIl
 * @date : 2018. 11. 14. 
 * 
 */
public class sum {
	public static int sumTwo(int a, int b) {
		if(a==0)
			return b;
		
		int and = a&b;
		int xor = a^b;
		
		return sumTwo(and<<1,xor);
	}
	
	public static int multiTwo(int a, int b) {
		int result = 0;
		while(a>0) {
			if((a&1)==1) {
				result+=b;
			}
			a=a>>1;
			b=b<<1;
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(sumTwo(100,4));
		System.out.println(multiTwo(3,4));
		HashMap<Integer, Integer> map = new HashMap<>();
		String s = "";
	}
}
