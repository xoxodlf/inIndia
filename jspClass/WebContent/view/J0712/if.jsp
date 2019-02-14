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
	boolean userIsLogged = false;
   	boolean securityOn =true;
   	if(!userIsLogged&&securityOn){%>
   		<h1>Warning</h1>
   		You have not yet logged onto the system.
   		<a>Please click here to log on</a>
   	<%
   	}
%>

</body>
</html>