<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form id="form1" name="form1" action="result.jsp">
	Name    : <input type="text" name = "uname" size="20"/><br>
	Address : <input type="text" name = "address" size="20"/><br> 
	Phone # : <input type="text" name = "phone" size="20"/> <br>
	Email ID: <input type="text" name = "email" size="20"/> <br>
	<input type="button" onclick="validate(form1)" value="submit"/>

</form>
<script type="text/javascript">
function validate(form){
	if(form.uname.value==""){
		alert("You have to fill name");
	}else if(form.address.value==""){
		alert("You have to fill address");
	}else if(form.phone.value==""){
		alert("You have to fill phone #");
	}else if(form.email.value==""){
		alert("You have to fill email");
	}else{
		document.getElementById("form1").submit();
	}
}

</script>
</body>
</html>