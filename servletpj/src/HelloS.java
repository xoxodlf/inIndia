

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloS
 */
@WebServlet("/HelloS")
public class HelloS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private String msg;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloS() {
        super();
        msg="HELLO JAVA SERVLET WORLD";
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<h1>"+msg+"</h1>");
		out.println("<input style='color:red' type='button' value='Hello'/>");
		out.println("<h3>"+msg+"</h3>");
	}

}
