/**
 * @Summary   : 
 * @Package : com.tb.bms.user.domain
 * @FileName : UserDTO.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 9.  
 * 
 */
package com.tb.bms.user.domain;

/**
 * 
 * @Package : com.tb.bms.user.domain
 * @FileName : UserDTO.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 9. 
 *  유저 관련 객체 선언 및 getter(), setter() 메소드 정의
 */
public class UserDTO {
	private int userNo;
	private String id;
	private String password;
	private String name;
	
	public UserDTO(int userNo,String id,String password, String name){
		this.userNo=userNo;
		this.id=id;
		this.password=password;
		this.name=name;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
