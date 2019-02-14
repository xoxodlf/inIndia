<%@page import="superAssignment.ArticleDAO"%>
<%@page import="java.util.ArrayList"%>
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
	String[] articleNoArr= request.getParameterValues("articleNos");
	String[] statusArr= request.getParameterValues("changeTo");
	for(int i=0;i<statusArr.length;i++){
		if(!statusArr[i].equals("")){
			if(statusArr[i].equals("0")){
				dao.deleteArticle(Integer.parseInt(articleNoArr[i]));
			}
			else{
				dao.updateArticle(Integer.parseInt(articleNoArr[i]), statusArr[i]);
			}
		}
	}
	response.sendRedirect("admin.jsp");
%>
</body>
</html>