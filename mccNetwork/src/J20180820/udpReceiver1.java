/**
 * @Summary   : 
 * @Package : J20180820
 * @FileName : udpReceiver1.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 20.  
 * 
 */
package J20180820;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Arrays;

/**
 * 
 * @Package : J20180820
 * @FileName : udpReceiver1.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 20. 
 * 
 */
public class udpReceiver1 {

	public static void main(String[] args) throws Exception {
		int filesize=100000000; int byteRead;int currentTot=0;
		DatagramSocket ds = new DatagramSocket(8112);
		byte[] buf = new byte[filesize];
		DatagramPacket dp = new DatagramPacket(buf, filesize);
//		ds.receive(dp);
//		System.out.println(dp.getLength());
//		byte[] filebyte=dp.getData();
//		filebyte=Arrays.copyOfRange(filebyte, 0,dp.getLength());
//		FileOutputStream fos = new FileOutputStream("C:\\Users\\xoxod\\eclipse-workspace\\mccNetwork\\src\\J20180820\\receiveUDP.jpg");
//		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
//		bos.write(filebyte);
//		bos.flush();
		ds.receive(dp);
		System.out.println(new String(dp.getData(),"UTF-8"));
		
		System.out.println("receive success");
//		bos.close();
//		fos.close();
		ds.close();
	}

}
