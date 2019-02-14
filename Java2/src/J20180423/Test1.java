/**
 * @Summary   : 
 * @Package : J20180423
 * @FileName : Test1.java
 * @Author : Yang TaeIl
 * @date : 2018. 4. 23.  
 * 
 */
package J20180423;

import java.awt.*;
import java.awt.event.*;
/**
 * 
 * @Package : J20180423
 * @FileName : Test1.java
 * @Author : Yang TaeIl
 * @date : 2018. 4. 23. 
 * 
 */
public class Test1 extends Frame implements KeyListener{
	
	TextField t1; Label l1;
	
	public Test1(String s) {
		super(s);
		Panel p = new Panel();
		l1= new Label("KeyListener");
		p.add(l1);
		add(p);
		addKeyListener(this);
		setSize(400, 300);
		setVisible(true);
		addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	public static void  main(String args[]) {
		new Test1("Key Listener Tester");
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		l1.setText("key pressed");
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		l1.setText("key released");
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		l1.setText("key typed");
	}
	
}
