package java_0621;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OptionPaneEx2 {
	
	JFrame f;
	
	OptionPaneEx2() {
		f = new JFrame();
		
		String name = JOptionPane.showInputDialog(f, "Enter Name");
		
	}

	public static void main(String[] args) {
		new OptionPaneEx2();
	}

}
