package read;
/**
 * @Summary   : 
 * @Package : 
 * @FileName : reader.java
 * @Author : Yang TaeIl
 * @date : 2018. 10. 17.  
 * 
 */

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/**
 * 
 * @Package : 
 * @FileName : reader.java
 * @Author : Yang TaeIl
 * @date : 2018. 10. 17. 
 * 
 */
public class reader {
	public static void main(String[] args) throws Exception {
		String filePath = "";
		
		try {
			File file = new File("C:\\Users\\xoxod\\eclipse-workspace\\USR\\src\\read\\1.lvsngl"); 
			byte[] ba = new byte[(int)file.length()];
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);
			bis.read(ba, 0, ba.length);

			float tmp[]= new float[4992];
			
			for(int i=0, j=0;i<4992;i++,j=j+4) {
				byte[] a = new byte[4];
				a[0]=ba[j];a[1]=ba[j+1];a[2]=ba[j+2];a[3]=ba[j+3];
				tmp[i] = ByteBuffer.wrap(a).order(ByteOrder.BIG_ENDIAN).getFloat();
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
