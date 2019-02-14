<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	div.gallery{
		border: 1px solid #ccc;
	}
	
	div.gallery:hover{
		border: 1px solid #777;
	}
	
	div.gallery img{
		width:100%;
		height: auto;
	}
	
	div.desc{
		padding: 15px;
		text-align: center;
	}
	*{
		box-sizing: border-box;
	}
	
	.reponsive{
		padding: 0 6px;
		float: left;
		width: 24.99999%
	}
	
	@media only screen and (max-width:700px){
		.reponsive{
		padding: 0 6px;
		width: 49.99999%
		}
	}
	
	@media only screen and (max-width:500px){
		.reponsive{
		width: 100%
		}
	}
	
	.clearfix:after{
		content:"";
		display: table;
		clear: both;
	}
</style>
</head>
<body>

	<h2>gall</h2>
	
	<div class="reponsive">
		<div class="gallery">
			<a target="_blank" href="Muntari Milan.jpg">
			<img src="Muntari Milan.jpg" alt="mil" width="300"height="200">
			</a>
			<div class="desc">Add a description</div>
		</div>
	</div>
	<div class="reponsive">
		<div class="gallery">
			<a target="_blank" href="Muntari Milan.jpg">
			<img src="Muntari Milan.jpg" alt="mil" width="600"height="400">
			</a>
			<div class="desc">Add a description</div>
		</div>
	</div>
	<div class="reponsive">
		<div class="gallery">
			<a target="_blank" href="Muntari Milan.jpg">
			<img src="Muntari Milan.jpg" alt="mil" width="300"height="200">
			</a>
			<div class="desc">Add a description</div>
		</div>
	</div>
	<div class="reponsive">
		<div class="gallery">
			<a target="_blank" href="Muntari Milan.jpg">
			<img src="Muntari Milan.jpg" alt="mil" width="300"height="200">
			</a>
			<div class="desc">Add a description</div>
		</div>
	</div>
	<div class="clearfix"></div>	
	<div class="reponsive">
		<div class="gallery">
			<a target="_blank" href="Muntari Milan.jpg">
			<img src="Muntari Milan.jpg" alt="mil" width="300"height="200">
			</a>
			<div class="desc">Add a description</div>
		</div>
	</div>
	
	

</body>
</html>