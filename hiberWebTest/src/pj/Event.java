/**
 * @Summary   : 
 * @Package : pj
 * @FileName : Event.java
 * @Author : Yang TaeIl
 * @date : 2018. 9. 3.  
 * 
 */
package pj;

import java.util.List;

/**
 * 
 * @Package : pj
 * @FileName : Event.java
 * @Author : Yang TaeIl
 * @date : 2018. 9. 3. 
 * 
 */
public class Event {
	private int eventId;
	private String eventName;
	private List<users> urs;
	
	public Event() {
		super();
	}
	
	
	public Event(int eventId, String eventName, List<users> urs) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.urs = urs;
	}


	/**
	 * @return the eventId
	 */
	public int getEventId() {
		return eventId;
	}
	/**
	 * @param eventId the eventId to set
	 */
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	/**
	 * @return the eventName
	 */
	public String getEventName() {
		return eventName;
	}
	/**
	 * @param eventName the eventName to set
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	/**
	 * @return the urs
	 */
	public List<users> getUrs() {
		return urs;
	}
	/**
	 * @param urs the urs to set
	 */
	public void setUrs(List<users> urs) {
		this.urs = urs;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", eventName=" + eventName + ", urs=" + urs + "]";
	}
	
	
	
}
