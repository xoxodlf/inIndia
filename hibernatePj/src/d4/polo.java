/**
 * @Summary   : 
 * @Package : d4
 * @FileName : polo.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 17.  
 * 
 */
package d4;

/**
 * 
 * @Package : d4
 * @FileName : polo.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 17. 
 * 
 */
public class polo {
	private int sno;
	private String name;
	private int sub1;
	private int sub2;
	private int sub3;
	private int total;
	private String grade;
	private String result;
	
	
	public polo() {};
	
	public polo(int sno, String name, int sub1, int sub2, int sub3) {
		super();
		this.sno = sno;
		this.name = name;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.total = sub1+sub2+sub3;
		if(total>=240)
			this.grade="A";
		else if(total>=210)
			this.grade="B";
		else
			this.grade="C";
		if(sub1<40||sub2<40||sub3<40)
			this.result="Fail";
		else this.result="Pass";
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSub1() {
		return sub1;
	}
	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}
	public int getSub2() {
		return sub2;
	}
	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}
	public int getSub3() {
		return sub3;
	}
	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "polo [sno=" + sno + ", name=" + name + ", sub1=" + sub1 + ", sub2=" + sub2 + ", sub3=" + sub3
				+ ", total=" + total + ", grade=" + grade + ", result=" + result + "]";
	}
	
	
	
}
