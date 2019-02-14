<%@page import="java.net.URLEncoder"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.File"%>
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
	String fileName = request.getParameter("file_name");

	String savePath=application.getRealPath("/uploadFile/");
	
	File file = new File(savePath+"\\"+fileName);
	
	byte[] b = new byte[10*1024*1024];
	
	FileInputStream in = new FileInputStream(file);
	
	String sMimeType = getServletContext().getMimeType(savePath+"\\"+fileName);
	
	if(sMimeType==null)
		sMimeType="application.octec-stream";
	
	response.setContentType(sMimeType);
	String A = new String(fileName.getBytes("euc-kr"),"8859_1");
	String B = "utf-8";
	String sEncoding = URLEncoder.encode(A, B);
	
	String AA= "Content-Disposition";
	String BB= "attachment; filename="+sEncoding;
	response.setHeader(AA, BB);
	
	ServletOutputStream os = response.getOutputStream();
	
	int numRead=0;
	
	while((numRead=in.read(b,0,b.length))!=-1){
		os.write(b,0,numRead);
	}
	os.flush();
	os.close();
	in.close();
	

%>
</body>
</html>