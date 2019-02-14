<%@page import="superAssignment.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<center>
<h1>Welcome</h1>
<h3>This is the Taeil's Conference home page</h3>
<%if(session.getAttribute("user")==null){ %>
<h5>If you want to submit your Article please Log-in</h5>
<a href="loginForm.jsp">Click here to login</a>
<a href="signupForm.jsp">Click here to signup</a>
<%}else{ %>
<h5>Hello <%=((User)session.getAttribute("user")).getUserName()%></h5>
<h5>If you want to submit your article <a href="articleForm.jsp">Click Here</a></h5>
<h5>If you want to check your article status <a href="statusView.jsp">Click Here</a></h5>
<%} %>
</center>
</body>
</html>