package java_0621;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OptionPaneEx {
	
	JFrame f;
	
	OptionPaneEx() {
		f = new JFrame();
		
		JOptionPane.showMessageDialog(f, "Successfully Updated", "Alert", JOptionPane.WARNING_MESSAGE);
		
	}

	public static void main(String[] args) {
		new OptionPaneEx();
	}

}
