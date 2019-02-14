<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%!int[] orderedQuantities = new int[3];
	int[] inStockQuantities = { 1, 2, 3 };
	String[] productNames = { "Screen House", "Rain Flyer", "Tent" };
	String[] productDescriptions = getDescriptions();
	double[] productPrices = { 149.99, 29.99, 129.99 };

	String[] getDescriptions() {
		String[] descriptions = { "Description 1", "Description 2", "Description 3" };
		return descriptions;
	}%>
	<table border="solid 1px">
		<tr>
			<th>Name</th>
			<th>Description</th>
			<th>Price</th>
			<th>In Order</th>
			<th>In Stock</th>
		</tr>
		<%
			for (int i = 0; i < 3; i++) {
		%>
		<tr>
			<td><%=productNames[i]%></td>
			<td><%=productDescriptions[i]%></td>
			<td><%=productPrices[i]%></td>
			<td><%=orderedQuantities[i]%></td>
			<td><%=inStockQuantities[i]%></td>
		</tr>
		<%
			}
		%>
	</table>





</body>
</html>