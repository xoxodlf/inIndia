/**
 * @Summary   : 
 * @Package : phonebook
 * @FileName : phoneInfo.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 20.  
 * 
 */
package phonebook;

/**
 * 
 * @Package : phonebook
 * @FileName : phoneInfo.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 20.
 * 
 */
public class contact {
	String name;
	int shortNum;
	String phoneNum;
	String birthDay;
	String relation;

	contact(String name, String phoneNum, String birthDay, String relation, int shortNum) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.birthDay = birthDay;
		this.relation = relation;
		this.shortNum = shortNum;
	}

	contact(String name, String phoneNum) {
		this(name, phoneNum, null, null, -1);
	}

	public contact() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getShortNum() {
		return shortNum;
	}

	public void setShortNum(int shortNum) {
		this.shortNum = shortNum;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

}
