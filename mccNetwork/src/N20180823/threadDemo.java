/**
 * @Summary   : 
 * @Package : N20180823
 * @FileName : threadDemo.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 23.  
 * 
 */
package N20180823;

/**
 * 
 * @Package : N20180823
 * @FileName : threadDemo.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 23. 
 * 
 */
public class threadDemo  implements Runnable{
	
	public void run() {
		try {
			System.out.println("Thread "+Thread.currentThread().getId()+" id running");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		int n=8;
		for(int i=0;i<8;i++) {
			Thread obj = new Thread(new threadDemo());
			obj.start();
		}
	}

}
