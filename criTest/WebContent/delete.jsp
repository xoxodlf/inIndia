<%@page import="java.sql.PreparedStatement"%>
<%@page import="ect.DBConnection"%>
<%@page import="java.sql.Connection"%>
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

try{
	String query= "delete from user where id=?";
	Connection con= (new DBConnection()).getConnection();
	PreparedStatement ps = con.prepareStatement(query);
	ps.setString(1, request.getParameter("id"));
	ps.executeUpdate();
}catch(Exception e){
	e.printStackTrace();
}

response.sendRedirect("list.jsp");
%>

</body>
</html>