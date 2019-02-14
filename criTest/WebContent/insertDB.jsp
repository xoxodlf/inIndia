<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ect.user"%>
<%@page import="java.util.List"%>
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
	String id= request.getParameter("id");
	String name = request.getParameter("name");
	String sex = request.getParameter("sex");
	String address = request.getParameter("address");
	String mStatus = request.getParameter("mStatus");
	String[] eqs = request.getParameterValues("eq");
	String eduQual = "";
	for(int i=0;i<eqs.length;i++){
		eduQual+=eqs[i]+" ";		
	}
	try{
		String query= "insert into user values(?,?,?,?,?,?)";
		Connection con= (new DBConnection()).getConnection();
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, id);
		ps.setString(2, name);
		ps.setString(3, sex);
		ps.setString(4, address);
		ps.setString(5, mStatus);
		ps.setString(6, eduQual);
		ps.executeUpdate();
	}catch(Exception e){
		e.printStackTrace();
	}
	response.sendRedirect("list.jsp");
	%>

</body>
</html>