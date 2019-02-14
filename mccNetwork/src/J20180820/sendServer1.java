/**
 * @Summary   : 
 * @Package : J20180820
 * @FileName : sendServer1.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 20.  
 * 
 */
package J20180820;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 
 * @Package : J20180820
 * @FileName : sendServer1.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 20. 
 * 
 */
public class sendServer1 {

	public static void main(String[] args) throws Exception {
		ServerSocket s1 = new ServerSocket(1252);
		Socket ss = s1.accept();
		System.out.println(ss);
		try {
			File transFile = new File("C:\\Users\\xoxod\\eclipse-workspace\\mccNetwork\\src\\J20180820\\yang.doc");
			byte[] bytearray = new byte[(int)transFile.length()];
			FileInputStream fin = new FileInputStream(transFile);
			BufferedInputStream bin = new BufferedInputStream(fin);
			bin.read(bytearray, 0, bytearray.length);
			OutputStream os = ss.getOutputStream();
			System.out.println("Sending file");
			os.write(bytearray,0,bytearray.length);
			os.flush();
			ss.close();
			System.out.println("file transfer complete");
			s1.close();
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
