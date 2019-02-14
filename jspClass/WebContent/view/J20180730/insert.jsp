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
    sql = "insert into tbl_board(title,content,writer,regdate,viewcnt) values('"+request.getParameter("title")+"','"+request.getParameter("content")+"','"+request.getParameter("writer")+"',sysdate(),0)";
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
<a href="/jspClass/view/J20180730/UpdateForm.jsp">go to the list</a>
</body>
</html>