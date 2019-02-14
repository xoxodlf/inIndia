package J20180419;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class allPractice extends JFrame implements ActionListener {

	public static void main(String[] args) {
		new allPractice();
	}

	public allPractice() {
		Frame f = new Frame("Hello");
		Label l1, l2, l3, l4, l5, l6, l7;
		TextField t1, t2, t3, t4;
		Button b1, b2;
		Checkbox cb1, cb2, cb3;
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox c1, c2;

		Color hotpink = new Color(255, 28, 118);
		Color indigo = new Color(8, 11, 84);
		Color violet = new Color(128, 0, 255);

		MenuBar mb = new MenuBar();
		Menu menu = new Menu("Course");
		Menu menu1 = new Menu("Help");
		Menu submenu1 = new Menu("UG");
		Menu submenu2 = new Menu("PG");

		MenuItem mi1 = new MenuItem("B.Sc.");
		MenuItem mi2 = new MenuItem("BCA");
		MenuItem mi3 = new MenuItem("BBA");
		MenuItem mi4 = new MenuItem("M.Sc.");
		MenuItem mi5 = new MenuItem("MCA");

		l1 = new Label("NAME : ");
		l1.setBounds(20, 100, 100, 30);

		t1 = new TextField("");
		t1.setBounds(150, 100, 180, 30);
		t1.setBackground(Color.red);

		l2 = new Label("ADRESS : ");
		l2.setBounds(20, 150, 100, 30);

		t2 = new TextField("");
		t2.setBounds(150, 150, 180, 30);
		t2.setBackground(Color.orange);

		l3 = new Label("CONTACT NUMBER : ");
		l3.setBounds(20, 200, 150, 30);

		t3 = new TextField("");
		t3.setBounds(150, 200, 180, 30);
		t3.setBackground(Color.yellow);

		l4 = new Label("EMAIL : ");
		l4.setBounds(20, 250, 100, 30);

		t4 = new TextField("");
		t4.setBounds(150, 250, 180, 30);
		t4.setBackground(Color.green);

		l5 = new Label("Course : ");
		l5.setBounds(20, 300, 100, 30);

		cb1 = new Checkbox("JAVA");
		cb1.setBounds(150, 300, 50, 30);
		cb1.setBackground(Color.blue);
		cb1.setForeground(Color.WHITE);

		cb2 = new Checkbox("PHP");
		cb2.setBounds(200, 300, 50, 30);
		cb2.setBackground(Color.blue);
		cb2.setForeground(Color.WHITE);

		cb3 = new Checkbox("Python");
		cb3.setBounds(250, 300, 60, 30);
		cb3.setBackground(Color.blue);
		cb3.setForeground(Color.WHITE);

		l6 = new Label("Married : ");
		l6.setBounds(20, 350, 100, 30);

		c1 = new Checkbox("Single", cbg, false);
		c1.setBounds(150, 350, 60, 30);
		c1.setBackground(indigo);
		c1.setForeground(Color.WHITE);

		c2 = new Checkbox("married", cbg, false);
		c2.setBounds(210, 350, 60, 30);
		c2.setBackground(indigo);
		c2.setForeground(Color.WHITE);

		l7 = new Label("message : ");
		l7.setBounds(20, 400, 100, 30);

		TextArea area1 = new TextArea("Enter your Address");
		area1.setBounds(150, 400, 180, 150);
		area1.setBackground(violet);
		area1.setForeground(Color.WHITE);

		b1 = new Button("OK");
		b1.setBounds(20, 700, 100, 30);
		b1.setBackground(Color.green);

		b2 = new Button("CANCEL");
		b2.setBounds(150, 700, 100, 30);
		b2.setBackground(Color.red);

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});

		f.add(t1);
		f.add(l1);
		f.add(t2);
		f.add(l2);
		f.add(t3);
		f.add(l3);
		f.add(t4);
		f.add(l4);
		f.add(l5);
		f.add(cb1);
		f.add(cb2);
		f.add(cb3);
		f.add(l6);
		f.add(c1);
		f.add(c2);
		f.add(l7);
		f.add(b1);
		f.add(b2);
		f.add(area1);

		submenu1.add(mi1);
		submenu1.add(mi2);
		submenu1.add(mi3);
		submenu2.add(mi4);
		submenu2.add(mi5);

		menu.add(submenu1);
		menu.add(submenu2);
		mb.add(menu);// menu1
		mb.add(menu1);

		f.setMenuBar(mb);
		f.setBackground(Color.white);
		f.setSize(400, 800);
		f.setLayout(null);
		f.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

	}

}
