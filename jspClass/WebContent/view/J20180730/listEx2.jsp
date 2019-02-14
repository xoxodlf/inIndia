<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style type="text/css">
*{
	margin:0px;
	padding:0px;
	color:white;
}

#container ul{
	list-style: none;
}

#container ul li{
	background-color: #3C3E94;
	width:150px;
	border:1px solid white;
	height:50px;
	line-height: 50px;
	text-align: center;
	float: left;
	font-size: 18px;
	position: relative;
}

#container ul li:hover{
	background-color: #388222;
}
#container ul ul{
	display: none;
}

#container ul li:hover >ul{
	display: block;
}

#container ul ul ul{
	margin-left: 150px;
	top:0px;
	position: absolute;
}


</style>
</head>
<body>
<div id="container">
	<ul>
		<li><a href="#home" style="text-decoration: none;">HOME</a></li>
		<li><a href="#news" style="text-decoration: none;">NEWS</a>
		<ul>
			<li><a href="#news1" style="text-decoration: none;">FOX NEWS</a></li>
			<li>BBC
				<ul>
					<li><a href="#news2" style="text-decoration: none;">BBC Europe</a></li>
					<li><a href="#news3" style="text-decoration: none;">BBC Asia</a></li>
					<li><a href="#news4" style="text-decoration: none;">BBC America</a></li>
				</ul>
			</li>
			<li><a href="#news5" style="text-decoration: none;">CNN</a></li>
		</ul>
		<li><a href="#contact" style="text-decoration: none;">CONTACT</a></li>
		<li><a href="#about" style="text-decoration: none;">ABOUT</a></li>
	</ul>
</div>

</body>
</html>