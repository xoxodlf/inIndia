/**
 * @Summary   : 
 * @Package : basicProject
 * @FileName : MoveMouseMotionAdapter.java
 * @Author : Yang TaeIl
 * @date : 2018. 7. 14.  
 * 
 */
package basicProject;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

/**
 * 
 * @Package : basicProject
 * @FileName : MoveMouseMotionAdapter.java
 * @Author : Yang TaeIl
 * @date : 2018. 7. 14.
 * 
 */
public class MoveMouseMotionAdapter extends MouseMotionAdapter  {
	private newsWidget frame;

	MoveMouseMotionAdapter(newsWidget mainframe) {
		this.frame = mainframe;
	}

	public void mouseMove(MouseEvent e) {
	}

	public void mouseDragged(MouseEvent e) {
		frame.setLocation(e.getLocationOnScreen().x - frame.mouseClickedLocation.x,
				e.getLocationOnScreen().y - frame.mouseClickedLocation.y);
	}

}
