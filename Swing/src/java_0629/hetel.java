/**
 * @Summary   : 
 * @Package : java_0629
 * @FileName : hetel.java
 * @Author : Yang TaeIl
 * @date : 2018. 6. 29.  
 * 
 */
package java_0629;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.TitledBorder;


/**
 * 
 * @Package : java_0629
 * @FileName : hetel.java
 * @Author : Yang TaeIl
 * @date : 2018. 6. 29. 
 * 
 */
public class hetel extends Frame{
	public static int WIDTH = 1200;
	public static int HEIGHT = 1000;
	public static String TITLE = "Taeil's Hotel";
	
	JTabbedPane tabbedPane = new JTabbedPane();
	JPanel introPanel = new JPanel();
	JPanel appetizerPanel = new JPanel();
	JPanel mainPanel = new JPanel();
	JPanel dessertPanel = new JPanel();
	JPanel[] panels = {introPanel, appetizerPanel, mainPanel, dessertPanel};
	final JComboBox<Integer> cbAp1 = new JComboBox<Integer>();
	final JComboBox<Integer> cbAp2 = new JComboBox<Integer>();
	final JComboBox<Integer> cbAp3 = new JComboBox<Integer>();
	final JComboBox<Integer> cbAp4 = new JComboBox<Integer>();
	final JComboBox<Integer> cbAp5 = new JComboBox<Integer>();
	final JComboBox<Integer> cbMa1 = new JComboBox<Integer>();
	final JComboBox<Integer> cbMa2 = new JComboBox<Integer>();
	final JComboBox<Integer> cbMa3 = new JComboBox<Integer>();
	final JComboBox<Integer> cbMa4 = new JComboBox<Integer>();
	final JComboBox<Integer> cbMa5 = new JComboBox<Integer>();
	final JComboBox<Integer> cbde1 = new JComboBox<Integer>();
	final JComboBox<Integer> cbde2 = new JComboBox<Integer>();
	final JComboBox<Integer> cbde3 = new JComboBox<Integer>();
	final JComboBox<Integer> cbde4 = new JComboBox<Integer>();
	final JComboBox<Integer> cbde5 = new JComboBox<Integer>();
	

	hetel(){
		super(TITLE);
		addWindowListener(new WindowHandler());
		buildGUI();
		setSize(WIDTH, HEIGHT);
		setBackground(Color.DARK_GRAY);
		show();
		JFrame.setDefaultLookAndFeelDecorated(true);
	}
	
	void buildGUI() {
		String[] tabs = {"Intro", "Appetizer", "Main", "Dessert"};
		String[] tabTips = {"Intro taps", "You can choice Appetizer", "You can choice Main dish", "You can choice Dessert"};
		
		for (int i = 0; i < tabs.length; i++) {
			panels[i].setBackground(Color.LIGHT_GRAY);
			panels[i].setBorder(new TitledBorder(tabTips[i]));
			tabbedPane.addTab(tabs[i], null, panels[i], tabTips[i]);
		}
		
		addComponentToTabs();
		add(tabbedPane);
	}
	
	void addComponentToTabs() {
		setupIntroPanel();
		setupAppetizerPanel();
		setupMainPanel();
		setupDessertPanel();
	}
	
	void setupIntroPanel(){
		ImageIcon intro = new ImageIcon("C:\\Users\\xoxod\\eclipse-workspace\\Swing\\src\\java_0629\\intro.jpg");
		Image originImg = intro.getImage(); 
		Image changedImg= originImg.getScaledInstance(1200, 900, Image.SCALE_SMOOTH );
		ImageIcon Icon = new ImageIcon(changedImg);
		JLabel introimg = new JLabel(Icon);
		JLabel wecome = new JLabel("Welcome to Taeil's Hotel");
		wecome.setFont(wecome.getFont().deriveFont(70.0f));
		introPanel.add(wecome,BorderLayout.LINE_START);
		introPanel.add(introimg);
	}
	
