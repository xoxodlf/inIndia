<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="webHiber1.user" %>
<%@ page import="webHiber1.userDao" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="obj" class="webHiber1.user"/>
	<jsp:setProperty property="*" name="obj"/>
	
	<%
		int i=userDao.register(obj);
		PrintWriter out1=response.getWriter();
		if(i>0)
			out1.print("You are successfully registered");
	%>

</body>
</html>