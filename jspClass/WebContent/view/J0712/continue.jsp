<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		for (int i = 0; i < 20; i++) {
			if (isEven(i))
				continue;
	%>
	i=<%=i%><br>
	<%
		}
	%>
	<%!boolean isEven(int i) {
		if (i % 2 == 0)
			return true;
		return false;
	}%>
</body>
</html>