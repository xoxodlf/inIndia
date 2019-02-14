/**
 * @Summary   : 
 * @Package : webHiber1
 * @FileName : user.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 21.  
 * 
 */
package webHiber1;

/**
 * 
 * @Package : webHiber1
 * @FileName : user.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 21. 
 * 
 */
public class user {
	private int id,salary;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "user [id=" + id + ", salary=" + salary + ", name=" + name + "]";
	}
	
}
