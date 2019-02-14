
package java_0628;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * 
 * @Package : java_0628
 * @FileName : form1.java
 * @Author : Yang TaeIl
 * @date : 2018. 6. 28. 
 * 
 * 
 * 
 */
public class Registration {
	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3,tf4;
	
	public static void main(String args[]) {
		Registration window = new Registration();
		window.frame.setVisible(true);
	}
	
	public Registration() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100,100,730,489);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tf1 = new JTextField();
		tf1.setBounds(160, 28, 86, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		JLabel lbName = new JLabel("Name");
		lbName.setBounds(65, 31, 46, 14);
		frame.getContentPane().add(lbName);
		
		JLabel lbFName = new JLabel("Father's Name");
		lbFName.setBounds(65, 68, 100, 14);
		frame.getContentPane().add(lbFName);
		
		tf2 = new JTextField();
		tf2.setBounds(160, 65, 86, 20);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		JLabel lbGender = new JLabel("Gender");
		lbGender.setBounds(65, 115, 46, 14);
		frame.getContentPane().add(lbGender);
		

		
		final JRadioButton radioButton = new JRadioButton("Female");
		radioButton.setBounds(337, 115, 109, 23);
		frame.getContentPane().add(radioButton);
		
		final JRadioButton radioButton_1 = new JRadioButton("Male");
		radioButton_1.setBounds(162, 115, 109, 23);
		frame.getContentPane().add(radioButton_1);
		
		ButtonGroup bg= new ButtonGroup();
		bg.add(radioButton);
		bg.add(radioButton_1);
		
		JLabel lbBirth = new JLabel("Day of Birth");
		lbBirth.setBounds(65, 160, 80, 14);
		frame.getContentPane().add(lbBirth);
		String[] dayA = {"day","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		final JComboBox<String> day = new  JComboBox<String>();
		for(int i=0;i<dayA.length;i++) {
			day.addItem(dayA[i]);
		}
		
		day.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		day.setBounds(150, 158, 50, 20);
		frame.getContentPane().add(day);
		String[] monthA= {"mon","Jan","Feb","March","April","May","Jun","July","Aug","Sep","Oct","Nov","Dec"};
		final JComboBox<String> month = new  JComboBox<String>();
		for(int i=0;i<monthA.length;i++) {
			month.addItem(monthA[i]);
		}
		
		month.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		month.setBounds(200, 158, 60, 20);
		frame.getContentPane().add(month);
		String[] yearA= new String[70];
		final JComboBox<String> year = new  JComboBox<String>();
		yearA[0]="year";
		year.addItem("year");
		int j=1;
		for(int i=1950;i<2019;i++) {
			
			yearA[j++]=i+"";
			year.addItem(i+"");
		}
		
		
		
		year.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		year.setBounds(270, 158, 60, 20);
		frame.getContentPane().add(year);
		
		
		
		JLabel lbAddress = new JLabel("Address");
		lbAddress.setBounds(65, 200, 52, 14);
		frame.getContentPane().add(lbAddress);
		
		final JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(160, 195, 212, 40);
		frame.getContentPane().add(textArea_1);
		
		
		JLabel lbPhone = new JLabel("Phone Num");
		lbPhone.setBounds(65, 250, 80, 14);
		frame.getContentPane().add(lbPhone);
		
		tf3 = new JTextField();
		tf3.setBounds(160, 250, 247, 20);
		frame.getContentPane().add(tf3);
		tf3.setColumns(10);
		JLabel lbEmail = new JLabel("Email");
		lbEmail.setBounds(65, 290, 80, 14);
		frame.getContentPane().add(lbEmail);
		
		tf4 = new JTextField();
		tf4.setBounds(160, 290, 247, 20);
		frame.getContentPane().add(tf4);
		tf4.setColumns(10);
		

		
		
		JButton btnClear= new JButton("Clear");
		
		btnClear.setBounds(312,387,89,23);
		frame.getContentPane().add(btnClear);
		
		JCheckBox ck = new JCheckBox("I accept the terms and conditions");
		ck.setBounds(65, 340, 250, 15);
		frame.getContentPane().add(ck);
		
		JTextArea result = new JTextArea();
		result.setBounds(450, 20, 240, 400);
		frame.getContentPane().add(result);
		
		JButton btnSubmit = new JButton("submit");
		
		btnSubmit.setBackground(Color.blue);
		btnSubmit.setForeground(Color.MAGENTA);
		btnSubmit.setBounds(65, 387, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		btnSubmit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(year.getSelectedItem().toString().equals("year")||day.getSelectedItem().toString().equals("day")||month.getSelectedItem().toString().equals("mon")||tf1.getText().isEmpty()||tf2.getText().isEmpty()||tf3.getText().isEmpty()||tf4.getText().isEmpty()||(textArea_1.getText().isEmpty()||!ck.isSelected()||!radioButton_1.isSelected()&&!radioButton.isSelected())) {
					JOptionPane.showMessageDialog(null, "Data Missing");
				}else {
					JOptionPane.showMessageDialog(null, "Data Submitted");
					String msg="";
					msg+="Name : "+tf1.getText()+"\n"+
						"Father's Name : "+tf2.getText()+"\n";
					if(radioButton_1.isSelected())
						msg+="Gender : Male\n";
					else if(radioButton.isSelected()) {
						msg+="Gender : Female\n";
					}
					msg+="Birthday : "+day.getSelectedItem().toString()+"/"+month.getSelectedItem().toString()+"/"+year.getSelectedItem().toString()+"\n"+
							"Address : "+textArea_1.getText()+"\n"+
							"Phone Num : "+tf3.getText()+"\n"+
							"Email : "+tf4.getText();
					result.setText(msg);
				}
				
			}
		});
		
		btnClear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tf1.setText(null);
				tf2.setText(null);
				tf3.setText(null);
				tf4.setText(null);
				result.setText(null);
				ck.setSelected(false);
				textArea_1.setText(null);
				bg.clearSelection();
				day.setSelectedIndex(0);
				year.setSelectedIndex(0);
				month.setSelectedIndex(0);
			}
		});
		
		JButton bntExit = new JButton("Exit");
		bntExit.setBackground(Color.red);
		bntExit.setForeground(Color.white);
		bntExit.setBounds(195, 387, 89, 23);
		frame.getContentPane().add(bntExit);
		
		bntExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				
			}
		});
	}
}
