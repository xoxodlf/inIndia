import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import FemPackage.UserDAO;

/**
 * Servlet implementation class handle
 */
public class handle extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public handle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
        String userName = request.getParameter("userName");
        String password = request.getParameter("password1");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String city = request.getParameter("city");
 
       // HttpSession session = request.getSession(true);
        try {
            UserDAO userDAO = new UserDAO();
            userDAO.addUserDetails(userName, password, email, phone, city);
            //response.sendRedirect("Success");
            out.println("success");
        } catch (Exception e) {
 
            e.printStackTrace();
        }
	}

}
