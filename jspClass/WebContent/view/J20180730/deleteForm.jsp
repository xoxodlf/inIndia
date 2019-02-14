<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
Connection connection = null;
Statement st = null;
List<String> list = new ArrayList<String>();
int cnt=0;
try {
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_ex?serverTimezone=UTC" , "xoxodlf", "red240188");
    st = connection.createStatement();

    String sql;
    sql = "delete from tbl_board where bno="+request.getParameter("bno");
	st.executeUpdate(sql);
    st.close();
    connection.close();
} catch (SQLException se1) {
    se1.printStackTrace();
} catch (Exception ex) {
    ex.printStackTrace();
}
%>
<form action="/jspClass/view/J20180730/delete.jsp">
	Find No <input type="text" name="bno"/>
	<input type="submit" value="submit"/>
</form>
</body>
</html>