package J20180226;

import java.util.StringTokenizer;

/**
 * 
 * 
 * @Package : J20180226
 * @FileName : stEx.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 26. 
 *
 */
public class stEx {

	public static void main(String[] args) {
		
		StringTokenizer st= new StringTokenizer("my name is khan");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken(" "));
		}

	}

}
