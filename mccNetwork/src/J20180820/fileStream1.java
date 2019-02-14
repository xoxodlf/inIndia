/**
 * @Summary   : 
 * @Package : J20180820
 * @FileName : fileStream1.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 20.  
 * 
 */
package J20180820;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 
 * @Package : J20180820
 * @FileName : fileStream1.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 20. 
 * 
 */
public class fileStream1 {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fout = new FileOutputStream("C:\\Users\\xoxod\\eclipse-workspace\\mccNetwork\\src\\J20180820\\yang.doc");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		String s = "YANG";
		byte b[]=s.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("Success");
		
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\xoxod\\eclipse-workspace\\mccNetwork\\src\\J20180820\\yang.doc");
			BufferedInputStream bin = new BufferedInputStream(fin);
			int i;
			while((i=bin.read())!=-1) {
				System.out.print((char)i);
			}
			bin.close();
			fin.close();
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
