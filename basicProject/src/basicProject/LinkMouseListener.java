/**
 * @Summary   : 
 * @Package : basicProject
 * @FileName : LinkMoustListener.java
 * @Author : Yang TaeIl
 * @date : 2018. 7. 14.  
 * 
 */
package basicProject;

import java.awt.Desktop;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URI;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * 
 * @Package : basicProject
 * @FileName : LinkMoustListener.java
 * @Author : Yang TaeIl
 * @date : 2018. 7. 14. 
 * 
 */
public class LinkMouseListener implements MouseListener{
	String URL;
	LinkMouseListener(String s){
		this.URL="http://news.naver.com"+s;
	}
	/* (non-Javadoc)
	 * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		if(Desktop.isDesktopSupported()) {
			try {
				Desktop.getDesktop().browse(new URI(URL));
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		}else {
			JOptionPane pane = new JOptionPane("Could not open link.");
            JDialog dialog = pane.createDialog(new JFrame(), "");
            dialog.setVisible(true);
		}
	}

	/* (non-Javadoc)
	 * @see java.awt.event.MouseListener#mouseEntered(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.awt.event.MouseListener#mousePressed(java.awt.event.MouseEvent)
	 */
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.awt.event.MouseListener#mouseReleased(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
