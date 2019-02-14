<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.button {
		position: relative;
		background-color: #4CAF50;
		border: none;
		font-size: 28px;
		color: #FFFFFF;
		padding:20px;
		width: 200px;
		text-align: center;
		transition-duration:0.4s;
		text-decoration: none;
		overflow: hidden;
		cursor: pointer;
	}
	
	.button:after{
		content: "";
		background: #f1f1f1;
		display: block;
		position: absolute;
		padding-top: 300%;
		padding-left: 350%;
		margin-left: -20px!important;
		margin-top: -120%;
		opacity: 0;
		transition: all 0.8s;
	}
	
	.button:active:after{
		padding: 0;
		margin: 0;
		opacity: 1;
		transition:0s;
	}
</style>
</head>

<body>
<button class="button">click me</button>
</body>
</html>