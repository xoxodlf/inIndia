/**
 * @Summary   : 
 * @Package : d1
 * @FileName : employee.java
 * @Author : Yang TaeIl
 * @date : 2018. 7. 31.  
 * 
 */
package d1;

/**
 * 
 * @Package : d1
 * @FileName : employee.java
 * @Author : Yang TaeIl
 * @date : 2018. 7. 31. 
 * 
 */
public class employee {
	
	private int id;
	private String firstName,lastName;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return "employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
}
