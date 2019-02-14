<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="resource/js/jquery-3.2.1.min.js"></script>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<center>
<form id="articleForm" method="post" action="registArticle.jsp" enctype="Multipart/form-data">
	<table border="1">
			<tr><td>Title</td><td><input id="title" type="text" name="title"/></td></tr>
			<tr><td>Abstract</td><td><input id="abstract" type="text" name="abstract"/></td></tr>
			<tr><td>Author</td><td><input id="author" type="text" name="author"/></td><td><input id="authorAddBtn" type="button" value="Add"></td></tr>
			<tr id="afterAuthor"><td>Keyword</td><td><input id="keyword" type="text" name="keyword"/></td></tr>
			<tr><td>File</td><td><input id="file" type="file" name="file"/></td></tr>
	</table>
	<input type="button" id="articleAddBtn" value="Submit"/>
</form>
</center>
<script type="text/javascript">
	$("#authorAddBtn").on('click',(function(){
		$("#afterAuthor").before("<tr><td></td><td><input type='text' name='author'/></td>");
	}));
	$("#articleAddBtn").on('click',(function(){
		if($("#title").val()==""){
			alert("Title cannot be empty.");
		}else if($("#abstract").val()==""){
			alert("Abstract cannot be empty.");
		}else if($("#author").val()==""){
			alert("At least one author.");
		}else if($("#keyword").val()==""){
			alert("Keyword cannot be empty.");
		}else if($("#file").val()==""){
			alert("File cannot be empty.");
		}else{
			var form = $("#articleForm");
			form.submit();
		}
	}));
	
</script>
</body>
</html>