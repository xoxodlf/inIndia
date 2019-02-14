/**
 * @Summary   : 
 * @Package : J20180313
 * @FileName : uncaughtExceptionEx.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 13.  
 * 
 */
package J20180313;

/**
 * 
 * @Package : J20180313
 * @FileName : uncaughtExceptionEx.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 13.
 * 
 */
public class uncaughtExceptionEx {
	
	
	static void avg() throws Exception {
		throw new ArithmeticException();
	}
	public static void rere() {
		rere2();
	}

	public static void rere2() {
		rere();
	}

	public static void main(String[] args) {
		int t[] = { 3, 4 };
		int a = 0;
		try {
			try {
				for (int i = 0; i < 3; i++) {
					System.out.println(t[i]);
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}

			int b = 7 / a;
			System.out.println("not excute");
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("finally");
		}
		try {
			avg();
		}catch(Exception e){
			System.out.println(e);
		}finally {
		}
		
		// rere();
	}

}
