/**
 * @Summary   : 
 * @Package : J20180725
 * @FileName : basic3.java
 * @Author : Yang TaeIl
 * @date : 2018. 7. 25.  
 * 
 */
package J20180725;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

/**
 * 
 * @Package : J20180725
 * @FileName : basic3.java
 * @Author : Yang TaeIl
 * @date : 2018. 7. 25.
 * 
 */
public class basic3 {
	public static void main(String[] args) throws Exception {
		URL hp = new URL("http://www.w3schools.com");
		// System.out.println(hp.getProtocol());
		// System.out.println(hp.getHost());
		// System.out.println(hp.getPort());
		// System.out.println(hp.getFile());
		// System.out.println(hp.toExternalForm());
		URLConnection hpCon = hp.openConnection();
		System.setOut(new PrintStream(new FileOutputStream("xoxodlf.txt")));
		long d = hpCon.getDate();

		if (d == 0)
			System.out.println("No date Info");
		else
			System.out.println("Date : " + new Date(d));

		System.out.println("Content-type : " + hp.getContent());

		d = hpCon.getExpiration();
		if (d == 0)
			System.out.println("No Expiry");
		else
			System.out.println("Expiry : " + new Date(d));
		
		d=hpCon.getLastModified();
		
		if (d == 0)
			System.out.println("No date Info");
		else
			System.out.println("Date : " + new Date(d));
		
		int length = hpCon.getContentLength();
		if(length==-1)System.out.println("No Content");
		else System.out.println("Content length : " + length);
		
		
		if(length!=0) {
			System.out.println("***************");
			
			InputStream input = hpCon.getInputStream();
			int i=length;
			int c;
			while(((c=input.read())!=-1)) {
				System.out.print((char)c);
			}
			
			input.close();
		}else {
			System.out.println("No Connection");
		}
	}
}
