/**
 * @Summary   : 
 * @Package : superAssignment
 * @FileName : Author.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 27.  
 * 
 */
package superAssignment;

/**
 * 
 * @Package : superAssignment
 * @FileName : Author.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 27. 
 * 
 */
public class Author {
	private int authorNo;
	private String name;
	public Author() {}
	public Author(String name) {
		super();
		this.name = name;
	}
	public int getAuthorNo() {
		return authorNo;
	}
	public void setAuthorNo(int authorNo) {
		this.authorNo = authorNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Author [authorNo=" + authorNo + ", name=" + name + "]";
	}
	
	
	
}
