

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
import FemPackage.UserDAO;

public class UserControllerServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	 
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
 
        String userName = request.getParameter("userName");
        String password = request.getParameter("password1");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String city = request.getParameter("city");
 
       // HttpSession session = request.getSession(true);
        try {
            UserDAO userDAO = new UserDAO();
            PrintWriter out=response.getWriter();
            out.println( userDAO.addUserDetails(userName, password, email, phone, city));
        } catch (Exception e) {
 
            e.printStackTrace();
        }
 
    }

}
