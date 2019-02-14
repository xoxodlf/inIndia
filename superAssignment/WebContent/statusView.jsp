<%@page import="superAssignment.User"%>
<%@page import="superAssignment.ArticleDAO"%>
<%@page import="superAssignment.Article"%>
<%@page import="java.util.List"%>
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
	ArticleDAO dao = new ArticleDAO();
	List<Article> list = dao.listAll(((User)session.getAttribute("user")).getUserNo());
%>
<jsp:include page="header.jsp"></jsp:include>
<center>
<h2>Status</h2>
<%for(int i=0;i<list.size();i++){ %>
	<table border="1">
		<tr><td>Title</td><td><%=list.get(i).getTitle() %></td></tr>
		<tr><td>Abstract</td><td><%=list.get(i).getaAbstract() %></td></tr>
		<%for(int j=0;j<list.get(i).getAuthors().size();j++){ %>
			<%if(j==0){ %>
				<tr><td>Author</td><td><%= list.get(i).getAuthors().get(j).getName() %></td></tr>
			<%}else{ %>
				<tr><td></td><td><%= list.get(i).getAuthors().get(j).getName() %></td></tr>
			<%} %>
		<%}%>
		<tr><td>Keyword</td><td><%=list.get(i).getKeyword() %></td></tr>
		<tr><td>File</td><td><a href="fileDownloader.jsp?file_name=<%=list.get(i).getFileKey()%>"><%=list.get(i).getFile()%></a></td></tr>
		<tr><td>Regdate</td><td><%=list.get(i).getRegdate()%></td></tr>
		<tr><td>Status</td><td><%=list.get(i).getStatus()%></td></tr>
	</table>
	<br><br>
<% } %>
</center>

</body>
</html>