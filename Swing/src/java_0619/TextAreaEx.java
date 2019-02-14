package java_0619;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TextAreaEx {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		JTextArea area = new JTextArea("Welcome to Swing");
		area.setBounds(5, 5, 200, 200);
		
		f.add(area);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
