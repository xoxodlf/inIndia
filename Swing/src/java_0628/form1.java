/**
 * @Summary   : 
 * @Package : java_0628
 * @FileName : form1.java
 * @Author : Yang TaeIl
 * @date : 2018. 6. 28.  
 * 
 */
package java_0628;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import org.omg.CORBA.INITIALIZE;
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
public class form1 {
	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	
	public static void main(String args[]) {
		form1 window = new form1();
		window.frame.setVisible(true);
	}
	
	public form1() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100,100,730,489);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tf1 = new JTextField();
		tf1.setBounds(128, 28, 86, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		JLabel lbName = new JLabel("Name");
		lbName.setBounds(65, 31, 46, 14);
		frame.getContentPane().add(lbName);
		
		JLabel lbPhone = new JLabel("Phone#");
		lbPhone.setBounds(65, 68, 46, 14);
		frame.getContentPane().add(lbPhone);
		
		tf2 = new JTextField();
		tf2.setBounds(128, 65, 86, 20);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		JLabel lbEmaliId = new JLabel("Email Id");
		lbEmaliId.setBounds(65, 115, 46, 14);
		frame.getContentPane().add(lbEmaliId);
		
		tf3 = new JTextField();
		tf3.setBounds(128, 112, 247, 17);
		frame.getContentPane().add(tf3);
		tf3.setColumns(10);
		
		JLabel lbAddress = new JLabel("Address");
		lbAddress.setBounds(65, 162, 52, 14);
		frame.getContentPane().add(lbAddress);
		
		final JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(126, 157, 212, 40);
		frame.getContentPane().add(textArea_1);
		
		JButton btnClear= new JButton("Clear");
		
		btnClear.setBounds(312,387,89,23);
		frame.getContentPane().add(btnClear);
		
		JLabel lbSex = new JLabel("Sex");
		lbSex.setBounds(65, 228, 46, 14);
		frame.getContentPane().add(lbSex);
		
		JLabel lbMale = new JLabel("Male");
		lbMale.setBounds(128, 228, 46, 14);
		frame.getContentPane().add(lbMale);
		
		JLabel lbFemale = new JLabel("Female");
		lbFemale.setBounds(292, 228, 46, 14);
		frame.getContentPane().add(lbFemale);
		
		final JRadioButton radioButton = new JRadioButton("");
		radioButton.setBounds(337, 224, 109, 23);
		frame.getContentPane().add(radioButton);
		
		final JRadioButton radioButton_1 = new JRadioButton("");
		radioButton_1.setBounds(162, 224, 109, 23);
		frame.getContentPane().add(radioButton_1);
		
		JLabel lbOccupation = new JLabel("Occupation");
		lbOccupation.setBounds(65, 285, 67, 14);
		frame.getContentPane().add(lbOccupation);
		
		final JComboBox<String> ComboBox = new  JComboBox<String>();
		ComboBox.addItem("Select");
		ComboBox.addItem("Business");
		ComboBox.addItem("Engineer");
		ComboBox.addItem("Doctor");
		ComboBox.addItem("Student");
		ComboBox.addItem("Other");
		
		ComboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		ComboBox.setBounds(180, 285, 91, 20);
		frame.getContentPane().add(ComboBox);
		
		JButton btnSubmit = new JButton("submit");
		
		btnSubmit.setBackground(Color.blue);
		btnSubmit.setForeground(Color.MAGENTA);
		btnSubmit.setBounds(65, 387, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		btnSubmit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(tf1.getText().isEmpty()||tf2.getText().isEmpty()||tf3.getText().isEmpty()||(textArea_1.getText().isEmpty()||radioButton_1.isSelected()&&radioButton.isSelected())||ComboBox.getSelectedItem().equals("Select")) {
					JOptionPane.showMessageDialog(null, "Data Missing");
				}else {
					JOptionPane.showMessageDialog(null, "Data Submitted");
				}
				
			}
		});
		
		btnClear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tf1.setText(null);
				tf2.setText(null);
				tf3.setText(null);
				textArea_1.setText(null);
				radioButton.setSelected(false);
				radioButton_1.setSelected(false);
			}
		});
		
	}
}
