/**
 * @Summary   : 
 * @Package : J20180220
 * @FileName : staticEx.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 20.  
 * 
 */
package J20180220;

/**
 * 
 * @Package : J20180220
 * @FileName : staticEx.java
 * @Author : Yang TaeIl
 * @date : 2018. 2. 20. 
 * 
 */
public class staticEx {

	
	public static void main(String[] args) {
		Student s1= new Student();
		s1.showData();
		Student s2= new Student();
		s2.showData();
		Student.b++;
		s1.showData();
	}

}
class Student{
	int a;
	static int b;
	Student(){
		b++;
	}
	public void showData() {
		System.out.println("value of a is "+a );
		System.out.println("value of b is "+b );
	}
	public static void increment() {
		//a++;
	}
}
