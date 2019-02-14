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
	int i=dao.changePassword(((User)session.getAttribute("user")).getUserNo(), request.getParameter("q1"), request.getParameter("q2"), request.getParameter("q3"), request.getParameter("password"));
	if(i>0){
		response.sendRedirect("home.jsp");
	}else{
		out.println("<script>alert('Change fail');history.back();</script>");
	}
%>
</body>
</html>