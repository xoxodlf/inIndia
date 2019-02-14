<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.*"%>
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
Connection connection = null;
Statement st = null;
List<String> list = new ArrayList<String>();
int cnt=0;
try {
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_ex?serverTimezone=UTC" , "xoxodlf", "red240188");
    st = connection.createStatement();

    String sql;
    sql = "insert into tbl_board values(30002,'태태일','태태일',4,'2018-08-30',0)";
	st.executeUpdate(sql);
    
    st.close();
    connection.close();
} catch (SQLException se1) {
    se1.printStackTrace();
} catch (Exception ex) {
    ex.printStackTrace();
}
%>



	<p>insert success</p>


</body>
</html>