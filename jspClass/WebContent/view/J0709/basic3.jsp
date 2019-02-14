<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%! 
class A{
	int a=1;
	int b=2;
	int printAB(){
		return a*b;
	}
}

int cube(int n){
	return n*n*n;
}%>

<% A a = new A();%>
<%= a.printAB() %>

<%="Cube of 3 is : "+ cube(3) %>
</body>
</html>