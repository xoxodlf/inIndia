/**
 * @Summary   : 
 * @Package : ex
 * @FileName : ser.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 30.  
 * 
 */
package ex;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 
 * @Package : ex
 * @FileName : ser.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 30. 
 * 
 */
public class ser {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(6666);
		Socket s = ss.accept();
		
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\xoxod\\eclipse-workspace\\mccNetwork\\src\\ex\\wr.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		Scanner sc =new Scanner(System.in);
		
		String content = sc.nextLine();
		
		bos.write(content.getBytes());
		bos.flush();
		bos.close();
		fos.close();
		
		
		File file = new File("C:\\Users\\xoxod\\eclipse-workspace\\mccNetwork\\src\\ex\\wr.txt");
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		byte[] ba = new byte[(int) file.length()];
		bis.read(ba, 0, ba.length);
		OutputStream os = s.getOutputStream();
		os.write(ba);
		os.flush();
		bis.close();
		fis.close();
		os.close();
		s.close();
		ss.close();
	}
}
