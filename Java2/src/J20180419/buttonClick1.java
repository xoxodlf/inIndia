package J20180419;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class buttonClick1 extends JFrame implements ActionListener {
	TextField t1;

	public static void main(String[] args) {
		new buttonClick1();

	}

	buttonClick1() {
		try {
			t1 = new TextField();
			t1.setBounds(60, 50, 200, 20);
			Button b = new Button("click");
			b.setBounds(100, 120, 80, 30);
			b.addActionListener(this);
			add(b);
			add(t1);
			addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent we) {
					System.exit(0);
				}
			});
		} catch (Exception e) {
			System.out.println(e);
		}
		setSize(500, 500);
		setLayout(null);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		t1.setText("Welcome");
	}

}
