<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<div id="map" style="width: 400px; height: 400px;"></div>
	
	<script type="text/javascript">
		function myMap() {
			var mapCanvas = document.getElementById("map");
			var mapOptions = {
				center : new google.maps.LatLng(51.5, -0.2),
				zoom : 10
			};
			var map = new google.maps.Map(mapCanvas, mapOptions);
		}
	</script>
	<script
		src="http://maps.googleapis.com/maps/api/js?callback=myMap"></script>
</body>
</html>