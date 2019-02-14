/**
 * @Summary   : 
 * @Package : dto
 * @FileName : UserDTO.java
 * @Author : Yang TaeIl
 * @date : 2018. 9. 12.  
 * 
 */
package dto;

import java.util.List;

/**
 * 
 * @Package : dto
 * @FileName : UserDTO.java
 * @Author : Yang TaeIl
 * @date : 2018. 9. 12. 
 * 
 */
public class UserDTO {
	private int userNo;
	private String name;
	private String mail;
	private String password;
	private String status;
	private List<ReservationDTO> reservations;
	private List<RentDTO> rents;
	public UserDTO() {}
	
	public UserDTO(int userNo, String name, String mail, String password, String status,
			List<ReservationDTO> reservations, List<RentDTO> rents) {
		super();
		this.userNo = userNo;
		this.name = name;
		this.mail = mail;
		this.password = password;
		this.status = status;
		this.reservations = reservations;
		this.rents = rents;
	}


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
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}
	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
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
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the reservations
	 */
	public List<ReservationDTO> getReservations() {
		return reservations;
	}

	/**
	 * @param reservations the reservations to set
	 */
	public void setReservations(List<ReservationDTO> reservations) {
		this.reservations = reservations;
	}

	/**
	 * @return the rents
	 */
	public List<RentDTO> getRents() {
		return rents;
	}

	/**
	 * @param rents the rents to set
	 */
	public void setRents(List<RentDTO> rents) {
		this.rents = rents;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserDTO [userNo=" + userNo + ", name=" + name + ", mail=" + mail + ", password=" + password
				+ ", status=" + status + ", reservations=" + reservations + ", rents=" + rents + "]";
	}
	
	
	
}
