<%@page import="java.io.PrintWriter"%>
<%@page import="pj.users"%>
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
	
	users user = usersDAO.login(obj);
	PrintWriter pw = response.getWriter();
	if(user==null){
		pw.println("login fail");
	}else{
		session.setAttribute("user", user);
		pw.println("login success");
	}
	pw.println("<a href=\"main.jsp\">go to main</a>");
%>
</body>
</html>