<%@page import="pj.users"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2> This is Main page</h2>
<% if(session.getAttribute("user")==null){ %>
	
	<h4> No Log-in information</h4>
	<a href="loginForm.jsp">Log-in</a>
	<a href="signupForm.jsp">sign-up</a>
<%}else{ %>
	<h4>USERNO : <%= ((users)session.getAttribute("user")).getUserNo() %></h4>
	<h4>ID : <%= ((users)session.getAttribute("user")).getId() %></h4>
	<h4>PW : <%= ((users)session.getAttribute("user")).getPassword() %></h4>
	<h4>NAME : <%= ((users)session.getAttribute("user")).getName() %></h4>
	<a href="logout.jsp">Log-out</a>
<%}%>
</body>
</html>