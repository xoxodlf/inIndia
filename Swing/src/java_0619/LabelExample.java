package java_0619;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LabelExample {

	public static void main(String[] args) {
		JFrame f = new JFrame("Find IP");
		JButton b;
		
		final JTextField tf = new JTextField();
		tf.setBounds(50, 50, 150, 20);
		
		final JLabel l = new JLabel();
		l.setBounds(50, 100, 250, 20);
		
		b = new JButton("Find IP");
		b.setBounds(50, 150, 95, 30);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					String host = tf.getText();
					String ip = java.net.InetAddress.getByName(host).getHostAddress();
					l.setText("IP of " + host + " : " + ip);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		});
		
		f.add(b);
		f.add(tf);
		f.add(l);
		
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
