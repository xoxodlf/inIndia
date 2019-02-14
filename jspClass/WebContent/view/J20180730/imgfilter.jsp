<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	img{
		width:33%;
		height: auto;
		float: left;
		max-width: 235px;
		border-radius: 50%;
	}
	
	.blur{
		-webkit-filter:blur(4px);
		filter:blur(4px);
	}
	
	.brightness{
		-webkit-filter:brightness(250%);
		filter:brightness(250%);
	}
	
	.contrast{
		-webkit-filter:contrast(180%);
		filter:contrast(180%);
	}
	.grayscale{
		-webkit-filter:grayscale(100%);
		filter:grayscale(100%);
	}
</style>
</head>
<body>

<img src="Muntari Milan.jpg" alt="milan" width="300" height="300"/>
<img class="blur" src="Muntari Milan.jpg" alt="milan" width="300" height="300"/>
<img class="brightness" src="Muntari Milan.jpg" alt="milan" width="300" height="300"/>
<img class="contrast" src="Muntari Milan.jpg" alt="milan" width="300" height="300"/>
<img class="grayscale" src="Muntari Milan.jpg" alt="milan" width="300" height="300"/>

</body>
</html>