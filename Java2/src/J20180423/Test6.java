/**
 * @Summary   : 
 * @Package : J20180423
 * @FileName : Test6.java
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
 * @FileName : Test6.java
 * @Author : Yang TaeIl
 * @date : 2018. 4. 23. 
 * 
 */
public class Test6 {
	public static void main(String args[]) {
		new Test6();
	}
	Test6(){
		Frame f = new Frame("lidy");
		final Label lb1 =new Label();
		lb1.setAlignment(Label.CENTER);
		lb1.setSize(500, 100);
		Button b1= new Button("Select");
		b1.setBounds(200,150,80,30);
		final List list1 = new List(4, false);
		list1.setBounds(100,100,70,70);
		list1.add("Driving");
		list1.add("Singing");
		list1.add("Dancing");
		
		final List list2 = new List(4, true);
		list2.setBounds(100, 200, 70, 70);
		list2.add("Coumputing");
		list2.add("Plumbling");
		list2.add("Wiring");
		list2.add("Drawing");
		
		f.add(list1); f.add(list2); f.add(lb1);	f.add(b1);
		
		f.setSize(450, 450);
		f.setLayout(null);
		f.setVisible(true);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String data= "You Selected " + list1.getItem(list1.getSelectedIndex());
				data+=", Other Selected Skill is ";
				for(String s :list2.getSelectedItems()) {
					data+= s+" ";
				}
				lb1.setText(data);
			}
		});
		}

}
