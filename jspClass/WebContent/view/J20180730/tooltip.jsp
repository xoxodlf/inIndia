<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style type="text/css">
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
<body style="text-align: center;">
	<p>Move the mouse over the text below:</p>
	
	<div class="tooltip">hover over me
		<span class="tooltiptext">Tooltip text</span>
	</div>
</body>
</html>