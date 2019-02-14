<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%! String[] itemInInventory= {"qwe123","sfwf2","werwer23","dglsodfgk3","skjnf3","sdfsfdsf","ewf34f34","5656h","h6j767","a3r3r","tg45h6"};
	String itemBeingSearched="werwedr23";
	boolean found = false;
	int foundIndex=-1;%>
	
	<h1>Searching for <%=itemBeingSearched %> in database: </h1>
	<ul>
	<%int i=0;
	while(!found&&i<itemInInventory.length){%>
	<li>Searching index <%=i %>: <%=itemInInventory[i] %></li>
	<% if(itemBeingSearched.equals(itemInInventory[i])){
	found=true;
	foundIndex=i;
	}i++;
	}%>
	</ul>
	
	<h2>
	<% if(found){%>
		Found at index = <%= foundIndex%>
	<%} else { %>
	Sorry, <%=itemBeingSearched %> not found in database
	<%}%>
	</h2>	
	
	
	</ul>
</body>
</html>