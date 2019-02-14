<%@page import="pj.users"%>
<%@page import="java.util.List"%>
<%@page import="pj.usersDAO"%>
<%@page import="pj.Event"%>
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
	List<users> list =dao.eList(request.getParameter("eventId"));
%>
<h2>Event <%=request.getParameter("eventId") %></h2>
<table border="1">
	<tr><th>No</th><th>ID</th><th>Name</th></tr>
	<%for(int i=0;i<list.size();i++){ %>
		<tr><td><%=list.get(i).getUserNo() %></td><td><%=list.get(i).getUserId() %></td><td><%=list.get(i).getName()%></td></tr>
	<%} %>

</table>
<a href="joinEvent.jsp?eventId=<%=request.getParameter("eventId")%>">Sign up to this Event</a>
</body>
</html>