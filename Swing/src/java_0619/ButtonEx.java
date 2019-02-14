package java_0619;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEx {

	public ButtonEx() {
		JFrame f = new JFrame("Button Example");
		JButton b = new JButton(new ImageIcon("D:/배경화면/아이콘/03.png"));
		b.setBounds(50, 100, 200, 80);
		f.add(b);
		f.setSize(300, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ButtonEx();
	}

}
