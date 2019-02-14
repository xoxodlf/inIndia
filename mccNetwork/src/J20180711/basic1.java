/**
 * @Summary   : 
 * @Package : J20180711
 * @FileName : basic1.java
 * @Author : Yang TaeIl
 * @date : 2018. 7. 11.  
 * 
 */
package J20180711;

import java.net.*;


/**
 * 
 * @Package : J20180711
 * @FileName : basic1.java
 * @Author : Yang TaeIl
 * @date : 2018. 7. 11. 
 * 
 */
public class basic1 {
	public static void main(String args[]) throws MalformedURLException,UnknownHostException {
		InetAddress a= InetAddress.getByName("224.1.0.1");
		System.out.println(a);
//		InetAddress b= InetAddress.getByName("google.com");
//		System.out.println(b);
//		InetAddress c= InetAddress.getByName("facebook.com");
//		System.out.println(c);
//		InetAddress d= InetAddress.getByName("naver.com");
//		System.out.println(d);
//		InetAddress e= InetAddress.getByName("daum.net");
//		System.out.println(e);
//		InetAddress f= InetAddress.getByName("amazon.in");
//		System.out.println(f);
//		
//		InetAddress[] ia=InetAddress.getAllByName("mcc.edu.in");
//		System.out.println(ia[0]);
//		
//		InetAddress a3 = InetAddress.getLoopbackAddress();
//		System.out.println(a3);
		
		String fullIp=a.toString();
		
		String ip = fullIp.split("/")[1];
		
		int first=Integer.parseInt(ip.substring(0, 3));
		System.out.println(first);
		int binary[]= new int[8];
		int cnt=0;
		while(first>0) {
			binary[7-cnt++]=first%2;
			first = first/2;
		}
		for(int i=0;i<8;i++) {
			System.out.print(binary[i]);
		}
		System.out.println();
		if(binary[0]==0) System.out.println("A Class");
		else if(binary[0]==1&&binary[1]==0) System.out.println("B Class");
		else if(binary[0]==1&&binary[1]==1&&binary[2]==0) System.out.println("C Class");
		else if(binary[0]==1&&binary[1]==1&&binary[2]==1&&binary[3]==0) System.out.println("D Class");
		else if(binary[0]==1&&binary[1]==1&&binary[2]==1&&binary[3]==1) System.out.println("E Class");
		
		
		
	}
}
