<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>sign-in</title>
<link rel="stylesheet" type="text/css"
	href="../resources/styles/bootstrap4/bootstrap.min.css">
<link
	href="../resources/plugins/font-awesome-4.7.0/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css"
	href="../resources/plugins/OwlCarousel2-2.2.1/owl.carousel.css">
<link rel="stylesheet" type="text/css"
	href="../resources/plugins/OwlCarousel2-2.2.1/owl.theme.default.css">
<link rel="stylesheet" type="text/css"
	href="../resources/plugins/OwlCarousel2-2.2.1/animate.css">
<link rel="stylesheet" type="text/css"
	href="../resources/styles/contact_styles.css">
<link rel="stylesheet" type="text/css"
	href="../resources/styles/contact_responsive.css">
</head>
<body>

	<div class="super_container">

		<!-- Header -->

		<jsp:include page="Header.jsp" />

		<div class="container contact_container">
			<!-- Map Container -->

			<div class="row">
				<div class="col" style="text-align: center;">
					<div style="width: 40%; text-align: center; margin-left: 30%;">
						<form role="form" class="form-signin" id="loginForm"
						action="/NIKE/view/signinUsr.jsp" method="post">
						<h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
						<label class="sr-only">ID</label> <input type="text" name="uId"
							id="uId" class="form-control" placeholder="ID" />  <label
							class="sr-only">Password</label> <input type="password" id="uPw"
							name="uPw" class="form-control" placeholder="Password" style="margin-top: 10px;" /><br>
						<button id="signin" class="btn btn-lg btn-primary btn-block"
							type="button" style="background-color: #fe4c50;">Sign in</button>
					</form>
					</div>
				</div>
			</div>
		</div>

		<jsp:include page="Footer.jsp" />

	</div>
	<script src="../resources/js/jquery-3.2.1.min.js"></script>
	<script src="../resources/styles/bootstrap4/popper.js"></script>
	<script src="../resources/styles/bootstrap4/bootstrap.min.js"></script>
	<script src="../resources/plugins/Isotope/isotope.pkgd.min.js"></script>
	<script src="../resources/plugins/OwlCarousel2-2.2.1/owl.carousel.js"></script>
	<script src="../resources/plugins/easing/easing.js"></script>
	<script src="../resources/js/custom.js"></script>
	<script type="text/javascript">
	$(document).ready(function(){
		<% String msg = (String)request.getAttribute("msg");
		if(msg==null)msg="";%>
		if("<%=msg%>"!=""){
			alert("<%=msg%>");
		}
	});
	$("#signin").on('click', (function() {
		if($("#uId").val()==""){
			alert("ID cannot be null.");
		}else if($("#uPw").val()==""){
			alert("PW cannot be null.");
		}else{
			var form = $("#loginForm");
			form.submit();
		}
		
	}));
	</script>
</body>
</html>