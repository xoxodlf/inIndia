/**
 * @Summary   : 
 * @Package : J20180411
 * @FileName : basic5.java
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
 * @FileName : basic5.java
 * @Author : Yang TaeIl
 * @date : 2018. 4. 11. 
 * 
 */
public class basic5 {
	
	
	public static void main(String[] args) {
		basic5 t = new basic5();

	}
	
	public  basic5() {
		Frame f = new Frame("Panel Ex");
		Label l1,l2;
		l1 = new Label("JAVA");
		l1.setBounds(50,100,100,30);
		l2 = new Label("PROGRAMMING");
		l2.setBounds(50,150,100,30);
		f.add(l1);
		f.add(l2);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
