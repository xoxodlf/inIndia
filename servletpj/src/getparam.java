

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class getparam
 */
@WebServlet("/getparam")
public class getparam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getparam() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>Param</title></head>");
		out.println("<body>");
		out.println("<table border='1' align='center'>");
		Enumeration<?> e = request.getParameterNames();
		String pname = null;
		out.println("<th>Param Name</th><th>Param Value</th>");
		while(e.hasMoreElements()) {
			pname=(String)e.nextElement();
			out.println("<tr><td>"+pname+"</td><td>"+request.getParameter(pname)+"</td>");
		}
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}


}
