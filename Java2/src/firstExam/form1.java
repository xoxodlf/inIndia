/**
 * @Summary   : 
 * @Package : firstExam
 * @FileName : form1.java
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
 * @FileName : form1.java
 * @Author : Yang TaeIl
 * @date : 2018. 4. 24. 
 * 
 */
public class form1 {
	Frame f= new Frame();
	Label l1=new Label("Personal Information");
	Label l2=new Label("First Name:");
	Label l3=new Label("Last Name:");
	Label l4=new Label("Date of Birth");
	Label l5=new Label("Gender");
	Label l6=new Label("Account Information");
	Label l7=new Label("Email");
	Label l8=new Label("Re-type Email");
	Label l9=new Label("Password");
	Label l10=new Label("Re-type Password");
	Label l11=new Label("Security Question");
	Label l12=new Label("Security Answer");
	Label l13=new Label("Contact Information");
	Label l14=new Label("Address");
	Label l15=new Label("City");
	Label l16=new Label("State");
	Label l17=new Label("Zip code");
	Label l18=new Label("Phone");
	Label l19=new Label("");
	Label result[];
	TextField t[]=new TextField[12];
	final Choice Year=new Choice();
	final Choice Month=new Choice();
	final Choice Date=new Choice();
	final Choice Question=new Choice();
	final Choice State=new Choice();
	final Choice Mobile=new Choice();
	Checkbox c1,c2;
	Button bt = new Button("Submit");
	CheckboxGroup cbg = new CheckboxGroup();
	form1(){
		result=new Label[11];
		l1.setBounds(50, 100, 190, 50);
		l2.setBounds(100, 160, 100, 30);
		l3.setBounds(100, 200, 100, 30);
		l4.setBounds(100, 240, 100, 30);
		l5.setBounds(100, 280, 100, 30);
		l6.setBounds(50, 340, 190, 50);
		l7.setBounds(100, 400, 100, 30);
		l8.setBounds(100, 440, 100, 30);
		l9.setBounds(100, 480, 100, 30);
		l10.setBounds(100, 520, 150, 30);
		l11.setBounds(100, 560, 100, 30);
		l12.setBounds(100, 600, 100, 30);
		l13.setBounds(50, 660, 190, 50);
		l14.setBounds(100, 700, 100, 30);
		l15.setBounds(100, 740, 100, 30);
		l16.setBounds(100, 780, 100, 30);
		l17.setBounds(100, 820, 100, 30);
		l18.setBounds(100, 860, 100, 30);
		
		c1 = new Checkbox("Male",cbg,false);
		c2 = new Checkbox("Female",cbg,false);
		c1.setBounds(260, 280, 60, 25);
		c2.setBounds(320, 280, 60, 25);
		f.add(c1);f.add(c2);f.add(l19);
		Year.setBounds(400, 240, 60, 25);
		Year.add("2001");
		Year.add("2002");
		Year.add("2003");
		Year.add("2004");
		Year.add("2005");
		Year.add("2006");
		Year.add("2007");
		Year.add("2008");
		Year.add("2009");
		Year.add("2010");
		Year.add("2011");
		Year.add("2012");
		f.add(Year);
		Month.setBounds(260, 240, 60, 25);
		Month.add("01");
		Month.add("02");
		Month.add("03");
		Month.add("04");
		Month.add("05");
		Month.add("06");
		Month.add("07");
		Month.add("08");
		Month.add("09");
		Month.add("10");
		Month.add("11");
		Month.add("12");
		f.add(Month);
		Date.setBounds(330, 240, 60, 25);
		Date.add("01");
		Date.add("02");
		Date.add("03");
		Date.add("04");
		Date.add("05");
		Date.add("06");
		Date.add("07");
		Date.add("08");
		Date.add("09");
		Date.add("10");
		Date.add("11");
		Date.add("12");
		Date.add("13");
		Date.add("14");
		Date.add("15");
		Date.add("16");
		Date.add("17");
		Date.add("18");
		Date.add("19");
		Date.add("20");
		Date.add("21");
		Date.add("22");
		Date.add("23");
		Date.add("24");
		Date.add("25");
		Date.add("26");
		Date.add("27");
		Date.add("28");
		Date.add("29");
		Date.add("30");
		Date.add("31");
		f.add(Date);
		Question.setBounds(260, 560, 250, 25);
		Question.add("Choose a security question");
		Question.add("Where are you born?");
		Question.add("Where are you live?");
		f.add(Question);
		State.setBounds(260, 780, 250, 25);
		State.add("Chennai");
		State.add("Seoul");
		f.add(State);
		Mobile.setBounds(450, 860, 150, 25);
		Mobile.add("Moblie");
		Mobile.add("No Mobile");
		f.add(Mobile);
		for(int i=0;i<t.length;i++) {
			t[i]=new TextField("");
		}
		t[0].setBounds(260, 160, 250, 25);
		t[1].setBounds(260, 200, 250, 25);
		//100, 400, 100, 30
		t[2].setBounds(260, 400, 250, 25);
		t[3].setBounds(260, 440, 250, 25);
		t[4].setBounds(260, 480, 250, 25);
		t[5].setBounds(260, 520, 250, 25);
		t[6].setBounds(260, 600, 250, 25);
		//100, 700, 100, 30
		t[7].setBounds(260, 700, 250, 25);
		t[8].setBounds(260, 740, 250, 25);
		t[9].setBounds(260, 820, 70, 25);
		t[10].setBounds(340, 820, 70, 25);
		t[11].setBounds(260, 860, 150, 25);
		bt.setBounds(260, 890, 50, 25);
		bt.addActionListener(new ButtonClickListener());
		for(int i=0;i<t.length;i++) {
			f.add(t[i]);
		}
		int t=30;
		for(int i=0; i<result.length;i++) {
			result[i]=new Label();
			result[i].setBounds(700, 200+t, 200, 25);
			t=t+30;
			f.add(result[i]);
		}
		f.add(bt);
		f.add(l1);f.add(l2);f.add(l3);f.add(l4);f.add(l5);f.add(l6);f.add(l7);f.add(l8);f.add(l9);
		f.add(l10);f.add(l11);f.add(l13);f.add(l14);f.add(l15);f.add(l16);f.add(l17);f.add(l18);f.add(l12);
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(1300, 1300);
	}
	
	private class ButtonClickListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			result[0].setText("Name : "+t[0].getText()+" "+t[1].getText());
			result[1].setText("\nBirthDay : "+ Month.getSelectedItem()+"/"+Date.getSelectedItem()+"/"+Year.getSelectedItem());
			result[2].setText("\nGender : "+cbg.getSelectedCheckbox().getLabel());
			result[3].setText("\nEmail : "+t[2].getText());
			result[4].setText("\nPassword : "+t[4].getText());
			result[5].setText("\nQuestion : "+Question.getSelectedItem());
			result[6].setText("\nAddress : "+t[7].getText());
			result[7].setText("\nCity : "+t[8].getText());
			result[8].setText("\nState : "+State.getSelectedItem());
			result[9].setText("\nZip code : "+t[9].getText()+" "+t[10].getText());
			result[10].setText("\nPhone : "+t[11].getText()+" "+Mobile.getSelectedItem());
		}
		
	}
	
	public static void main(String args[]) {
		new form1();
	}
	
}
