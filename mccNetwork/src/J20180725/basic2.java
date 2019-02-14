/**
 * @Summary   : 
 * @Package : J20180725
 * @FileName : basic2.java
 * @Author : Yang TaeIl
 * @date : 2018. 7. 25.  
 * 
 */
package J20180725;

import java.net.InetAddress;

/**
 * 
 * @Package : J20180725
 * @FileName : basic2.java
 * @Author : Yang TaeIl
 * @date : 2018. 7. 25.
 * 
 */
public class basic2 {
	public static void main(String[] args) throws Exception {
//		InetAddress ad1  = InetAddress.getByName("www.naver.com");
//		System.out.println(ad1);
//		InetAddress ad2  = InetAddress.getByName("104.120.75.158");
//		System.out.println(ad2.getHostName());
//		InetAddress ad3  = InetAddress.getByName("www.java.com");
//		System.out.println(ad3.getHostAddress());
//		InetAddress ad4  = InetAddress.getLocalHost();
//		System.out.println(ad4);
//		InetAddress ad5  = InetAddress.getByName("localhost");
//		System.out.println(ad5);
//		InetAddress[] a6 = InetAddress.getAllByName("www.mcc.edu.in");
//		System.out.println(a6);
//		InetAddress[] a7 = InetAddress.getAllByName("www.mcc.edu.in");
//		for(int i=0;i<a7.length;i++) {
//			System.out.println(a7[i]);
//		}
		InetAddress a8  = InetAddress.getByName("169.254.0.1");//224~239
		System.out.println(a8.getHostName());
		if(a8.isAnyLocalAddress()) {
			System.out.println(a8+" is local");
		}else {
			System.out.println(a8+" is not local");
		}
		
		if(a8.isMulticastAddress()) {
			System.out.println(a8+" is multicast");
		}else {
			System.out.println(a8+" is not multicast");
		}
		
		if(a8.isMCGlobal()) {
			System.out.println(a8+" is MCGlobal");
		}else {
			System.out.println(a8+" is not MCGlobal");
		}
		
		
		
	}
}
