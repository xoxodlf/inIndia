<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	div{
		width:100px;
		height: 100px;
		background-color: red;
		position: relative;
		-webkit-animation-name:example;
		-webkit-animation-duration:4s;
		-webkit-animation-iteration-count:3;
		animation-name:example;
		animation-duration:2s;
		animation-iteration-count:103;
	}
	
	@keyframes example{
		0% {background-color: red;left:150px;top:150px;}
		25% {background-color: yellow;left:300px;top:300px;}
		50% {background-color: blue;left:150px;top:450px;}
		75% {background-color: green;left:0px;top:300px;}
		100% {background-color: red;left:150px;top:150px;}
	}
	
</style>

</head>
<body>
<div></div>
</body>
</html>