

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class getParameterValuesEx
 */
public class getParameterValuesEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getParameterValuesEx() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		String[] habbits= request.getParameterValues("habits");
		String[] foods= request.getParameterValues("food");
		pw.print("Select values....GET");
		pw.print("<ul>");
		for(int i=0;i<habbits.length;i++) {
			pw.print("<li>"+habbits[i]+"</li>");
		}
		pw.print("</ul>");
		pw.print("Gender : "+request.getParameter("gender")+"</br>");
		pw.print("Favorite Language : "+request.getParameter("language"));
		pw.print("</br>Favorite Foods");
		pw.print("<ul>");
		for(int i=0;i<foods.length;i++) {
			pw.print("<li>"+foods[i]+"</li>");
		}
		pw.print("</ul>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		String[] habbits= request.getParameterValues("habits");
		String[] foods= request.getParameterValues("food");
		pw.print("Select values....POST");
		pw.print("<ul>");
		for(int i=0;i<habbits.length;i++) {
			pw.print("<li>"+habbits[i]+"</li>");
		}
		pw.print("</ul>");
		pw.print("Gender : "+request.getParameter("gender")+"</br>");
		pw.print("Favorite Language : "+request.getParameter("language"));
		pw.print("</br>Favorite Foods");
		pw.print("<ul>");
		for(int i=0;i<foods.length;i++) {
			pw.print("<li>"+foods[i]+"</li>");
		}
		pw.print("</ul>");
	}

}
