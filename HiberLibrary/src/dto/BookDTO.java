/**
 * @Summary   : 
 * @Package : dto
 * @FileName : BookDTO.java
 * @Author : Yang TaeIl
 * @date : 2018. 9. 12.  
 * 
 */
package dto;

import java.util.List;

/**
 * 
 * @Package : dto
 * @FileName : BookDTO.java
 * @Author : Yang TaeIl
 * @date : 2018. 9. 12. 
 * 
 */
public class BookDTO {
	private int bookNo;
	private String title;
	private String author;
	private boolean isRent;
	private List<ReservationDTO> reservations;
	private List<RentDTO> rents;
	public BookDTO() {}
	
	public BookDTO(int bookNo, String title, String author, boolean isRent, List<ReservationDTO> reservations,
			List<RentDTO> rents) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.isRent = isRent;
		this.reservations = reservations;
		this.rents = rents;
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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the isRent
	 */
	public boolean isRent() {
		return isRent;
	}
	/**
	 * @param isRent the isRent to set
	 */
	public void setRent(boolean isRent) {
		this.isRent = isRent;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BookDTO [bookNo=" + bookNo + ", title=" + title + ", author=" + author + ", isRent=" + isRent
				+ ", reservations=" + reservations + ", rents=" + rents + "]";
	}
	
	
}
