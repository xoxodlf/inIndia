<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style type="text/css">
#mySidenav a{
	position:absolute;
	left: -80px;
	transition:0.3s;
	padding: 15px;
	width: 100px;
	text-decoration: none;
	font-size: 20px;
	color: white;
	border-radius: 0 5px 5px 0;
}

#mySidenav a:hover{
	left: 0;
}

#about{
	top:20px;
	background-color: #4caf50;
}

#blog {
	top:80px;
	background-color: #2196F3;
}

#projects{
	top: 140px;
	background-color: #f44336;
}

#contact{
	top:200px;
	background-color: #555;
}
</style>
</head>
<body>

<div id="mySidenav" class="mySidenav">
	<a href="/jspClass/view/J20180730/insertForm.jsp" id="about">Insert</a>
	<a href="/jspClass/view/J20180730/UpdateForm.jsp" id="blog">Update</a>
	<a href="/jspClass/view/J20180730/deleteForm.jsp" id="projects">Delete</a>
	<a href="/jspClass/view/J20180730/selectForm.jsp" id="contact">Select</a>
</div>

<div style="margin-left: 80px;">
	<h2>You can use Insert, Update, Delete, Select</h2>
	<p>Hover over the buttons in the left side navigation to open them</p>
</div>


</body>
</html>