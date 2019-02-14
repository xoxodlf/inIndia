/**
 * @Summary   : 
 * @Package : J20180820
 * @FileName : receiveCli.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 20.  
 * 
 */
package J20180820;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * 
 * @Package : J20180820
 * @FileName : receiveCli.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 20. 
 * 
 */
public class receiveCli1 {

	
	public static void main(String[] args) throws Exception {
		
		int filesize=10000000; int byteRead;int currentTot=0;
		InetAddress addr = InetAddress.getLocalHost();
//		Socket s = new Socket(addr, 1252);
		Socket s = new Socket("192.168.2.20", 1002);
		byte bytearray[] = new byte[filesize];
		InputStream is = s.getInputStream();
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\xoxod\\eclipse-workspace\\mccNetwork\\src\\J20180820\\receive.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		byteRead = is.read(bytearray, 0, bytearray.length);
		currentTot=byteRead;
		
		do {
			byteRead = is.read(bytearray,currentTot,(bytearray.length-currentTot));
			if(byteRead>=0) {
				currentTot+=byteRead;
			}
		}while(byteRead>-1);
		
		bos.write(bytearray, 0, currentTot);
		System.out.println("success");
		bos.flush();
		bos.close();
		is.close();
		s.close();
		
	}

}
