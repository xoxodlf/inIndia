/**
 * @Summary   : 
 * @Package : ex
 * @FileName : udpReceiver.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 30.  
 * 
 */
package ex;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 
 * @Package : ex
 * @FileName : udpReceiver.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 30. 
 * 
 */
public class udpReceiver {
	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(6666);
		int fileSize=1000000000;
		byte[] buffer = new byte[fileSize];
		DatagramPacket dp = new DatagramPacket(buffer, fileSize);
		
		ds.receive(dp);
		
		byte[] ba = dp.getData();
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\xoxod\\eclipse-workspace\\mccNetwork\\src\\ex\\rece.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		bos.write(ba);
		bos.flush();
		bos.close();
		ds.close();
	}
}
