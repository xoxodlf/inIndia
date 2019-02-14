/**
 * @Summary   : 
 * @Package : J20180411
 * @FileName : basic3.java
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
 * @FileName : basic3.java
 * @Author : Yang TaeIl
 * @date : 2018. 4. 11. 
 * 
 */
public class basic3 {
	private static Dialog d;
	public static void main(String args[]) {
		basic3 t = new basic3();
	}
	public basic3() {
		Frame f = new Frame();
		d= new Dialog(f,"Dialog demo",true);
		d.setLayout(new FlowLayout());
		Button b = new Button("OK");
		d.add(new Label("Dialog"));
		d.add(b);
		d.setSize(400, 200);
		d.setVisible(true);
	}

}
