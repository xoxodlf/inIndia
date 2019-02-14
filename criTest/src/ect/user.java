/**
 * @Summary   : 
 * @Package : ect
 * @FileName : user.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 30.  
 * 
 */
package ect;

/**
 * 
 * @Package : ect
 * @FileName : user.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 30. 
 * 
 */
public class user {
	private String id;
	private String name;
	private String sex;
	private String address;
	private String mStatus;
	private String eduQual;
	
	public user(String id, String name, String sex, String address, String mStatus, String eduQual) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.address = address;
		this.mStatus = mStatus;
		this.eduQual = eduQual;
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
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the mStatus
	 */
	public String getmStatus() {
		return mStatus;
	}
	/**
	 * @param mStatus the mStatus to set
	 */
	public void setmStatus(String mStatus) {
		this.mStatus = mStatus;
	}
	/**
	 * @return the eduQual
	 */
	public String getEduQual() {
		return eduQual;
	}
	/**
	 * @param eduQual the eduQual to set
	 */
	public void setEduQual(String eduQual) {
		this.eduQual = eduQual;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "user [id=" + id + ", name=" + name + ", sex=" + sex + ", address=" + address + ", mStatus=" + mStatus
				+ ", eduQual=" + eduQual + "]";
	}
	
	
}
