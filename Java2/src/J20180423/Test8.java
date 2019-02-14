/**
 * @Summary   : 
 * @Package : J20180423
 * @FileName : Test8.java
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
 * @FileName : Test8.java
 * @Author : Yang TaeIl
 * @date : 2018. 4. 23. 
 * 
 */
public class Test8 implements ActionListener{
	Frame f = new Frame("cal");
	Label lb1 = new Label("Enter the First Number");
	Label lb2 = new Label("Enter the Second Number");
	Label lb3 = new Label("result");
	
	TextField t1 =new TextField();
	TextField t2 =new TextField();
	TextField t3 =new TextField();
	
	Button b1= new  Button("ADD");
	Button b2= new  Button("MINUS");
	Button b3= new  Button("MULTI");
	Button b4= new  Button("DIVIDE");
	Button b5= new  Button("Cancel");
	
	Test8(){
		lb1.setBounds(40, 100, 150, 25);
		lb2.setBounds(40,140,150,25);
		lb3.setBounds(40, 180, 150, 25);
		t1.setBounds(250,100,100,25);
		t2.setBounds(250,140,100,25);
		t3.setBounds(250,180,100,25);
		b1.setBounds(150,250,45,15);
		b2.setBounds(210,250,45,15);
		b3.setBounds(270,250,45,15);
		b4.setBounds(330,250,45,15);
		b5.setBounds(390,250,45,15);
		f.add(lb1);f.add(lb2);f.add(lb3);f.add(t1);f.add(t2);f.add(t3);f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(750, 600);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int n1= Integer.parseInt(t1.getText());
		int n2 =Integer.parseInt(t2.getText());
		if(e.getSource()==b1) {
			t3.setText(String.valueOf(n1+n2));
		}else if(e.getSource()==b2) {
			t3.setText(String.valueOf(n1-n2));
		}else if(e.getSource()==b3) {
			t3.setText(String.valueOf(n1*n2));
		}else if(e.getSource()==b4) {
			t3.setText(String.valueOf(n1/n2));
		}else {
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
	}
	
	public static void main(String args[]) {
		new Test8();
	}
	
}
