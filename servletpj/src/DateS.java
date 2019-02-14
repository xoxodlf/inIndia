

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 * Servlet implementation class DateS
 */
@WebServlet("/DateS")
public class DateS extends HttpServlet implements Runnable {
	private static final long serialVersionUID = 1L;
       long lastprime=0;
       Date lastprimeModified=new Date();
       Thread searcher;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DateS() {
        super();
        
    }
     public void init() throws ServletException{
    	 searcher=new Thread(this);
    	 searcher.setPriority(Thread.MIN_PRIORITY);
    	 searcher.start();
     }
     
     public void run() {
    	 long candidate=1001;
    	 
    	 while(true) {
    		 if(isPrime(candidate)) {
    			 lastprime=candidate;
    			 lastprimeModified=new Date();
    		 }
    		 candidate+=2;
    		 try {
        		 searcher.sleep(200);
        	 }catch(InterruptedException e) {
        		 
        	 }
    	 }
    	
    	 
     }
     
     private boolean isPrime(long n) {
    	 long sqrt=(long)Math.sqrt(n);
    	 for(int i=3;i<sqrt;i+=2) {
    		 if(n%i==0)return false;
    	 }return true;
     }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain");
		PrintWriter pw = response.getWriter();
		if(lastprime==0) pw.println("Steel searching for first prime...");
		else {
			pw.println("The last prime discovered was "+lastprime);
			pw.println(" at "+lastprimeModified);
		}
	}



}
