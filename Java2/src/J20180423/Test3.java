/**
 * @Summary   : 
 * @Package : J20180423
 * @FileName : Test3.java
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
 * @FileName : Test3.java
 * @Author : Yang TaeIl
 * @date : 2018. 4. 23. 
 * 
 */
public class Test3 extends Frame {
	TextArea ta;
	public Test3(String title) {
		super(title);
		ta=new TextArea();
		add(ta,BorderLayout.CENTER);
		Choice choice = new Choice();
		choice.addItem("red");
		choice.addItem("green");
		choice.addItem("blue");
		choice.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				ta.setText("This is a "+e.getItem()+" color.\n");
			}
		});
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		add(choice,BorderLayout.NORTH);
		setSize(400, 400);
		setVisible(true);
		setResizable(false);
	}
	
	public static void main(String args[]) {
		new Test3("t");
	}
}
