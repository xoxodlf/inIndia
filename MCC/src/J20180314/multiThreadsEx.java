/**
 * @Summary   : 
 * @Package : J20180314
 * @FileName : multiThreadsEx.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 14.  
 * 
 */
package J20180314;

/**
 * 
 * @Package : J20180314
 * @FileName : multiThreadsEx.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 14. 
 * 
 */

class Multi extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				//Thread.sleep(500);
				System.out.println(i);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}

class RunnableDemo implements Runnable{
	private String threadName;
	private Thread t;
	RunnableDemo(String name){
		threadName=name;
		System.out.println("Creating "+threadName);
		
	}
	@Override
	public void run() {
		System.out.println("Running "+ threadName);
		for(int i=4;i>0;i--) {
			System.out.println("threadName "+ threadName+", "+i);
			try {
				Thread.sleep(50);
			}catch(Exception e){
				System.out.println(e);
			}
		}
		System.out.println("Exiting "+ threadName);
	}
	
	public void start(){
		System.out.println("Starting "+threadName);
		if(t==null) {
			t=new Thread(this,threadName);
			t.start();
		}
		
	}
}
public class multiThreadsEx {

	public static void main(String[] args) {
		//Multi t1 = new Multi();
		//Multi t2 = new Multi();
		//t1.start();
		//t2.start();
		RunnableDemo r1 = new RunnableDemo("Thread-1");
		r1.start();
		RunnableDemo r2 = new RunnableDemo("Thread-2");
		r2.start();
	}

}
