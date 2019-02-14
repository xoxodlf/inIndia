/**
 * @Summary   : 
 * @Package : n20180829
 * @FileName : fileMakerSender.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 29.  
 * 
 */
package n20180829;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 * 
 * @Package : n20180829
 * @FileName : fileMakerSender.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 29. 
 * 
 */
public class fileMaker {
	String address ="C:\\Users\\xoxod\\eclipse-workspace\\mccNetwork\\src\\n20180829\\write.txt";
	FileOutputStream fos;
	BufferedOutputStream bos;
	public void writeFile(String content){
		try {
			FileOutputStream fos= new FileOutputStream(address);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			bos.write(content.getBytes());
			bos.flush();
			bos.close();
			fos.close();
			System.out.println("file write success");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
