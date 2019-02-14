/**
 * @Summary   : 
 * @Package : J20180423
 * @FileName : Test5.java
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
 * @FileName : Test5.java
 * @Author : Yang TaeIl
 * @date : 2018. 4. 23. 
 * 
 */
public class Test5 {
	public static void main(String args[]) {
		new Test5();
	}
	
	Test5(){
		Frame f1 = new Frame("Choice list");
		final Label lb1 = new Label();
		lb1.setAlignment(Label.CENTER);
		lb1.setSize(400, 100);
		final Choice cb=new Choice();
		cb.setBounds(100,100,75,75);
		cb.add("1.Mutton");
		cb.add("2.Pork");
		cb.add("3.Beef");
		cb.add("4.Fish");
		
		f1.add(cb);
		
		f1.add(lb1);
		f1.setSize(400, 400);
		f1.setLayout(null);
		f1.setVisible(true);
		
		cb.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				String data = "You Selected" + cb.getItem(cb.getSelectedIndex());
				lb1.setText(data);
			}
		});
	}
}
