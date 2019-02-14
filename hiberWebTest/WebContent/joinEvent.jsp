<%@page import="pj.users"%>
<%@page import="pj.usersDAO"%>
<%@page import="pj.EventDAO"%>
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
		usersDAO dao = new usersDAO();
		String event = request.getParameter("eventId");
		dao.update(((users) session.getAttribute("user")).getUserNo(),
				Integer.parseInt(request.getParameter("eventId")));
		response.sendRedirect("eventList.jsp?eventId=" + event);
	%>
</body>
</html>