/**
 * @Summary   : 
 * @Package : 
 * @FileName : test.java
 * @Author : Yang TaeIl
 * @date : 2018. 7. 5.  
 * 
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * 
 * @Package : 
 * @FileName : test.java
 * @Author : Yang TaeIl
 * @date : 2018. 7. 5. 
 * 
 */
public class test {
	private JFrame frame;
	private JTextField t1,t2,t3;
	private JTextArea ta1;
	private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	
	test(){
		frame = new JFrame();
		frame.setBounds(0,0,1200,1200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		l1 = new JLabel("Hotel Bill Generation");
		l1.setFont(l1.getFont().deriveFont(70.0f));
		l1.setBounds(250, 0, 800, 100);
		frame.getContentPane().add(l1);
		
		l2 = new JLabel("Costomer Name");
		l2.setFont(l1.getFont().deriveFont(20.0f));
		l2.setBounds(50, 100, 200, 50);
		frame.getContentPane().add(l2);
		
		t1= new JTextField();
		t1.setBounds(280, 100, 200, 50);
		frame.getContentPane().add(t1);
		
		l3 = new JLabel("Mobile No.");
		l3.setFont(l1.getFont().deriveFont(20.0f));
		l3.setBounds(50, 160, 200, 50);
		frame.getContentPane().add(l3);
		
		t2= new JTextField();
		t2.setBounds(280, 160, 200, 50);
		frame.getContentPane().add(t2);
		
		l4 = new JLabel("Course Studied");
		l4.setFont(l1.getFont().deriveFont(20.0f));
		l4.setBounds(50, 220, 200, 50);
		frame.getContentPane().add(l4);
		
		t3= new JTextField("Diploma In Java");
		t3.setBounds(280, 220, 200, 50);
		frame.getContentPane().add(t3);
		
		l5 = new JLabel("Gender");
		l5.setFont(l1.getFont().deriveFont(20.0f));
		l5.setBounds(50, 280, 200, 50);
		frame.getContentPane().add(l5);
		
		final JRadioButton radioButton = new JRadioButton("Female");
		radioButton.setBounds(400, 280, 200, 50);
		frame.getContentPane().add(radioButton);
		
		final JRadioButton radioButton_1 = new JRadioButton("Male");
		radioButton_1.setBounds(280, 280, 120, 50);
		frame.getContentPane().add(radioButton_1);
		
		ButtonGroup bg= new ButtonGroup();
		bg.add(radioButton);
		bg.add(radioButton_1);
		
		l6 = new JLabel("Favorite Food");
		l6.setFont(l1.getFont().deriveFont(20.0f));
		l6.setBounds(50, 340, 200, 50);
		frame.getContentPane().add(l6);
		
		final JCheckBox c1= new JCheckBox("Butter Chicken");
		c1.setBounds(280, 340, 150, 50);
		frame.getContentPane().add(c1);
		
		final JCheckBox c2= new JCheckBox("Butter Naan");
		c2.setBounds(450, 340, 200, 50);
		frame.getContentPane().add(c2);
		
		l7 = new JLabel("Password");
		l7.setFont(l1.getFont().deriveFont(20.0f));
		l7.setBounds(50, 400, 200, 50);
		frame.getContentPane().add(l7);
		
		JPasswordField p1= new JPasswordField();
		p1.setBounds(280, 400, 200, 50);
		frame.getContentPane().add(p1);
		
		l8 = new JLabel("Address");
		l8.setFont(l1.getFont().deriveFont(20.0f));
		l8.setBounds(50, 520, 200, 50);
		frame.getContentPane().add(l8);
		
		ta1= new JTextArea();
		ta1.setBounds(280, 490, 400, 100);
		frame.getContentPane().add(ta1);
		
		l9 = new JLabel("Favorite Color");
		l9.setFont(l1.getFont().deriveFont(20.0f));
		l9.setBounds(50, 610, 200, 50);
		frame.getContentPane().add(l9);
		
		final JComboBox<String> color = new JComboBox<String>();
		color.addItem("red");color.addItem("blue");color.addItem("green");
		color.setBounds(280, 610, 200, 50);
		frame.getContentPane().add(color);
		
		l10 = new JLabel("Favorite Sports");
		l10.setFont(l1.getFont().deriveFont(20.0f));
		l10.setBounds(50, 670, 200, 50);
		frame.getContentPane().add(l10);
		
		final JComboBox<String> sport = new JComboBox<String>();
		sport.addItem("soccer");sport.addItem("basketball");sport.addItem("Football");sport.addItem("PingPong");
		sport.setBounds(280, 670, 200, 50);
		frame.getContentPane().add(sport);
		
		ImageIcon intro = new ImageIcon("C:\\Users\\xoxod\\eclipse-workspace\\Swing\\src\\java_0629\\intro.jpg");
		Image originImg = intro.getImage(); 
		Image changedImg= originImg.getScaledInstance(400, 300, Image.SCALE_SMOOTH );
		ImageIcon Icon = new ImageIcon(changedImg);
		JLabel introimg = new JLabel(Icon);
		introimg.setBounds(700,100,400,300);
		frame.getContentPane().add(introimg);
		
		
		
		JButton submit = new JButton("Submit");
		submit.setBounds(280, 950, 150, 50);
		frame.getContentPane().add(submit);
		submit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
				if(t1.getText().toString().equals("")||t2.getText().toString().equals("")||t3.getText().toString().equals("")||ta1.getText().toString().equals("")||p1.getPassword().length==0||(!radioButton.isSelected()&&!radioButton_1.isSelected())||(!c1.isSelected()&&!c2.isSelected())) {
					String s = "Data Missing";
					JOptionPane.showMessageDialog(frame,s);
				}else {
					String s= "";
					s+="Customer Name : "+t1.getText()+"\n"
							+"Moblie No. : "+t2.getText()+"\n"
							+"Course Studied : "+t3.getText()+"\n";
					if(radioButton.isSelected()) s+="Gender : Female\n";
					else s+="Gender : Male\n";
					s+="Favorite Food :";
					if(c1.isSelected()) s+=" Butter Chicken";
					if(c2.isSelected()) s+=" Butter Naan";
					
					char[] password= p1.getPassword();
					String paw="";
					for(int i=0;i<password.length;i++) {
						paw+=password[i];
					}
					
					s+="\nPassword : "+paw+"\n";
					s+="Address : "+ta1.getText()+"\n";
					s+="Favorite Color : "+color.getSelectedItem().toString()+"\n";
					s+="Favorite Sport : "+sport.getSelectedItem().toString()+"\n";
					
					JOptionPane.showMessageDialog(frame,s);
				}
				
			}
		});
		JButton reset = new JButton("Reset");
		reset.setBounds(440, 950, 150, 50);
		frame.getContentPane().add(reset);
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				t1.setText("");
				t2.setText("");
				t3.setText("");
				p1.setText("");
				ta1.setText("");
				bg.clearSelection();
				c1.setSelected(false);
				c2.setSelected(false);
				sport.setSelectedIndex(0);
				color.setSelectedIndex(0);
			}
		});
		JButton exit = new JButton("Exit");
		exit.setBounds(600, 950, 150, 50);
		frame.getContentPane().add(exit);
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		
	}
	public static void main(String args[]) {
		test window = new test();
		window.frame.setVisible(true);
	}
	

}
