/**
 * @Summary   : 
 * @Package : ex
 * @FileName : cli.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 30.  
 * 
 */
package ex;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.Socket;

/**
 * 
 * @Package : ex
 * @FileName : cli.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 30. 
 * 
 */
public class cli {
	public static void main(String[] args) throws Exception {
		byte[] ba = new byte[10000000]; int readsize;int current=0;
		Socket s = new Socket("192.168.0.2",6666);
		InputStream is = s.getInputStream();
		readsize = is.read(ba, 0, ba.length);
		current=readsize;
		do {
			readsize=is.read(ba, current, ba.length-current);
			if(readsize>-1)
				current+=readsize;
		}while(readsize>-1);
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\xoxod\\eclipse-workspace\\mccNetwork\\src\\ex\\receive.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		bos.write(ba);
		bos.flush();
		bos.close();
		is.close();
		s.close();
		
	}
}
