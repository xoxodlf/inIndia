/**
 * @Summary   : 
 * @Package : ex
 * @FileName : udpSender.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 30.  
 * 
 */
package ex;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 
 * @Package : ex
 * @FileName : udpSender.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 30. 
 * 
 */
public class udpSender {
	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket();
		InetAddress ia = InetAddress.getByName("192.168.0.2");
		File file =new File("C:\\Users\\xoxod\\eclipse-workspace\\mccNetwork\\src\\ex\\Muntari Milan.jpg");
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bos = new BufferedInputStream(fis);
		byte[] ba = new byte[(int) file.length()];
		bos.read(ba, 0, ba.length);
		DatagramPacket dp = new DatagramPacket(ba, ba.length,ia, 6666);
		ds.send(dp);
		bos.close();
		fis.close();
		ds.close();
	}
}
