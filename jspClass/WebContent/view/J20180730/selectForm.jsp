<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style type="text/css">
.button {
	background-color: #4CAF50;
	border:none;
	color:white;
	padding:15px 32px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	margin: 4px 2px;
	cursor: pointer;
}

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

.tooltip{
		position: relative;
		display: inline-block;
		border-bottom:  1px dotted black;
	}
	
	.tooltip .tooltiptext{
		visibility: hidden;
		width: 120px;
		background-color: black;
		color:#fff;
		text-align: center;
		border-radius: 6px;
		padding:5px;
		position: absolute;
		z-index:1;
	}
	
	.tooltip:hover .tooltiptext{
		visibility: visible;
	}

</style>
</head>
<body>
<form action="/jspClass/view/J20180730/select.jsp">
No<input type="text" name="userNo"/>
<input type="submit" class="button" value="select"/>
</form>
<form action="/jspClass/view/J20180730/select2.jsp">
title<div class="tooltip"><input type="text" class="tooltip" name="title"/><span class="tooltiptext">Please Enter the Name</span></div>
<input type="submit" class="button" value="select"/>
</form>
</body>
</html>