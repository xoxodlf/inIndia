package java_0620;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxEvent {

	CheckBoxEvent() {
		JFrame f = new JFrame("Check Box Example");
		final JLabel label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setSize(400, 100);

		JCheckBox checkBox1 = new JCheckBox("C++");
		checkBox1.setBounds(150, 100, 50, 50);

		JCheckBox checkBox2 = new JCheckBox("JAVA");
		checkBox2.setBounds(150, 150, 150, 50);

		f.add(checkBox1);
		f.add(checkBox2);
		f.add(label);

		checkBox1.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				label.setText("C++ Checkbox : " + (e.getStateChange() == 1 ? "checked" : "unchecked"));
			}
		});

		checkBox2.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				label.setText("JAVA Checkbox : " + (e.getStateChange() == 1 ? "checked" : "unchecked"));
			}
		});

		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new CheckBoxEvent();
	}

}
