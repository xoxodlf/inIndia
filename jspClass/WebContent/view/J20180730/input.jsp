<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style type="text/css">
input[type=text]{
	width:130px;
	box-sizing: border-box;
	border: 2px solid #ccc;
	border-radius: 4px;
	font-size: 16px;
	background-color: white;
	background-image: url('Muntari Milan.jpg');
	background-position: 10px 10px;
	background-repeat: no-repeat;
	padding: 12px 20px 12px 40px;
	-webkit-transition: width 15s ease-in-out;
	transition: width 0.4s ease-in-out;
}

input[type=text]:focus{
width: 100%;
}
</style>

</head>
<body>
<form>
	<input type="text" name=search placeholder="Search...">
</form>

</body>
</html>