/**
 * @Summary   : 
 * @Package : d3
 * @FileName : book.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 16.  
 * 
 */
package d3;

import java.util.Date;

/**
 * 
 * @Package : d3
 * @FileName : book.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 16. 
 * 
 */
public class book {
	private int bno;
	private String title;
	private String author;
	private int numberOfBooks;
	private Date publications;
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getNumberOfBooks() {
		return numberOfBooks;
	}
	public void setNumberOfBooks(int numberOfBooks) {
		this.numberOfBooks = numberOfBooks;
	}
	public Date getPublications() {
		return publications;
	}
	public void setPublications(Date publications) {
		this.publications = publications;
	}
	@Override
	public String toString() {
		return "book [bno=" + bno + ", title=" + title + ", author=" + author + ", numberOfBooks=" + numberOfBooks
				+ ", publications=" + publications + "]";
	}
	
}
