/**
 * @Summary   : 
 * @Package : J20180411
 * @FileName : basic2.java
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
 * @FileName : basic2.java
 * @Author : Yang TaeIl
 * @date : 2018. 4. 11. 
 * 
 */
public class basic2 {

	public static void main(String[] args) {
		Frame f = new Frame("Panel Example");
		Panel p = new Panel();
		
		p.setBounds(40,80,200,200);
		p.setBackground(Color.cyan);
		Button bt1 = new Button("B.sc");
		bt1.setBounds(50,100,80,30);
		bt1.setBackground(Color.yellow);
		
		Button bt2 = new Button("M.sc");
		bt2.setBounds(100,100,80,30);
		bt2.setBackground(Color.red);
		p.add(bt1);
		p.add(bt2);
		f.add(p);
		f.setSize(600, 600);
		f.setLayout(null);
		f.setVisible(true);
	}

}
