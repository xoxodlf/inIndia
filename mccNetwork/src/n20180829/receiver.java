/**
 * @Summary   : 
 * @Package : n20180829
 * @FileName : receiver.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 29.  
 * 
 */
package n20180829;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.Socket;
import java.util.Arrays;

/**
 * 
 * @Package : n20180829
 * @FileName : receiver.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 29. 
 * 
 */
public class receiver {
	public static void main(String[] args) throws Exception {
		Socket s = new Socket("192.168.2.37", 6666);
		byte ba[] = new byte[1000000000];
		InputStream is = s.getInputStream();
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\xoxod\\eclipse-workspace\\mccNetwork\\src\\n20180829\\receive.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int byteread = is.read(ba, 0, ba.length);
		int current = byteread;
		bos.write(ba,0,current);
		System.out.println(byteread);
		do {
			byteread = is.read(ba, current, ba.length-current);
			if(byteread>=0)
				current+=byteread;
			System.out.println(current+" "+byteread);
		}while(byteread>-1);
		
		
		System.out.println("success");
		bos.flush();
		bos.close();
		is.close();
		s.close();
	}
}
