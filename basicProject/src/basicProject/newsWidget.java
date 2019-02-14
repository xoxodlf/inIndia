/**
 * @Summary   : 
 * @Package : basicProject
 * @FileName : newsWidget.java
 * @Author : Yang TaeIl
 * @date : 2018. 7. 13.  
 * 
 */
package basicProject;

import java.awt.*;
import java.awt.event.*;
import java.net.URI;

import javax.swing.*;

import org.jsoup.select.Elements;

/**
 * 
 * @Package : basicProject
 * @FileName : newsWidget.java
 * @Author : Yang TaeIl
 * @date : 2018. 7. 13.
 * 
 */
public class newsWidget extends JFrame {
	private JFrame frame;
	Point mainFrameLocation = new Point(0, 0);
	Point mouseClickedLocation = new Point(0, 0);
	Elements el;

	newsWidget() {
		frame = this;
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setBounds(screenSize.width - 400, screenSize.height - 600, 400, 600);
		addMouseListener(new MoveMouseAdapter(this));
		addMouseMotionListener(new MoveMouseMotionAdapter(this));
		frame.setUndecorated(true);
		frame.setOpacity(0.8f);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel tabName = new JLabel("News");
		tabName.setFont(tabName.getFont().deriveFont(18.0f));
		tabName.setBounds(10, 0, 400, 20);
		frame.getContentPane().add(tabName);
		JLabel news[] = new JLabel[10];
		
		try {
			
			el = (new basicCrawler().getTitles());
			for (int i = 0; i < 10; i++) {
				news[i] = new JLabel(el.eq(i).text());
				news[i].setFont(news[i].getFont().deriveFont(18.0f));
				news[i].setBounds(10, 30*(i+1)+10, 400, 30);
				frame.getContentPane().add(news[i]);
				news[i].addMouseListener(new LinkMouseListener(el.eq(i).select("a").attr("href")));
			}

		} catch (Exception e1) {
			e1.printStackTrace();
		}
		frame.setVisible(true);
	}

}
