<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%! int angles[]={0,30,45,75,90}; %>
<table border="2" align="center">
<tr><th>Angle</th><th>Sine of Angle</th><th>Cosine of Angle</th><th>Tangent of Angle</th></tr>

<% for(int i=0;i<5;i++) {%>
	<tr><td><%=angles[i]%></td><td><%=Math.sin(Math.toRadians(angles[i]))%></td><td><%=Math.cos(Math.toRadians(angles[i]))%></td><td><%=Math.tan(Math.toRadians(angles[i]))%></td></tr>
<%}%>
</table>
</body>
</html>