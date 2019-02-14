/**
 * @Summary   : 
 * @Package : J20180411
 * @FileName : basic6.java
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
 * @FileName : basic6.java
 * @Author : Yang TaeIl
 * @date : 2018. 4. 11. 
 * 
 */
public class basic6 {

	
	public static void main(String[] args) {
		Frame f = new Frame("Label Ex");
		TextField t1,t2,t3,t4;
		Label l1,l2,l3,l4,l5,l6;
		Checkbox c1,c2,c3,c4;
		CheckboxGroup cbg = new CheckboxGroup();
		c3 = new Checkbox("Man",cbg,false);
		c3.setBounds(150,350,50,50);
		c4 = new Checkbox("Female",cbg,false);
		c4.setBounds(200,350,60,50);
		Button b1,b2;
		c1 = new Checkbox("Java");
		c1.setBounds(150,300,50,50);
		c2 = new Checkbox("Python");
		c2.setBounds(200,300,60,50);
		b1= new Button("OK");
		b1.setBounds(150,400,50,50);
		b2= new Button("Cancel");
		b2.setBounds(250,400,50,50);
		l1 = new Label("Name");
		l1.setBounds(50,90,50,50);
		l2 = new Label("Address");
		l2.setBounds(50,140,50,50);
		l3 = new Label("Contact Number");
		l3.setBounds(50,190,100,50);
		l4 = new Label("E-mail");
		l4.setBounds(50,240,80,50);
		l5 = new Label("Subject");
		l5.setBounds(50,290,80,50);
		l6 = new Label("Gender");
		l6.setBounds(50,340,80,50);
		t1 = new TextField("");
		t1.setBounds(150,100,200,30);
		t2 = new TextField("");
		t2.setBounds(150,150,200,30);
		t3 = new TextField("");
		t3.setBounds(150,200,200,30);
		t4 = new TextField("");
		t4.setBounds(150,250,200,30);
		f.add(t1);
		f.add(t2);
		f.add(l1);
		f.add(l2);
		f.add(t3);
		f.add(t4);
		f.add(l3);
		f.add(l4);
		f.add(b1);
		f.add(b2);
		f.add(c1);
		f.add(c2);
		f.add(c4);
		f.add(c3);
		f.add(l5);
		f.add(l6);
		f.setBackground(Color.GRAY);
		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);
	}

}
