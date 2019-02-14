/**
 * @Summary   : 
 * @Package : d5
 * @FileName : RelnStudentCourse.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 18.  
 * 
 */
package d5;

/**
 * 
 * @Package : d5
 * @FileName : RelnStudentCourse.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 18. 
 * 
 */
public class RelnStudentCourse {
	
	private int id;
	private String course;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "RelnStudentCourse [id=" + id + ", course=" + course + "]";
	}
	
}
