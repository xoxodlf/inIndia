<%@page import="dto.UserDAO"%>
<%@page import="dto.UserDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<% 
	UserDTO user = new UserDTO();
	user.setId((String)request.getParameter("uId"));
	user.setPassword((String)request.getParameter("uPw"));
	user.setName((String)request.getParameter("uName"));
	UserDAO dao = new UserDAO();
	dao.insertUser(user);
	
	request.setAttribute("msg", "Sign-up Success");
	RequestDispatcher rd = request.getRequestDispatcher("signin.jsp");
	rd.forward(request, response);
%>
</body>
</html>