/**
 * @Summary   : 
 * @Package : N20180823
 * @FileName : fourThread.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 23.  
 * 
 */
package N20180823;

/**
 * 
 * @Package : N20180823
 * @FileName : fourThread.java
 * @Author : Yang TaeIl
 * @date : 2018. 8. 23. 
 * 
 */
public class fourThread extends Thread{
	String name;
	int time;
	public fourThread(String name, int time) {
		this.name=name;
		this.time=time;
	}
	
	public void run() {
		System.out.println(name+" Thread is start");
		for(int i=0;i<5;i++) {
			if(time==0) break;
			try {
				System.out.println(name+" Thread is running");
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name+" Thread is finished");
	}
	
	public static void main(String[] args) throws Exception {
		
		fourThread t1= new fourThread("Main Thread", 0);
		fourThread t2= new fourThread("First Thread", 100);
		fourThread t3= new fourThread("Second Thread", 50);
		fourThread t4= new fourThread("Third Thread", 150);
		t1.start();
		Thread.sleep(100);
		t2.start();
		t3.start();
		t4.start();
		
	}
	
}
