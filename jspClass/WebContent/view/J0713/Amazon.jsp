<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style type="text/css">
th {
	font-size: 30px;
}

td {
	height: 150px;
	text-align: center;
	font-size: 30px;
}
</style>
</head>
<body>
	<%
		String productsName[] = { "Chicken Braest", "Coke", "Induction Stove", "Nuguri", "Shin", "Pan" };
		String src[] = { "chicken.jpg", "coke.jpg", "induction.jpeg", "nuguri.jpg", "shin.jpg", "pan.jpg" };
		int price[] = { 250, 35, 1200, 120, 120, 500 };
	%>
	<h1 style="text-align: center;">Taeil's Big Market</h1>
	<div style="margin-top: 50px;">
		<table border="1px" style="margin-left: 340px;">
			<tr style="height: 100px;">
				<th style="width: 150px;">Product Img</th>
				<th style="width: 400px;">Product Name</th>
				<th style="width: 100px;">Price</th>
				<th style="width: 100px">Quantity</th>
				<th>Add Btn</th>
			</tr>
			<%
				for (int i = 0; i < productsName.length; i++) {
			%>
			<tr>
				<td style="width: 150px;"><img src="<%=src[i]%>" width="150"
					height="150" /></td>
				<td><%=productsName[i]%></td>
				<td><%=price[i]%></td>
				<td><select style="width: 60px; height: 60px; font-size: 30px;"><option>0</option>
						<option>1</option>
						<option>2</option>
						<option>3</option>
						<option>4</option></select></td>
				<td><input type="button" value="ADD" style="width: 50px; height: 50px; font-size: 16px;" /></td>
			</tr>
			<%
				}
			%>
		</table>


	</div>
</body>
</html>