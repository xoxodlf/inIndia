/**
 * @Summary   : 
 * @Package : n20180829
 * @FileName : sender.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 29.  
 * 
 */
package n20180829;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 
 * @Package : n20180829
 * @FileName : sender.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 29. 
 * 
 */
public class sender {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please type your content");
		fileMaker fm = new fileMaker();
		String content = sc.nextLine();
		fm.writeFile(content);
		ServerSocket ss = new ServerSocket(6666);
		Socket s = ss.accept();
		
		File sendFile = new File(fm.address);
		try {
			byte[] ba = new byte[(int)sendFile.length()];
			FileInputStream fis = new FileInputStream(sendFile);
			BufferedInputStream bis = new BufferedInputStream(fis);
			bis.read(ba, 0, ba.length);
			OutputStream os = s.getOutputStream();
			os.write(ba, 0, ba.length);
			os.flush();
			os.close();
			bis.close();
			fis.close();
		}catch (Exception e) {
			e.getStackTrace();
		}
		
	}
}
