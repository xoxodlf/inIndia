/**
 * @Summary   : 
 * @Package : J20180423
 * @FileName : Test7.java
 * @Author : Yang TaeIl
 * @date : 2018. 4. 23.  
 * 
 */
package J20180423;

import java.awt.*;
import java.awt.event.*;
/**
 * 
 * @Package : J20180423
 * @FileName : Test7.java
 * @Author : Yang TaeIl
 * @date : 2018. 4. 23. 
 * 
 */
public class Test7 {
	Test7(){
		Frame f= new Frame("f");
		final Label l1 = new Label();
		l1.setAlignment(Label.CENTER);
		l1.setSize(400, 100);
		final Scrollbar s1 = new Scrollbar();
		s1.setBounds(100, 100, 20, 300);
		final Scrollbar s2 = new Scrollbar(Scrollbar.HORIZONTAL);
		s2.setBounds(200,200,300,20);
		f.add(s1);
		f.add(s2);
		f.add(l1);
		f.setSize(600, 500);
		f.setLayout(null);
		f.setVisible(true);
		s1.addAdjustmentListener(new AdjustmentListener() {
			
			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				l1.setText("Vertical Scrollbar Adjusted with: "+s1.getValue());
			}
		});
		
		s2.addAdjustmentListener(new AdjustmentListener() {
			
			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				l1.setText("HORIZONTAL Scrollbar Adjusted with: "+s2.getValue());
			}
		});
	}
	public static void main(String args[]) {
		new Test7();
	}
}
