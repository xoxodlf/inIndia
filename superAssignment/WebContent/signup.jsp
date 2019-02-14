<%@page import="superAssignment.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="resource/js/jquery-3.2.1.min.js"></script>
</head>
<body>
	<jsp:useBean id="obj" class="superAssignment.User" />
	<jsp:setProperty property="*" name="obj" />
	<%
		UserDAO dao = new UserDAO();
		int i = dao.signup(obj);
		if (i > 0) {
			request.setAttribute("msg", "Sign-up Success");
			RequestDispatcher rd = request.getRequestDispatcher("loginForm.jsp");
			rd.forward(request, response);
		} else {
			out.println("<script>alert('Error : Duplicate Email ID');history.back();</script>");
		}
	%>
</body>
<script type="text/javascript">
	
</script>
</html>