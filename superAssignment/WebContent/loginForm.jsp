<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="resource/js/jquery-3.2.1.min.js"></script>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<center>
	<form action="login.jsp" method="post" id="loginForm">
		<table border="1">
			<tr><td>E-Mail</td><td><input id="email" type="email" name="emailId"/></td></tr>
			<tr><td>Password</td><td><input id="password" type="password" name="password"/></td></tr>
		</table>
	</form>
	<input id="signUpBtn" type="button" value="Sign-Up"/>
	<input id="logInBtn" type="button" value="Log-In"/><br><br>
	<input id="findPwBtn" type="button" value="Find-Password"/>
	</center>
<script type="text/javascript">

$(document).ready(function(){
	<% String msg = (String)request.getAttribute("msg");
	if(msg==null)msg="";%>
	if("<%=msg%>"!=""){
		alert("<%=msg%>");
	}
});

$("#logInBtn").on('click', (function() {
	if($("#email").val()==""){
		alert("Email cannot be empty.");
	}else if($("#password").val()==""){
		alert("Password cannot be empty.");
	}else{
		var form = $("#loginForm");
		form.submit();
	}
}));

$("#findPwBtn").on('click', (function() {
	location.href="findPassword.jsp";
}));
$("#signUpBtn").on('click', (function() {
	location.href="signupForm.jsp";
}));
</script>
</body>
</html>