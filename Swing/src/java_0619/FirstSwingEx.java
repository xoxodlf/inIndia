package java_0619;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstSwingEx {

	public static void main(String[] args) {
		JFrame f = new JFrame();	// Creating instance of JFrame
		
		JButton b = new JButton("Click");	// Creating instance of JButton
		b.setBounds(130, 100, 100, 40);		// x axis, y axis, width, height
		
		f.add(b);
		f.setSize(400, 500);
		f.setLayout(null);
		f.setVisible(true);
	}

}
