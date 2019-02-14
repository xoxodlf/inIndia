package java_0619;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class ToolTipEx {

	public static void main(String[] args) {
		JFrame f = new JFrame("Password Field Ex");

		final JPasswordField value = new JPasswordField();
		value.setBounds(100, 100, 100, 30);
		value.setToolTipText("Enter your Password");

		JLabel l1 = new JLabel("Password : ");
		l1.setBounds(20, 100, 80, 30);


		f.add(value);
		f.add(l1);

		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
