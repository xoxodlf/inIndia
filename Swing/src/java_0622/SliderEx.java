package java_0622;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class SliderEx extends JFrame {
	
	public SliderEx() {
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
		slider.setMinorTickSpacing(2);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		
		JPanel panel = new JPanel();
		panel.add(slider);
		add(panel);
		
	}

	public static void main(String[] args) {
		SliderEx frame = new SliderEx();
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
