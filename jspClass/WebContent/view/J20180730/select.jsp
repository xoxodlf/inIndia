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
<%!
class board{
	int bno;
	String title;
	String content;
	String writer;
	String regdate;
	int viewCnt;
	
	board(int bno,String title, String content,String writer,String regdate, int viewCnt){
		this.bno=bno;
		this.title=title;
		this.content=content;
		this.writer=writer;
		this.regdate=regdate;
		this.viewCnt=viewCnt;
	}
}
%>
<%
Connection connection = null;
Statement st = null;
List<board> list = new ArrayList<board>();
int cnt=0;
String result="";
try {
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_ex?serverTimezone=UTC" , "xoxodlf", "red240188");
    st = connection.createStatement();

    String sql = "select * from tbl_board where bno like '%"+request.getParameter("userNo")+"%'";
    ResultSet rs = st.executeQuery(sql);
    
    while(rs.next()){
		list.add(new board(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6)));
	}
    
    System.out.println(cnt);
    st.close();
    connection.close();
} catch (SQLException se1) {
    se1.printStackTrace();
} catch (Exception ex) {
    ex.printStackTrace();
}
%>

<table border="solid 1px">
<tr><td>no</td><td>title</td><td>content</td><td>writer</td><td>regdate</td><td>viewcount</td></tr>
<%for(board bo:list){ %>
	<tr><td><%=bo.bno%></td><td><%=bo.title%></td><td><%=bo.content%></td><td><%=bo.writer%></td><td><%=bo.regdate%></td><td><%=bo.viewCnt%></td></tr>
<%}%>
</table>
</body>
</html>