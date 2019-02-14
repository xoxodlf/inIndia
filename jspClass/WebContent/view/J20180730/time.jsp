<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	p{
	text-align: center;
	font-size: 60px;
	}
	
</style>

</head>
<body>
<p id="demo"></p>

<script type="text/javascript">
	var countDownDate = new Date("aug 6, 2018 14:30:00").getTime();
	var x = setInterval(function (){
		var now = new Date().getTime();
		var distance = countDownDate -now;
		var days= Math.floor(distance/(1000*60*60*24));
		var hours= Math.floor((distance%(1000*60*60*24))/(1000*60*60));
		var minutes= Math.floor((distance%(1000*60*60))/(1000*60));
		var seconds= Math.floor((distance%(1000*60))/1000);
		
		document.getElementById("demo").innerHTML=days+"d "+hours+"h "+minutes+"m " + seconds+" s";
		
		if(distance<0){
			clearInterval(x);
			document.getElementById("demo").innerHTML="Expired";
		}
	},1000);
	
</script>
</body>
</html>