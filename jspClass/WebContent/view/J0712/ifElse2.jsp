<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>Air fare cost is</h1>
<% 
int passengerAge =24;
double fullPrice =123.45;
double discountPercent;
double finalPrice;

if(passengerAge<=2)
	discountPercent=90;
else if(passengerAge<=12)
	discountPercent=50;
else
	discountPercent=0;

finalPrice = fullPrice-fullPrice*discountPercent/100;
%>
<%=finalPrice %>

</body>
</html>