/**
 * @Summary   : 
 * @Package : baekjoon
 * @FileName : tette.java
 * @Author : Yang TaeIl
 * @date : 2018. 10. 10.  
 * 
 */
package baekjoon;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @Package : baekjoon
 * @FileName : tette.java
 * @Author : Yang TaeIl
 * @date : 2018. 10. 10. 
 * 
 */
public class tette {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("1", "2");
		map.put("1", "3");
		System.out.println(map.get("1"));
		System.out.println(map.get("1"));
	}
}
