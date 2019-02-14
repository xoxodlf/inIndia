<%@page import="superAssignment.User"%>
<%@page import="superAssignment.Article"%>
<%@page import="java.util.List"%>
<%@page import="superAssignment.ArticleDAO"%>
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
		List<Article> list = dao.listAll();
	%>
	<jsp:include page="header.jsp"></jsp:include>
	<center>
		<form action="changeStatus.jsp" method="post">
		<table border="1">
			<tr>
				<th>Title</th>
				<th>Abstract</th>
				<th>Author</th>
				<th>Keyword</th>
				<th>File</th>
				<th>Regdate</th>
				<th>Status</th>
				<th>Change</th>
			</tr>
			<%
				for (int i = 0; i < list.size(); i++) {
			%>
			<%
				for (int j = 0; j < list.get(i).getAuthors().size(); j++) {
			%>
			<%
				if (j == 0) {
			%>
			<tr>
				<td><%=list.get(i).getTitle()%></td>
				<td><%=list.get(i).getaAbstract()%></td>
				<td><%=list.get(i).getAuthors().get(j).getName()%></td>
				<td><%=list.get(i).getKeyword()%></td>
				<td><a href="fileDownloader.jsp?file_name=<%=list.get(i).getFileKey()%>"><%=list.get(i).getFile()%></a></td>
				<td><%=list.get(i).getRegdate()%></td>
				<td><%=list.get(i).getStatus()%></td>
				<td><input type="number" min="0" max="4" name="changeTo"><input type="hidden" name="articleNos" value="<%=list.get(i).getArticleNo()%>"></td>
			</tr>
			<%
				} else {
			%>
			<tr>
				<td></td>
				<td></td>
				<td><%=list.get(i).getAuthors().get(j).getName()%></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<%
				}
			%>
			<%
				}
			%>

			<%
				}
			%>
		</table>
		<input type="submit" value="Submit">
		</form>
	</center>
</body>
</html>