	void setupAppetizerPanel() {
		appetizerPanel.setLayout(null);
		ImageIcon[] oIIA = new ImageIcon[5];
		ImageIcon[] cIIA = new ImageIcon[5];
		JLabel[] ap=new JLabel[5];
		JLabel[] lblap=new JLabel[5];
		lblap[0] = new JLabel(" Fish egg and Tofu 120");
		lblap[1] = new JLabel(" Salmon role (2pc) 140");
		lblap[2] = new JLabel(" Boiled Shrimp (2pc) 140");
		lblap[3] = new JLabel(" Beg salad 100");
		lblap[4] = new JLabel(" Beg role(2pc) 100");
		
		cbAp1.setBounds(850, 65, 100, 100);
		cbAp2.setBounds(850, 235, 100, 100);
		cbAp3.setBounds(850, 405, 100, 100);
		cbAp4.setBounds(850, 575, 100, 100);
		cbAp5.setBounds(850, 745, 100, 100);
		appetizerPanel.add(cbAp1);appetizerPanel.add(cbAp2);appetizerPanel.add(cbAp3);appetizerPanel.add(cbAp4);appetizerPanel.add(cbAp5);
		for(int i=0;i<11;i++) {
			cbAp1.addItem(i);
			cbAp2.addItem(i);
			cbAp3.addItem(i);
			cbAp4.addItem(i);
			cbAp5.addItem(i);
		}
		oIIA[0]=new ImageIcon("C:\\Users\\xoxod\\Desktop\\p\\ap\\ap1.jpg");
		oIIA[1]=new ImageIcon("C:\\Users\\xoxod\\Desktop\\p\\ap\\ap2.jpg");
		oIIA[2]=new ImageIcon("C:\\Users\\xoxod\\Desktop\\p\\ap\\ap3.jpg");
		oIIA[3]=new ImageIcon("C:\\Users\\xoxod\\Desktop\\p\\ap\\ap4.jpg");
		oIIA[4]=new ImageIcon("C:\\Users\\xoxod\\Desktop\\p\\ap\\ap5.jpg");
		for(int i=0;i<oIIA.length;i++) {
			Image changedImg= oIIA[i].getImage().getScaledInstance(200, 150, Image.SCALE_SMOOTH );
			cIIA[i] = new ImageIcon(changedImg);
			ap[i]= new JLabel(cIIA[i]);
			ap[i].setBounds(40, 170*i+40, 200, 150);
			lblap[i].setFont(lblap[i].getFont().deriveFont(40.0f));
			lblap[i].setBounds(260, 170*i+40, 550, 150);
			appetizerPanel.add(ap[i]);
			appetizerPanel.add(lblap[i]);
		}
		
		
	}
	
	void setupMainPanel() {
		mainPanel.setLayout(null);
		ImageIcon[] oIIA = new ImageIcon[5];
		ImageIcon[] cIIA = new ImageIcon[5];
		JLabel[] ap=new JLabel[5];
		JLabel[] lblap=new JLabel[5];
		lblap[0] = new JLabel(" Beg Pizza 200");
		lblap[1] = new JLabel(" Olive Pizza 210");
		lblap[2] = new JLabel(" Cheese Pizza 220");
		lblap[3] = new JLabel(" Bulgogi Pizza 230");
		lblap[4] = new JLabel(" Shrimp Pizza 230");
		
		cbMa1.setBounds(850, 65, 100, 100);
		cbMa2.setBounds(850, 235, 100, 100);
		cbMa3.setBounds(850, 405, 100, 100);
		cbMa4.setBounds(850, 575, 100, 100);
		cbMa5.setBounds(850, 745, 100, 100);
		mainPanel.add(cbMa1);mainPanel.add(cbMa2);mainPanel.add(cbMa3);mainPanel.add(cbMa4);mainPanel.add(cbMa5);
		for(int i=0;i<11;i++) {
			cbMa1.addItem(i);
			cbMa2.addItem(i);
			cbMa3.addItem(i);
			cbMa4.addItem(i);
			cbMa5.addItem(i);
		}
		oIIA[0]=new ImageIcon("C:\\Users\\xoxod\\Desktop\\p\\ap\\ma1.jpg");
		oIIA[1]=new ImageIcon("C:\\Users\\xoxod\\Desktop\\p\\ap\\ma2.jpg");
		oIIA[2]=new ImageIcon("C:\\Users\\xoxod\\Desktop\\p\\ap\\ma3.jpg");
		oIIA[3]=new ImageIcon("C:\\Users\\xoxod\\Desktop\\p\\ap\\ma4.jpg");
		oIIA[4]=new ImageIcon("C:\\Users\\xoxod\\Desktop\\p\\ap\\ma5.jpg");
		for(int i=0;i<oIIA.length;i++) {
			Image changedImg= oIIA[i].getImage().getScaledInstance(200, 150, Image.SCALE_SMOOTH );
			cIIA[i] = new ImageIcon(changedImg);
			ap[i]= new JLabel(cIIA[i]);
			ap[i].setBounds(40, 170*i+40, 200, 150);
			lblap[i].setFont(lblap[i].getFont().deriveFont(40.0f));
			lblap[i].setBounds(260, 170*i+40, 550, 150);
			mainPanel.add(ap[i]);
			mainPanel.add(lblap[i]);
		}
	}
	
