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
void quickSort(String[] titles,int[] conf,int p,int r){
	if(p<r){
		int q = partitation(titles,conf,p,r);
		quickSort(titles,conf,p,q);
		quickSort(titles,conf,q+1,r);
	}
}

int partitation(String[] titles,int[] conf,int p,int r){
	int x = conf[p];
	int i = p-1;
	int j = r + 1;
	while(true){
		do{
			j=j-1;
		}while(conf[j]>x);
		do{
			i=i+1;
		}while(conf[i]<x);
		if(i<j){
			String temp1 = titles[i];
			titles[i]=titles[j];
			titles[j]=temp1;
			int temp2=conf[i];
			conf[i]=conf[j];
			conf[j]=temp2;
		}else{
			return j;
		}
	}
}
%>

<%
String[] searchResultTitles = {"Teach Yourself Internet Game Programming With Java In 21 Days","Teach Yourself Java In 21 Days", "Graphic Java, Mastering The AWT", "Ready to Run Java 3D","Advanced Java Networking","someting"};
int[] searchResultConfidence={23,56,27,67,91,11};
quickSort(searchResultTitles, searchResultConfidence, 0, 5);
%>

<h1>Search result sorted by confidence factor:</h1><br>
<%
for(int j=searchResultTitles.length-1;j>=0;j--){
%>
<%= searchResultConfidence[j] %>-- <%=searchResultTitles[j] %><br>
<%} %>
</body>
</html>