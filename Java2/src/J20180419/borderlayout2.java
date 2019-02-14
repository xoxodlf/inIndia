package J20180419;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class borderlayout2 extends JFrame implements ActionListener {
	Label lb1;

	public static void main(String[] args) {
		new borderlayout2();
	}

	borderlayout2() {
		setLayout(new BorderLayout());
		try {
			Button button1 = new Button("Border Latout NORTH");
			button1.addActionListener(this);
			add(button1, BorderLayout.NORTH);
			
			Button button2 = new Button("Border Latout SOUTH");
			button2.addActionListener(this);
			add(button2, BorderLayout.SOUTH);
			
			Button button3 = new Button("Border Latout EAST");
			button3.addActionListener(this);
			add(button3, BorderLayout.EAST);
			
			Button button4 = new Button("Border Latout WEST");
			button4.addActionListener(this);
			add(button4, BorderLayout.WEST);
			
			lb1 = new Label("Border Latout CENTER");
			lb1.setBackground(Color.white);
			add(lb1, BorderLayout.CENTER);

			addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent we) {
					System.exit(0);
				}
			});

		} catch (Exception e) {
			System.out.println(e);
		}
		setSize(500, 500);
		setVisible(true);
		setTitle("Event in Java awt");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Button bt = (Button) e.getSource();
		String str = bt.getLabel();
		lb1.setText(str);
	}

}
