<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="ect.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ect.user"%>
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
List<user> list = new ArrayList<user>();

try{
	String query= "select * from user";
	Connection con= (new DBConnection()).getConnection();
	PreparedStatement ps = con.prepareStatement(query);
	ResultSet rs = ps.executeQuery();
	
	while(rs.next()){
		list.add(new user(rs.getString("id"),rs.getString("name"),rs.getString("sex"),rs.getString("address"),rs.getString("mStatus"),rs.getString("eduQual")));
	}
}catch(Exception e){
	e.printStackTrace();
}

%>
<table border="1">
<tr><th>id</th><th>name</th><th>sex</th><th>address</th><th>mStatus</th><th>eduQual</th></tr>
	<% for(int i=0;i<list.size();i++){ %>
	<tr>
		<td><%=list.get(i).getId() %></td>
		<td><%=list.get(i).getName() %></td>
		<td><%=list.get(i).getSex() %></td>
		<td><%=list.get(i).getAddress() %></td>
		<td><%=list.get(i).getmStatus() %></td>
		<td><%=list.get(i).getEduQual() %></td>
		<td><a href="delete.jsp?id=<%= list.get(i).getId()%>">Delete This ID</a></td>
	</tr>
		
	<%} %>
</table>
</body>
</html>