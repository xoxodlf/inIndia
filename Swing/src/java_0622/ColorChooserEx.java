package java_0622;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ColorChooserEx extends JFrame implements ActionListener {
	
	JFrame f;
	JButton b;
	JTextArea ta;
	
	ColorChooserEx() {
		f = new JFrame("Color Chooser Example.");
		
		b = new JButton("Pad Color");
		b.setBounds(200, 250, 100, 30);
		
		ta = new JTextArea();
		ta.setBounds(10, 10, 300, 200);
		
		b.addActionListener(this);
		
		f.add(b);
		f.add(ta);
		
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Color c = JColorChooser.showDialog(this, "Choose", Color.RED);
		ta.setBackground(c);
	}

	public static void main(String[] args) {
		new ColorChooserEx();
	}


}
