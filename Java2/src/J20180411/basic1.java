package J20180411;
import java.awt.*;
import java.awt.event.*;
/**
 * @Summary   : 
 * @Package : 
 * @FileName : basic1.java
 * @Author : Yang TaeIl
 * @date : 2018. 4. 11.  
 * 
 */

/**
 * 
 * @Package : 
 * @FileName : basic1.java
 * @Author : Yang TaeIl
 * @date : 2018. 4. 11. 
 * 
 */


public class basic1 extends Frame {
	String s ="sdfsdf1";
	public basic1(){
		setSize(400, 100);
		setVisible(true);
		setTitle("Test");
	}
	
	public void paint(Graphics g) {
		
		g.drawString(s, 30, 50);
	}
	
	
	public static void main(String[] args) {
		basic1 t = new basic1();
		
		try {
			Thread.sleep(5000);
		}catch(Exception e) {
			
		}
		t.s="Hello";
		t.repaint();
	}

}
