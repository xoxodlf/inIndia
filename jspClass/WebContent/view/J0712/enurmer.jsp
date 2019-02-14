<%@page import="java.util.Enumeration"%>
<%@ page import="java.util.Vector"%>
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
String name = new String ("Taeil Yang");
Integer ssn = new Integer(111223333);
Double salary = new Double(65432.10);
Vector employee1 = new Vector();
String[] infoTitles ={"Name","SSN","Salary"};
%>

<%
employee1.addElement(name);
employee1.addElement(ssn);
employee1.addElement(salary);
int i =0;
Enumeration employeeInfo = employee1.elements();

while(employeeInfo.hasMoreElements()){%>
<p>Employee <%= infoTitles[i++] %>: <%= (Object)employeeInfo.nextElement() %>
<%
}
%>

</body>
</html>