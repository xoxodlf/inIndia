<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
boolean userIsLogged = true;
if(userIsLogged){
%>

<h1>welcome</h1>

you have successfully logged onto the system.
please click <a href="nowhere.html">here</a> to continue
<%
}else{
%>

<h1>Warning</h1>
You have not yet logged onto the system.
please click <a href="nowhere.html">here</a> to log on
<%} %>
</body>
</html>