/**
 * @Summary   : 
 * @Package : dto
 * @FileName : ReservationDTO.java
 * @Author : Yang TaeIl
 * @date : 2018. 9. 12.  
 * 
 */
package dto;

import java.util.Date;

/**
 * 
 * @Package : dto
 * @FileName : ReservationDTO.java
 * @Author : Yang TaeIl
 * @date : 2018. 9. 12. 
 * 
 */
public class ReservationDTO {
	private int rNo;
	private int bookNo;
	private int userNo;
	private Date reservationDate;
	
	public ReservationDTO() {}

	public ReservationDTO(int rNo, int bookNo, int userNo, Date reservationDate) {
		super();
		this.rNo = rNo;
		this.bookNo = bookNo;
		this.userNo = userNo;
		this.reservationDate = reservationDate;
	}

	/**
	 * @return the rNo
	 */
	public int getrNo() {
		return rNo;
	}

	/**
	 * @param rNo the rNo to set
	 */
	public void setrNo(int rNo) {
		this.rNo = rNo;
	}

	/**
	 * @return the bookNo
	 */
	public int getBookNo() {
		return bookNo;
	}

	/**
	 * @param bookNo the bookNo to set
	 */
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
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
	 * @return the reservationDate
	 */
	public Date getReservationDate() {
		return reservationDate;
	}

	/**
	 * @param reservationDate the reservationDate to set
	 */
	public void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ReservationDTO [rNo=" + rNo + ", bookNo=" + bookNo + ", userNo=" + userNo + ", reservationDate="
				+ reservationDate + "]";
	}
	
	
}
