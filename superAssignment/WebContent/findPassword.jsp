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
	<form action="sendMail.jsp" method="post" id="sendForm">
		<table border="1">
			<tr><td>E-Mail</td><td><input id="email" type="email" name="emailId"/></td></tr>
			<tr><td>Favorite Food</td><td><input id="q1" type="text" name="q1"/></td></tr>
			<tr><td>Favorite Pat</td><td><input id="q2" type="text" name="q2"/></td></tr>
			<tr><td>Favorite Sports</td><td><input id="q3" type="text" name="q3"/></td></tr>
		</table>
	</form>
	<input id="sendMail" type="button" value="Find-Password"/>
</center>

<script type="text/javascript">

$("#sendMail").on('click', (function() {
	if($("#email").val()==""){
		alert("Email cannot be empty.");
	}else if($("#q1").val()==""){
		alert("Question 1 cannot be empty.");
	}else if($("#q2").val()==""){
		alert("Question 2 cannot be empty.");
	}else if($("#q3").val()==""){
		alert("Question 3 cannot be empty.");
	}else{
		var form = $("#sendForm");
		form.submit();
	}
	}));

</script>
</body>
</html>