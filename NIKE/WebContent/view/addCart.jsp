<%@page import="dto.ItemDAO"%>
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
	ItemDAO dao = new ItemDAO();
	dao.insertToCart(Integer.parseInt(request.getParameter("itemNo")), Integer.parseInt(request.getParameter("userNo")), Integer.parseInt(request.getParameter("quantity")));
	response.sendRedirect("cart.jsp");
%>
</body>
</html>