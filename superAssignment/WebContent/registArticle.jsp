<%@page import="java.io.File"%>
<%@page import="java.util.Enumeration"%>
<%@page import="superAssignment.ArticleDAO"%>
<%@page import="superAssignment.User"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.ArrayList"%>
<%@page import="superAssignment.Author"%>
<%@page import="java.util.List"%>
<%@page import="superAssignment.Article"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<%@page import="com.oreilly.servlet.MultipartRequest" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%	
	String saveFolder="/uploadFile";
	String uploadPath=request.getRealPath(saveFolder);
	System.out.println(request.getRealPath(saveFolder));
	String encType="utf-8";
	int maxSize=10*1024*1024;
	MultipartRequest multi = new MultipartRequest(request,uploadPath,maxSize,encType,new DefaultFileRenamePolicy());
	
	Enumeration files = multi.getFileNames();
	String name = (String)files.nextElement();
	String originFile = multi.getOriginalFileName(name);
	String systemFile = multi.getFilesystemName(name);
	String fileType=multi.getContentType(name);
	File file = multi.getFile(name);
	
	List<Author> auli = new ArrayList<Author>();
	String[] authors=multi.getParameterValues("author");
	for(int i=0;i<authors.length;i++){
		if(!authors[i].equals(""))
			auli.add(new Author(authors[i]));
	}
	
	Article article = new Article((String)multi.getParameter("title"),auli,(String)multi.getParameter("abstract"),(String)multi.getParameter("keyword"),originFile,new Date(),"Submit",((User)session.getAttribute("user")).getUserNo(),systemFile);
	ArticleDAO dao = new ArticleDAO();
	dao.registArticle(article);
	response.sendRedirect("statusView.jsp");
%>
</body>
</html>