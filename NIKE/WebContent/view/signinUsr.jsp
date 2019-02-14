<%@page import="dto.UserDTO"%>
<%@page import="dto.UserDAO"%>
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
	String id = request.getParameter("uId");
	String pw = request.getParameter("uPw");
	UserDAO dao = new UserDAO();
	UserDTO user = dao.signIn(id, pw);
	System.out.println(user.toString());
	session.setAttribute("user", user);
	response.sendRedirect("index.jsp");
%>
</body>
</html>