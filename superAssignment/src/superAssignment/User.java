/**
 * @Summary   : 
 * @Package : superAssignment
 * @FileName : User.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 27.  
 * 
 */
package superAssignment;

import java.util.List;

/**
 * 
 * @Package : superAssignment
 * @FileName : User.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 27. 
 * 
 */
public class User {
	private int userNo;
	private String emailId;
	private String userName;
	private String password;
	private String phoneNum;
	private String address;
	private String areaOfExpetise;
	private String q1;
	private String q2;
	private String q3;
	private int status;
	private List<Article> articles;
	
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAreaOfExpetise() {
		return areaOfExpetise;
	}
	public void setAreaOfExpetise(String areaOfExpetise) {
		this.areaOfExpetise = areaOfExpetise;
	}
	public String getQ1() {
		return q1;
	}
	public void setQ1(String q1) {
		this.q1 = q1;
	}
	public String getQ2() {
		return q2;
	}
	public void setQ2(String q2) {
		this.q2 = q2;
	}
	public String getQ3() {
		return q3;
	}
	public void setQ3(String q3) {
		this.q3 = q3;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	public List<Article> getArticles() {
		return articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
	@Override
	public String toString() {
		return "User [userNo=" + userNo + ", emailId=" + emailId + ", userName=" + userName + ", password=" + password
				+ ", phoneNum=" + phoneNum + ", address=" + address + ", areaOfExpetise=" + areaOfExpetise + ", q1="
				+ q1 + ", q2=" + q2 + ", q3=" + q3 + ", status=" + status + ", articles=" + articles + "]";
	}
	
	
	
	
	
}
