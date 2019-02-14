<%@page import="superAssignment.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<style>
a {
	margin:10px;
}
</style>
<center style="margin-bottom: 30px;">
	<a href="home.jsp">Home</a>
	<%if(session.getAttribute("user")!=null){%>
	<a href="articleForm.jsp">Submit Article</a>
	<a href="statusView.jsp">View status</a>
	<a href="contactUs.jsp">Contact Us</a>
	<a href="changePassword.jsp">Change Password</a>
	<%if(((User)session.getAttribute("user")).getStatus()==1){%>
	<a href="admin.jsp">Admin</a>
	<%}%>
	<a href="logout.jsp">Log-out</a>
	<%}%>
	
</center>
