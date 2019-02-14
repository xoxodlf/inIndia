<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
.imgbox {
	float: left;
	text-align: center;
	width: 120px;
	border: 1px solid gray;
	margin: 4px;
	padding: 6px;
}

button {
	width: 100%;
}
</style>
</head>
<body>
	<div id="body">

		<div class="imgbox" id="imgbox1">
			box1 <img src="Muntari Milan.jpg" alt="milan" style="width: 100%;" />
			<button onclick="removeElement(this)">HIDE</button>
		</div>

		<div class="imgbox">
			box2 <img src="Muntari Milan.jpg" alt="milan" style="width: 100%;" />
			<button onclick="changeVisiblity(this)">HIDE</button>
		</div>
		<div class="imgbox">
			box3 <img src="Muntari Milan.jpg" alt="milan" style="width: 100%;" />
			<button onclick="changeVisiblity(this)">HIDE</button>
		</div>
		<div class="imgbox">
			box4 <img src="Muntari Milan.jpg" alt="milan" style="width: 100%;" />
			<button onclick="changeVisiblity(this)">HIDE</button>
		</div>
		<div class="imgbox">
			box5 <img src="Muntari Milan.jpg" alt="milan" style="width: 100%;" />
			<button onclick="changeVisiblity(this)">HIDE</button>
		</div>
		<div class="imgbox">
			box6 <img src="Muntari Milan.jpg" alt="milan" style="width: 100%;" />
			<button onclick="changeVisiblity(this)">HIDE</button>
		</div>

		<div class="imgbox" id="imgbox3">
			box7 <img src="Muntari Milan.jpg" alt="milan" style="width: 100%;" />
			<button onclick="resetElement()">reset</button>
		</div>

	</div>

	<script type="text/javascript">
		function changeVisiblity(element) {
			element.parentNode.style.visibility = "hidden";
		}

		function removeElement(element) {
			element.parentNode.style.display = "none";
		}

		function resetElement() {

			var divs = document.getElementById("body").childNodes;
			for (var i = 0; i < divs.length; i++) {
				if(divs[i].nodeName!="#text")
					divs[i].style.visibility="visible";
			}

			document.getElementById("imgbox1").style.display = "block";

		}
	</script>
</body>
</html>