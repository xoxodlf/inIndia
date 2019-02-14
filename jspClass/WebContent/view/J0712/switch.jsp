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
	final int LOGGED_OFF=0,LOGGED_ON=1;
	int userType=LOGGED_OFF;
	switch(userType){
	case LOGGED_ON:%>
	<h1>Welcome ! </h1>
	You are now logged onto the system<br>
	You have access to the system.
<%
	break;
	case LOGGED_OFF:%>
	<h1>Sorry ! </h1>
	You need to log onto the system before<br>
	grating you access to the system
	<%
	break;
	default:%>
	<h1>Error !</h1>
	The system is unable to determine whether<Br>
	the user is logged on or not.
	<%}
	%>
</body>
</html>