/**
 * @Summary   : 
 * @Package : J20180423
 * @FileName : Test4.java
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
 * @FileName : Test4.java
 * @Author : Yang TaeIl
 * @date : 2018. 4. 23. 
 * 
 */
public class Test4 {
	private Frame mainFrame;
	private Label headerLabel;
	private Label statusLabel;
	private Panel controlPanel;
	
	public Test4() {
		prepareGUI();
		
	}
	
	public static void main(String args[]) {
		Test4 test=new Test4();
		test.showEventDemo();
	}
	
	private void prepareGUI() {
		mainFrame= new Frame("Java");
		mainFrame.setSize(400,400);
		mainFrame.setLayout(new GridLayout(3,1));
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		headerLabel= new Label();
		headerLabel.setAlignment(Label.CENTER);
		statusLabel=new Label();
		statusLabel.setAlignment(Label.CENTER);
		statusLabel.setSize(350,100);
		controlPanel = new Panel();
		controlPanel.setLayout(new FlowLayout());
		
		mainFrame.add(headerLabel);
		mainFrame.add(statusLabel);
		mainFrame.add(controlPanel);
		mainFrame.setVisible(true);
	}
	private void showEventDemo() {
		headerLabel.setText("Control in action:Button");
		
		Button ok = new Button("OK");
		Button submit = new Button("Submit");
		Button cancel = new Button("Cancel");
		
		ok.addActionListener(new ButtonClickListener());
		submit.addActionListener(new ButtonClickListener());
		cancel.addActionListener(new ButtonClickListener());

		controlPanel.add(ok);
		controlPanel.add(submit);
		controlPanel.add(cancel);
		
		mainFrame.setVisible(true);
		
		
	}
	
	private class ButtonClickListener implements ActionListener{

		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			if(command.equals("OK")) {
				statusLabel.setText("OK Clicked");
			}else if(command.equals("Submit")) {
				statusLabel.setText("Submit Clicked");
			}else {
				statusLabel.setText("Cancel Clicked");
			}
			
		}
		
	}
}
