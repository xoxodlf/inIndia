<%@page import="java.io.PrintWriter"%>
<%@page import="pj.usersDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="obj" class="pj.users"/>
	<jsp:setProperty property="*" name="obj"/>
	<%
		int i=usersDAO.register(obj);
		PrintWriter out1=response.getWriter();
		if(i>0)
			response.sendRedirect("loginForm.jsp");
		else
			out1.print("Fail");
	%>>
</body>
</html>