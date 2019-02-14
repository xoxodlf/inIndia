/**
 * @Summary   : 
 * @Package : J20180411
 * @FileName : basic4.java
 * @Author : Yang TaeIl
 * @date : 2018. 4. 11.  
 * 
 */
package J20180411;

import java.awt.*;
import java.awt.event.*;
/**
 * 
 * @Package : J20180411
 * @FileName : basic4.java
 * @Author : Yang TaeIl
 * @date : 2018. 4. 11. 
 * 
 */
public class basic4 {
	private static Dialog d;
	
	public static void main(String[] args) {
		basic4 t = new basic4();

	}
	
	public basic4() {
		Frame f = new Frame("File Dialog Demo");
		f.setVisible(true);
		f.setSize(700,700);
		FileDialog fd = new FileDialog(f, "File Dialog");
		fd.setVisible(true);
	}
}
