<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="resource/js/jquery-3.2.1.min.js"></script>
</head>
<body>
<div>
<jsp:include page="header.jsp"></jsp:include>
	<center>
	<form action="signup.jsp" method="post" id="signupForm">
		<table border="1">
			<tr><td>E-Mail</td><td><input id="email" type="email" name="emailId"/></td></tr>
			<tr><td>Name</td><td><input id="name" type="text" name="userName"/></td></tr>
			<tr><td>Password</td><td><input id="password" type="password" name="password"/></td></tr>
			<tr><td>Password Check</td><td><input id="password2" type="password"/></td></tr>
			<tr><td>Phone#</td><td><input id="phone" type="text" name="phoneNum"/></td></tr>
			<tr><td>Address</td><td><input id="address" type="text" name="address"/></td></tr>
			<tr><td>Area of Expetise</td><td><input id="aoe" type="text" name="areaOfExpetise"/></td></tr>
			<tr><td>Favorite Food</td><td><input id="q1" type="text" name="q1"/></td></tr>
			<tr><td>Favorite Pat</td><td><input id="q2" type="text" name="q2"/></td></tr>
			<tr><td>Favorite Sports</td><td><input id="q3" type="text" name="q3"/></td></tr>
		</table>
		<input type="hidden" value="0" name="status"/>
	</form>
	<input id="signUpBtn" type="button" value="Sign-Up"/>
	</center>
</div>
<script type="text/javascript">
$(document).ready(function(){
	<% String msg = (String)request.getAttribute("msg");
	if(msg==null)msg="";%>
	if("<%=msg%>"!=""){
		alert("<%=msg%>");
	}
});
$("#signUpBtn").on('click', (function() {
if($("#email").val()==""){
	alert("Email cannot be empty.");
}else if($("#name").val()==""){
	alert("Name cannot be empty.");
}else if($("#password").val()==""){
	alert("Password cannot be empty.");
}else if($("#password").val()!=$("#password2").val()){
	alert("Please check password");
}else if($("#phone").val()==""){
	alert("Phone cannot be empty.");
}else if($("#address").val()==""){
	alert("Address cannot be empty.");
}else if($("#aoe").val()==""){
	alert("Area of Expetise cannot be empty.");
}else if($("#q1").val()==""){
	alert("Question 1 cannot be empty.");
}else if($("#q2").val()==""){
	alert("Question 2 cannot be empty.");
}else if($("#q3").val()==""){
	alert("Question 3 cannot be empty.");
}else{
	var form = $("#signupForm");
	form.submit();
}
}));
</script>
</body>
</html>