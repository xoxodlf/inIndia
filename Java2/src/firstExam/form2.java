/**
 * @Summary   : 
 * @Package : firstExam
 * @FileName : form2.java
 * @Author : Yang TaeIl
 * @date : 2018. 4. 24.  
 * 
 */
package firstExam;

import java.awt.*;
import java.awt.event.*;
/**
 * 
 * @Package : firstExam
 * @FileName : form2.java
 * @Author : Yang TaeIl
 * @date : 2018. 4. 24. 
 * 
 */
public class form2 {
	Frame f= new Frame();
	Label l1=new Label("Select Room No");
	Label l2=new Label("Room No  : ");
	Label l3=new Label("101");
	Label l4=new Label("");
	Label l5=new Label("Guest 1");
	Label l6=new Label("Guest 2");
	Label l7=new Label("Guest 3");
	Label l8=new Label("Guest 4");
	Label l9=new Label("Guest 5");
	Label l10=new Label("Identity Proof Type");
	Label l11=new Label("Booking Date 2018-04-24 - 10/16/2018");
	Label l12=new Label("Other Facilities");
	Label l13=new Label("Quantity");
	Label l14=new Label("Amount");
	Label l15=new Label("Bed Tea");
	Label l16=new Label("Lunch");
	Label l17=new Label("Dinner");
	Label l18=new Label("Rs.50");
	Label l19=new Label("Rs.120");
	Label l20=new Label("Rs.150");
	Label l21=new Label("Total Amount");
	Label l22=new Label("Comment");
	TextArea ta=new TextArea();
	TextField t[]=new TextField[9];
	Button submit=new Button("Submit");
	final Choice RoomNo=new Choice();
	form2(){
		for(int i=0;i<t.length;i++) {
			t[i]=new TextField("");
		}
		RoomNo.setBounds(180, 50, 50, 25);
		RoomNo.add("101");
		RoomNo.add("102");
		RoomNo.add("103");
		RoomNo.add("104");
		RoomNo.add("105");
		RoomNo.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				l3.setText(RoomNo.getSelectedItem());
			}
		});
		f.add(RoomNo);
		l1.setBounds(50, 50, 100, 25);
		l2.setBounds(50, 100, 100, 25);
		l3.setBounds(160, 100, 50, 25);
		//guest
		l5.setBounds(80, 160, 100, 25);
		t[0].setBounds(190, 160, 250, 25);
		l7.setBounds(80, 200, 100, 25);
		t[1].setBounds(190, 200, 250, 25);
		l9.setBounds(80, 240, 100, 25);
		t[2].setBounds(190, 240, 250, 25);
		
		
		l6.setBounds(450, 160, 100, 25);
		t[3].setBounds(560, 160, 250, 25);
		
		l8.setBounds(450, 200, 100, 25);
		t[4].setBounds(560, 200, 250, 25);
		
		l10.setBounds(450, 240, 100, 25);
		t[5].setBounds(560, 240, 250, 25);
		
		l11.setBounds(450, 300, 250, 25);
		l11.setForeground(Color.red);
		
		
		l12.setBounds(120, 320, 100, 25);
		l13.setBounds(400, 320, 100, 25);
		l14.setBounds(680, 320, 100, 25);
		
		
		l15.setBounds(120, 350, 100, 25);
		t[6].setBounds(380,350,100,25);
		l18.setBounds(680, 350, 100, 25);
		l16.setBounds(120, 380, 100, 25);
		t[7].setBounds(380,380,100,25);
		l19.setBounds(680, 380, 100, 25);
		l17.setBounds(120, 410, 100, 25);
		t[8].setBounds(380,410,100,25);
		l20.setBounds(680, 410, 100, 25);
		
		l21.setBounds(400, 440, 100, 25);
		l4.setBounds(550, 440, 100, 25);
		l22.setBounds(80, 500, 100, 25);
		ta.setBounds(200, 500, 150, 75);
		submit.setBounds(580, 550, 100, 25);
		submit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int TQ=Integer.parseInt(t[6].getText());
				int LQ=Integer.parseInt(t[7].getText());
				int DQ=Integer.parseInt(t[8].getText());
				
				l4.setText(String.valueOf(TQ*50+LQ*120+DQ*150));
			}
		});
		f.add(l1);f.add(l2);f.add(l3);f.add(l4);f.add(l5);f.add(l7);f.add(l9);
		f.add(l6);f.add(l8);f.add(l10);f.add(l11);f.add(l12);f.add(l13);f.add(l14);f.add(l15);f.add(l16);f.add(l17);f.add(l18);f.add(l19);f.add(l20);f.add(l21);f.add(l22);
		f.add(ta);f.add(submit);
		for(int i=0;i<t.length;i++) {
			f.add(t[i]);
		}
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(1000, 700);
	}
	
	public static void main(String args[]) {
		new form2();
	}
}
