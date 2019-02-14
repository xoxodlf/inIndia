/**
 * @Summary   : 
 * @Package : java_0628
 * @FileName : foodorder.java
 * @Author : Yang TaeIl
 * @date : 2018. 6. 28.  
 * 
 */
package java_0628;

import javax.swing.*;
import java.awt.event.*;
/**
 * 
 * @Package : java_0628
 * @FileName : foodorder.java
 * @Author : Yang TaeIl
 * @date : 2018. 6. 28. 
 * 
 */
public class food extends JFrame implements ActionListener {

	JLabel l;
	JCheckBox cb1,cb2,cb3;
	JButton b;
	JTextField t1,t2,t3;
	
	public food() {
		l= new JLabel("Food Ordering System");
		l.setBounds(50,50,300,20);
		cb1= new JCheckBox("Pizza @ 100");
		cb1.setBounds(100, 100, 150, 20);
		t1=new JTextField();
		t1.setBounds(260, 100, 50, 20);
		cb2= new JCheckBox("Burger @ 30");
		cb2.setBounds(100, 150, 150, 20);
		t2=new JTextField();
		t2.setBounds(260, 150, 50, 20);
		cb3= new JCheckBox("Tea @ 10");
		cb3.setBounds(100, 200, 150, 20);
		t3=new JTextField();
		t3.setBounds(260, 200, 50, 20);
		b = new JButton("Order");
		b.setBounds(100, 250, 80, 30);
		b.addActionListener(this);
		add(l);add(cb1);add(cb2);add(cb3);add(b);add(t1);add(t2);add(t3);
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		float amount=0;
		String msg="";
		
		
		if(cb1.isSelected()) {
			
			msg+="Pizza 100*"+t1.getText()+"\n";
			amount+=Integer.parseInt(t1.getText())*100;
		}
		if(cb2.isSelected()) {
			msg+="Burger 30*"+t2.getText()+"\n";
			amount+=Integer.parseInt(t2.getText())*30;
		}
		if(cb3.isSelected()) {
			msg+="Tea 10*"+t3.getText()+"\n";
			amount+=Integer.parseInt(t3.getText())*10;
		}
		msg+="------------------------\n";
		JOptionPane.showMessageDialog(this, msg + "Total: "+amount);
	}
	
	public static void main(String args[]) {
		food a= new food();
	}

}
