package java_0620;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextFieldEx {
	public static void main(String[] args) {
		JFrame f = new JFrame("Text Field Example");
		
		JLabel l1, l2, l3;
		JTextField t1, t2, t3;
		JButton b1, b2;
		
		l1 = new JLabel("num1 : ");
		l1.setBounds(50, 50, 50, 30);
		
		t1 = new JTextField();
		t1.setBounds(100, 50, 100, 30);
		
		l2 = new JLabel("num2 : ");
		l2.setBounds(50, 100, 50, 30);
		
		t2 = new JTextField();
		t2.setBounds(100, 100, 100, 30);
		
		l3 = new JLabel("Result : ") ;
		l3.setBounds(50, 150, 50, 30);
		
		t3 = new JTextField();
		t3.setBounds(100, 150, 100, 30);
		t3.setEditable(false);
		
		b1 = new JButton("+");
		b1.setBounds(50, 250, 70, 30);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String n1 = t1.getText();
				String n2 = t2.getText();
				int result = Integer.parseInt(n1) +  Integer.parseInt(n2);
				
				t3.setText(String.valueOf(result));
				
			}
		});
		
		b2 = new JButton("-");
		b2.setBounds(150, 250, 70, 30);
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String n1 = t1.getText();
				String n2 = t2.getText();
				int result = Integer.parseInt(n1) -  Integer.parseInt(n2);
				
				t3.setText(String.valueOf(result));				
			}
		});
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(b1);
		f.add(b2);
		
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}
