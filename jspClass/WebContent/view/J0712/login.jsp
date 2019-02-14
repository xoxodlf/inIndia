<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%!
	final static int MIN_PSWD_LEN=8;
	boolean verifyPasswordLength(String password){
		if(password.length()<MIN_PSWD_LEN) return false;
		return true;
	}
	
	boolean verifyPasswordHasDigit(String password){
		for(int i=0;i<password.length();i++){
			if(Character.isDigit(password.charAt(i))) return true;
		}return false;
	}
	
	boolean verifyPasswordPolicy(String password){
		if(verifyPasswordLength(password)&&verifyPasswordHasDigit(password)) return true;
		return false;
	}
%>

<%
String password = request.getParameter("pw");
if(verifyPasswordPolicy(password)){
%>
<p>Thank you -</p>
<p>Your Password meets the security policy</p>
<%
}else {
%>

<p> Sorry </p>
<p> Your password does not meet the security policy </p>
<p> <a href="login"> Please try again</a>
<%} %>
</body>
</html>