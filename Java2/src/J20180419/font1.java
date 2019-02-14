package J20180419;

import java.awt.Frame;
import java.awt.GraphicsEnvironment;
import java.awt.TextArea;

public class font1 {

	public static void main(String[] args) {
		Frame f = new Frame("Font Demo");
		String fontlist[] = null;
		String msg="";
		TextArea txt =null;
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		fontlist = ge.getAvailableFontFamilyNames();
		for (int i = 0; i < fontlist.length; i++) {
			msg+=fontlist[i]+"\n";
			txt = new TextArea(msg);
		}
		txt.setBounds(70,100,300,300);
		f.add(txt);
		
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
