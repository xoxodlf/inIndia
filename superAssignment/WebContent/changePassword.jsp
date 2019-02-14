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
	<form id="chForm" action="changeP.jsp" method="post">
		<table>
			<tr><td>New Password</td><td><input id="password" type="password" name="password" required="required"/></td></tr>			
			<tr><td>New Password Check</td><td><input id="password2" type="password" required="required"/></td></tr>			
			<tr><td>Favorite Food</td><td><input id="q1" type="text" name="q1" required="required"/></td></tr>
			<tr><td>Favorite Pat</td><td><input id="q2" type="text" name="q2" required="required"/></td></tr>
			<tr><td>Favorite Sports</td><td><input id="q3" type="text" name="q3" required="required"/></td></tr>
		</table>
		<input id="changeBtn" type="button" value="Change"/>
	</form>
</center>
<script type="text/javascript">
$("#changeBtn").on('click', (function() {
	if($("#password").val()!=$("#password2").val()){
		alert("Please check password");
	}else{
		var form = $("#chForm");
		form.submit();
	}
}));
</script>
</body>
</html>