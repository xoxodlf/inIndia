/**
 * @Summary   : 
 * @Package : basicProject
 * @FileName : MoveMouseAdapter.java
 * @Author : Yang TaeIl
 * @date : 2018. 7. 14.  
 * 
 */
package basicProject;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * 
 * @Package : basicProject
 * @FileName : MoveMouseAdapter.java
 * @Author : Yang TaeIl
 * @date : 2018. 7. 14. 
 * 
 */
public class MoveMouseAdapter extends MouseAdapter{
	 private newsWidget frame;

	 MoveMouseAdapter(newsWidget mainframe) {
	        this.frame = mainframe;
	    }

	    public void mousePressed(MouseEvent e) {
	        frame.mouseClickedLocation.x = e.getX();
	        frame.mouseClickedLocation.y = e.getY();
	    }

	    public void mouseReleased(MouseEvent e) {
	    }

}
