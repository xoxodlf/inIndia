

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HowMany
 */
@WebServlet("/HowMany")
public class HowMany extends HttpServlet {
	private static final long serialVersionUID = 1L;
       int cnt=0;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HowMany() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		cnt++;
		out.println("Since loading, this servlet has been accessed "+ cnt + " times");
		
	}


}
