/**
 * @Summary   : 
 * @Package : J20180820
 * @FileName : udpSender1.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 20.  
 * 
 */
package J20180820;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;

/**
 * 
 * @Package : J20180820
 * @FileName : udpSender1.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 20. 
 * 
 */
public class udpSender1 {

	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket();
		String str = "Welcome Java";
		InetAddress ip = InetAddress.getByName("127.0.0.1");
//		File transFile = new File("C:\\Users\\xoxod\\eclipse-workspace\\mccNetwork\\src\\J20180820\\Muntari Milan.jpg");
//		byte[] bytearray = new byte[(int)transFile.length()];
//		FileInputStream fin = new FileInputStream(transFile);
//		BufferedInputStream bin = new BufferedInputStream(fin);
//		bin.read(bytearray, 0, bytearray.length);
//		DatagramPacket dp = new DatagramPacket(bytearray, bytearray.length,ip,8111);
//		ds.send(dp);
		
		Date date = new Date();
		DatagramPacket dp1 = new DatagramPacket(date.toString().getBytes(),date.toString().getBytes().length,ip,8112);
		ds.send(dp1);
		
		System.out.println("send success");
		ds.close();
	}

}
