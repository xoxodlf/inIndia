package java_0622;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JToggleButton;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MultipleControls extends Frame {

	public static int WIDTH = 450;
	public static int HEIGHT = 450;
	public static String TITLE = "Swing Start";
	
	JTabbedPane tabbedPane = new JTabbedPane();
	JPanel buttonPanel = new JPanel();
	JPanel barPanel = new JPanel();
	JPanel listPanel = new JPanel();
	JPanel tablePanel = new JPanel();
	JPanel[] panels = {buttonPanel, barPanel, listPanel, tablePanel};
	
	Icon worldIcon = new ImageIcon("‪‪D:/03.jpg");
	Icon printerIcon = new ImageIcon("D:/03.jpg");
	Icon leafIcon = new ImageIcon("‪‪‪D:/02.jpg");
	Icon leaf2Icon = new ImageIcon("‪‪D:/03.jpg");
	Icon leaf3Icon = new ImageIcon("D:/04.jpg");
	Icon[] leaves = {leafIcon, leaf2Icon, leaf3Icon};
	
	JButton printerButton = new JButton("Print", printerIcon);
	JToggleButton worldButton = new JToggleButton("Connect", worldIcon, true);
	
	JList<Icon> leafList = new JList<Icon>(leaves);
	
	JSlider slider = new JSlider(JSlider.VERTICAL, 0, 100, 60);
	
	JProgressBar progressBar = new JProgressBar();
	
	String[] columns = {"Product ID", "Description", "Price"};
	Object[][] cells = {columns, {"zvga-1234", "Video Card", "$550"}, {"56m-11", "56K Modem", "$315"}, {"dc-10", "Net Card", "$499"}};
	JTable table = new JTable(cells, columns);
	
	public MultipleControls() {
		super(TITLE);
		addWindowListener(new WindowHandler());
		buildGUI();
		setSize(WIDTH, HEIGHT);
		setBackground(Color.DARK_GRAY);
		show();
	}
	
	void buildGUI() {
		String[] tabs = {"Buttons", "Bars", "Lists", "Table"};
		String[] tabTips = {"A Button and a Toggle Button", "A Slider and a Progress Bar", "An Icon List", "A Cost Table"};
		
		for (int i = 0; i < tabs.length; i++) {
			panels[i].setBackground(Color.LIGHT_GRAY);
			panels[i].setBorder(new TitledBorder(tabTips[i]));
			tabbedPane.addTab(tabs[i], null, panels[i], tabTips[i]);
		}
		
		addComponentToTabs();
		add("Center", tabbedPane);
	}
	
	void addComponentToTabs() {
		setupButtonPanel();
		setupBarPanel();
		setupListPanel();
		setupTablePanel();
	}
	
	void setupButtonPanel() {
		printerButton.setBackground(Color.WHITE);
		worldButton.setBackground(Color.WHITE);
		buttonPanel.add(printerButton);
		buttonPanel.add(worldButton);
	}
	
	void setupBarPanel() {
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(5);
		slider.setPaintTicks(true);
		slider.addChangeListener(new SliderHandler());
		
		progressBar.setOrientation(JProgressBar.HORIZONTAL);
		progressBar.setMinimum(0);
		progressBar.setMaximum(100);
		progressBar.setValue(60);
		progressBar.setBorderPainted(true);
		
		barPanel.add(new JLabel("Slider"));
		barPanel.add(slider);
		barPanel.add(new JLabel("Progress Bar"));
		barPanel.add(progressBar);
	}
	
	void setupListPanel() {
		leafList.setFixedCellHeight(123);
		listPanel.add(leafList);
	}
	
	void setupTablePanel() {
		tablePanel.add(table);
	}
	
	public static void main(String[] args) {
		MultipleControls app = new MultipleControls();
	}
	
	public class WindowHandler extends WindowAdapter {
		public void windowClosing (WindowEvent e) {
			System.exit(0);
		}
	}
	
	public class SliderHandler implements ChangeListener {
		public void stateChanged (ChangeEvent e) {
			progressBar.setValue(slider.getValue());
		}
	}
}
