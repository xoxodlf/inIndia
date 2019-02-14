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
	private String id;
	private String password;
	private String name;
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
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the pw
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param pw the pw to set
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
	@Override
	public String toString() {
		return "users [userNo=" + userNo + ", id=" + id + ", password=" + password + ", name=" + name + "]";
	}
	
}
