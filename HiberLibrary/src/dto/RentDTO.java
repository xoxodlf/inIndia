/**
 * @Summary   : 
 * @Package : dto
 * @FileName : RentDTO.java
 * @Author : Yang TaeIl
 * @date : 2018. 9. 12.  
 * 
 */
package dto;

import java.util.Date;

/**
 * 
 * @Package : dto
 * @FileName : RentDTO.java
 * @Author : Yang TaeIl
 * @date : 2018. 9. 12. 
 * 
 */
public class RentDTO {
	private int rtNo;
	private int bookNo;
	private int userNo;
	private Date rentDate;
	private Date returnDate;
	
	public RentDTO() {}

	public RentDTO(int rtNo, int bookNo, int userNo, Date rentDate, Date returnDate) {
		super();
		this.rtNo = rtNo;
		this.bookNo = bookNo;
		this.userNo = userNo;
		this.rentDate = rentDate;
		this.returnDate = returnDate;
	}

	/**
	 * @return the rtNo
	 */
	public int getRtNo() {
		return rtNo;
	}

	/**
	 * @param rtNo the rtNo to set
	 */
	public void setRtNo(int rtNo) {
		this.rtNo = rtNo;
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
	 * @return the rentDate
	 */
	public Date getRentDate() {
		return rentDate;
	}

	/**
	 * @param rentDate the rentDate to set
	 */
	public void setRentDate(Date rentDate) {
		this.rentDate = rentDate;
	}

	/**
	 * @return the returnDate
	 */
	public Date getReturnDate() {
		return returnDate;
	}

	/**
	 * @param returnDate the returnDate to set
	 */
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RentDTO [rtNo=" + rtNo + ", bookNo=" + bookNo + ", userNo=" + userNo + ", rentDate=" + rentDate
				+ ", returnDate=" + returnDate + "]";
	}
	
}
