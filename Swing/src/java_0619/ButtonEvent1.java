package java_0619;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ButtonEvent1 implements ActionListener {
	
	JFrame f;
	JButton b = new JButton("Say Hi");
	
	public void createUI() {
		f = new JFrame();
		f.setLayout(null);
		
		JLabel tbLabel = new JLabel("Click On Button");
		b.addActionListener(this);
		
		tbLabel.setBounds(75, 50, 100, 20);
		b.setBounds(75, 75, 150, 20);
		
		f.add(tbLabel);
		f.add(b);
		
		f.setSize(300, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		ButtonEvent1 obj = new ButtonEvent1();
		obj.createUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		b = (JButton) e.getSource();
		sayHi();
	}
	
	public void sayHi() {
		JOptionPane.showMessageDialog(f, "Hi, To All", "Say Hi", JOptionPane.INFORMATION_MESSAGE);
	}
}
