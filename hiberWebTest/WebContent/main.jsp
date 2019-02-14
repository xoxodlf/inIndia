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
	
<%}else{ %>
	<h4><a href="eventList.jsp?eventId=1">Go to Event 1</a></h4>
	<h4><a href="eventList.jsp?eventId=2">Go to Event 2</a></h4>
	<h4><a href="eventList.jsp?eventId=3">Go to Event 3</a></h4>
<%}%>
</body>
</html>