	void setupDessertPanel() {
		dessertPanel.setLayout(null);
		ImageIcon[] oIIA = new ImageIcon[5];
		ImageIcon[] cIIA = new ImageIcon[5];
		JLabel[] ap=new JLabel[5];
		JLabel[] lblap=new JLabel[5];
		lblap[0] = new JLabel(" Strawberry Special 250");
		lblap[1] = new JLabel(" Strawberry parpait 150");
		lblap[2] = new JLabel(" Strawberry and Cereal 100");
		lblap[3] = new JLabel(" Yogurt 130");
		lblap[4] = new JLabel(" Bread 100");
		
		cbde1.setBounds(850, 65, 100, 100);
		cbde2.setBounds(850, 235, 100, 100);
		cbde3.setBounds(850, 405, 100, 100);
		cbde4.setBounds(850, 575, 100, 100);
		cbde5.setBounds(850, 745, 100, 100);
		dessertPanel.add(cbde1);dessertPanel.add(cbde2);dessertPanel.add(cbde3);dessertPanel.add(cbde4);dessertPanel.add(cbde5);
		for(int i=0;i<11;i++) {
			cbde1.addItem(i);
			cbde2.addItem(i);
			cbde3.addItem(i);
			cbde4.addItem(i);
			cbde5.addItem(i);
		}
		oIIA[0]=new ImageIcon("C:\\Users\\xoxod\\Desktop\\p\\ap\\de1.jpg");
		oIIA[1]=new ImageIcon("C:\\Users\\xoxod\\Desktop\\p\\ap\\de2.jpg");
		oIIA[2]=new ImageIcon("C:\\Users\\xoxod\\Desktop\\p\\ap\\de3.jpg");
		oIIA[3]=new ImageIcon("C:\\Users\\xoxod\\Desktop\\p\\ap\\de4.jpg");
		oIIA[4]=new ImageIcon("C:\\Users\\xoxod\\Desktop\\p\\ap\\de5.jpg");
		for(int i=0;i<oIIA.length;i++) {
			Image changedImg= oIIA[i].getImage().getScaledInstance(200, 150, Image.SCALE_SMOOTH );
			cIIA[i] = new ImageIcon(changedImg);
			ap[i]= new JLabel(cIIA[i]);
			ap[i].setBounds(40, 170*i+40, 200, 150);
			lblap[i].setFont(lblap[i].getFont().deriveFont(40.0f));
			lblap[i].setBounds(260, 170*i+40, 550, 150);
			dessertPanel.add(ap[i]);
			dessertPanel.add(lblap[i]);
		}
		JButton order = new JButton("Order");
		order.setBounds(1000, 575, 100, 100);
		dessertPanel.add(order);
		
		order.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String msg="";
				int amount =0;
				if(cbAp1.getSelectedIndex()!=0) {
					msg+="Fish egg and Tofu 120 * "+cbAp1.getSelectedItem().toString()+" ----> "+120*Integer.valueOf(cbAp1.getSelectedItem().toString())+"\n";
					amount+=120*Integer.valueOf(cbAp1.getSelectedItem().toString());
				}
				if(cbAp2.getSelectedIndex()!=0) {
					msg+="Salmon role (2pc) 140 * "+cbAp2.getSelectedItem().toString()+" ----> "+140*Integer.valueOf(cbAp2.getSelectedItem().toString())+"\n";
					amount+=140*Integer.valueOf(cbAp2.getSelectedItem().toString());
				}
				if(cbAp3.getSelectedIndex()!=0) {
					msg+="Boiled Shrimp (2pc) 140 * "+cbAp3.getSelectedItem().toString()+" ----> "+140*Integer.valueOf(cbAp3.getSelectedItem().toString())+"\n";
					amount+=140*Integer.valueOf(cbAp3.getSelectedItem().toString());
				}
				if(cbAp4.getSelectedIndex()!=0) {
					msg+="Beg salad 100 * "+cbAp4.getSelectedItem().toString()+" ----> "+100*Integer.valueOf(cbAp4.getSelectedItem().toString())+"\n";
					amount+=100*Integer.valueOf(cbAp4.getSelectedItem().toString());
				}
				if(cbAp5.getSelectedIndex()!=0) {
					msg+="Beg role (2pc) 100 * "+cbAp5.getSelectedItem().toString()+" ----> "+100*Integer.valueOf(cbAp5.getSelectedItem().toString())+"\n";
					amount+=100*Integer.valueOf(cbAp5.getSelectedItem().toString());
				}
				if(cbMa1.getSelectedIndex()!=0) {
					msg+="Beg Pizza 200 * "+cbMa1.getSelectedItem().toString()+" ----> "+200*Integer.valueOf(cbMa1.getSelectedItem().toString())+"\n";
					amount+=200*Integer.valueOf(cbMa1.getSelectedItem().toString());
				}
				if(cbMa2.getSelectedIndex()!=0) {
					msg+="Olive Pizza 210 * "+cbMa2.getSelectedItem().toString()+" ----> "+210*Integer.valueOf(cbMa2.getSelectedItem().toString())+"\n";
					amount+=210*Integer.valueOf(cbMa2.getSelectedItem().toString());
				}
				if(cbMa3.getSelectedIndex()!=0) {
					msg+="Cheese Pizza 220 * "+cbMa3.getSelectedItem().toString()+" ----> "+220*Integer.valueOf(cbMa3.getSelectedItem().toString())+"\n";
					amount+=220*Integer.valueOf(cbMa3.getSelectedItem().toString());
				}
				if(cbMa4.getSelectedIndex()!=0) {
					msg+="Bulgogi Pizza 230 * "+cbMa4.getSelectedItem().toString()+" ----> "+230*Integer.valueOf(cbMa4.getSelectedItem().toString())+"\n";
					amount+=230*Integer.valueOf(cbMa4.getSelectedItem().toString());
				}
				if(cbMa5.getSelectedIndex()!=0) {
					msg+="Shrimp Pizza 230 * "+cbMa5.getSelectedItem().toString()+" ----> "+230*Integer.valueOf(cbMa5.getSelectedItem().toString())+"\n";
					amount+=230*Integer.valueOf(cbMa5.getSelectedItem().toString());
				}
				if(cbde1.getSelectedIndex()!=0) {
					msg+="Strawberry Special 250 * "+cbde1.getSelectedItem().toString()+" ----> "+250*Integer.valueOf(cbde1.getSelectedItem().toString())+"\n";
					amount+=250*Integer.valueOf(cbde1.getSelectedItem().toString());
				}
				if(cbde2.getSelectedIndex()!=0) {
					msg+="Strawberry parpait 150 * "+cbde2.getSelectedItem().toString()+" ----> "+150*Integer.valueOf(cbde2.getSelectedItem().toString())+"\n";
					amount+=150*Integer.valueOf(cbde2.getSelectedItem().toString());
				}
				if(cbde3.getSelectedIndex()!=0) {
					msg+="Strawberry and Cereal 100 * "+cbde3.getSelectedItem().toString()+" ----> "+100*Integer.valueOf(cbde3.getSelectedItem().toString())+"\n";
					amount+=100*Integer.valueOf(cbde3.getSelectedItem().toString());
				}
				if(cbde4.getSelectedIndex()!=0) {
					msg+="Yogurt 130 * "+cbde4.getSelectedItem().toString()+" ----> "+130*Integer.valueOf(cbde4.getSelectedItem().toString())+"\n";
					amount+=130*Integer.valueOf(cbde4.getSelectedItem().toString());
				}
				if(cbde5.getSelectedIndex()!=0) {
					msg+="Bread 100 * "+cbde5.getSelectedItem().toString()+" ----> "+100*Integer.valueOf(cbde5.getSelectedItem().toString())+"\n";
					amount+=100*Integer.valueOf(cbde5.getSelectedItem().toString());
				}
				
				msg+="-------------------------------------------\n";
				JOptionPane.showMessageDialog(dessertPanel,msg+"Total: "+amount);
				
			}
		});
		
		JButton exit = new JButton("Exit");
		exit.setBounds(1000, 745, 100, 100);
		dessertPanel.add(exit);
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
	public class WindowHandler extends WindowAdapter {
		public void windowClosing (WindowEvent e) {
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		hetel app = new hetel();
	}
}
