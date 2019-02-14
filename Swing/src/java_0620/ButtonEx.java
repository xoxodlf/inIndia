package java_0620;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ButtonEx {
	public static void main(String[] args) {
		JFrame f = new JFrame("Button Example");
		final JTextField tf = new JTextField();
		tf.setBounds(50, 50, 150, 20);
		
		JButton b = new JButton("Click Here");
		b.setBounds(50, 100, 95, 30);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tf.setText("Welcome To Swing");
			}
		});
		
		f.add(b);
		f.add(tf);
		
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
