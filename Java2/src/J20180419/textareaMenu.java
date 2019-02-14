package J20180419;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import javax.swing.JFrame;

public class textareaMenu extends JFrame {
	textareaMenu() {
		Frame f = new Frame("Menubar, Textarea Example");
		Checkbox cb1, cb2, cb3;
		
		Color hotpink = new Color(255, 28, 118);
		Color emerald = new Color(30, 255, 206);
		
		cb1 = new Checkbox("JAVA");
		cb1.setBounds(10, 400, 50, 30);
		cb1.setBackground(hotpink);
		cb1.setForeground(Color.white);
		
		cb2 = new Checkbox("PHP");
		cb2.setBounds(80, 400, 50, 30);
		cb2.setBackground(emerald);
		cb2.setForeground(Color.white);
		
		cb3 = new Checkbox("Python");
		cb3.setBounds(150, 400, 60, 30);
		cb3.setBackground(hotpink);
		cb3.setForeground(Color.white);
		
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
		
		f.add(cb1);
		f.add(cb2);
		f.add(cb3);
		
		submenu1.add(mi1);
		submenu1.add(mi2);
		submenu1.add(mi3);
		submenu2.add(mi4);
		submenu2.add(mi5);

		menu.add(submenu1);
		menu.add(submenu2);
		mb.add(menu);//menu1
		mb.add(menu1);
		f.setMenuBar(mb);
		
		Label l1 = new Label("Address:");
		l1.setBounds(10, 40, 100, 30);
		f.add(l1);

		TextArea area1 = new TextArea("Enter your Address");
		area1.setBounds(10, 70, 300, 300);
		f.add(area1);

		
		
		
		
		
		
		
		
		
		
		
		
		
		f.setSize(600, 1000);
		f.setLayout(null);
		f.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		textareaMenu ta = new textareaMenu();
	}

}
