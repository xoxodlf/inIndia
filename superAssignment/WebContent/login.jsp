<%@page import="superAssignment.User"%>
<%@page import="superAssignment.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	UserDAO dao = new UserDAO();
	User user = dao.login((String)request.getParameter("emailId"),(String)request.getParameter("password"));
	if(user==null){
		out.println("<script>alert('Log-in fail');history.back();</script>");

	}else{
		session.setAttribute("user", user);
		response.sendRedirect("home.jsp");
	}
	
	
%>
</body>
</html>