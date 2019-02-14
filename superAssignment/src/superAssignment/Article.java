/**
 * @Summary   : 
 * @Package : superAssignment
 * @FileName : Article.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 27.  
 * 
 */
package superAssignment;

import java.util.Date;
import java.util.List;

/**
 * 
 * @Package : superAssignment
 * @FileName : Article.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 27. 
 * 
 */
public class Article {
	private int articleNo;
	private String title;
	private List<Author> authors;
	private String aAbstract;
	private String keyword;
	private String file;
	private Date regdate;
	private String status;
	private int userNo;
	private String fileKey;
	public Article() {}
	
	public Article(String title, List<Author> authors, String aAbstract, String keyword, String file, Date regdate,
			String status, int userNo,String fileKey) {
		super();
		this.title = title;
		this.authors = authors;
		this.aAbstract = aAbstract;
		this.keyword = keyword;
		this.file = file;
		this.regdate = regdate;
		this.status = status;
		this.userNo = userNo;
		this.fileKey = fileKey;
	}
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public int getArticleNo() {
		return articleNo;
	}
	public void setArticleNo(int articleNo) {
		this.articleNo = articleNo;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	public String getaAbstract() {
		return aAbstract;
	}
	public void setaAbstract(String aAbstract) {
		this.aAbstract = aAbstract;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getFileKey() {
		return fileKey;
	}

	public void setFileKey(String fileKey) {
		this.fileKey = fileKey;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Article [articleNo=" + articleNo + ", title=" + title + ", authors=" + authors + ", aAbstract="
				+ aAbstract + ", keyword=" + keyword + ", file=" + file + ", regdate=" + regdate + ", status=" + status
				+ ", userNo=" + userNo + ", fileKey=" + fileKey + "]";
	}

	
	
}
