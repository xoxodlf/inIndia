/**
 * @Summary   : 
 * @Package : d5
 * @FileName : RelnStudent.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 18.  
 * 
 */
package d5;

import java.util.List;

/**
 * 
 * @Package : d5
 * @FileName : RelnStudent.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 18. 
 * 
 */
public class RelnStudent {
	
	private int id;
	private String name;
	private List<RelnStudentCourse> student;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<RelnStudentCourse> getStudent() {
		return student;
	}
	public void setStudent(List<RelnStudentCourse> student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "RelnStudent [id=" + id + ", name=" + name + ", student=" + student + "]";
	}
	
}
