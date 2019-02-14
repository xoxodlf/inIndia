/**
 * @Summary   : 
 * @Package : J20180423
 * @FileName : Test2.java
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
 * @FileName : Test2.java
 * @Author : Yang TaeIl
 * @date : 2018. 4. 23. 
 * 
 */
public class Test2 extends Frame {
	Label label;
	TextField tf;
	public Test2() {
		super("KeyPressEventFrame");
		Panel panel =new Panel();
		label = new Label();
		tf =new TextField(20);
		tf.addKeyListener(new MyKeyListener());
		
		add(label, BorderLayout.NORTH);
		panel.add(tf,BorderLayout.CENTER);
		add(panel,BorderLayout.CENTER);
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
				System.exit(0);
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		setSize(400, 400);
		setVisible(true);
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent ke) {
			char i = ke.getKeyChar();
			String str=Character.toString(i);
			label.setText(str);
		}
	}
	
	public static void main(String args[]) {
		new Test2();
	}

}


