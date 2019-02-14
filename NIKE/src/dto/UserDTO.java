/**
 * @Summary   : 
 * @Package : dto
 * @FileName : UserDTO.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 25.  
 * 
 */
package dto;

/**
 * 
 * @Package : dto
 * @FileName : UserDTO.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 25. 
 * 
 */
public class UserDTO {
	private int userNo;
	private String name;
	private String id;
	private String password;
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserDTO [userNo=" + userNo + ", name=" + name + ", id=" + id + ", password=" + password + "]";
	}
	
	
}
