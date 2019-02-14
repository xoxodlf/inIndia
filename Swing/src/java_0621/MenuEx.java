package java_0621;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuEx {
	
	JMenu menu, submenu;
	JMenuItem i1, i2, i3, i4, i5;
	
	MenuEx() {
		JFrame f = new JFrame("Menu and MenuItem Example");
		
		JMenuBar mb = new JMenuBar();
		
		menu = new JMenu("Menu");
		submenu = new JMenu("Sub Menu");
		
		i1 = new JMenuItem("item1");
		i2 = new JMenuItem("item2");
		i3 = new JMenuItem("item3");
		i4 = new JMenuItem("item4");
		i5 = new JMenuItem("item5");
		
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		submenu.add(i4);
		submenu.add(i5);
		
		menu.add(submenu);
		mb.add(menu);
		
		f.setJMenuBar(mb);
		
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MenuEx();
	}

}
