/**
 * @Summary   : 
 * @Package : pj
 * @FileName : users.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 26.  
 * 
 */
package pj;

/**
 * 
 * @Package : pj
 * @FileName : users.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 26. 
 * 
 */
public class users {
	private int userNo;
	private String userId;
	private String password;
	private String name;
	private String eventId;
	/**
	 * @return the userNo
	 */
	public int getUserNo() {
		return userNo;
	}
	/**
	 * @param userNo the userNo to set
	 */
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/**
	 * @return the eventId
	 */
	public String getEventId() {
		return eventId;
	}
	/**
	 * @param eventId the eventId to set
	 */
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "users [userNo=" + userNo + ", userId=" + userId + ", password=" + password + ", name=" + name
				+ ", eventId=" + eventId + "]";
	}
	
	
	
}
