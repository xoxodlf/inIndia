<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>signup</title>
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
					<div class="col-md-6 col-md-offset-3" style="width: 40%; text-align: center; margin-left: 30%;">
						<form role="form" id="signupForm" action="/NIKE/view/insertUsr.jsp"
							method="post">
							<div class="form-group">
								<label for="username">ID</label> <input type="text"
									class="form-control" name="uId" id="uID" placeholder="ID">
							</div>
							
							<div class="form-group">
								<label for="InputPassword1">Password</label> <input type="password"
									class="form-control" name="uPw" id="uPW" placeholder="Password">
							</div>
							<div class="form-group">
								<label for="InputPassword2">Password Check</label> <input
									type="password" class="form-control" name="uPw2" id="uPW2"
									placeholder="Password Check">
							</div>
							<div class="form-group">
								<label for="username">Name</label> <input type="text"
									class="form-control" name="uName" id="uName"
									placeholder="Name">
							</div>
							<div class="form-group text-center">
								<button id="signup" type="button" class="btn btn-info">
									Submit<i class="fa fa-check spaceLeft"></i>
								</button>
							</div>
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
	$("#signup").on('click', (function() {
		if($("#uId").val()==""){
			alert("ID cannot be empty.");
		}else if($("#uPW").val()==""){
			alert("Password cannot be empty.");
		}else if($("#uPW").val()!=$("#uPW2").val()){
			alert("Please check password.");
		}else if($("#uName").val()==""){
			alert("Name cannot be empty.");
		}else{
			var form = $("#signupForm");
			form.submit();
		}
		
	}));
	</script>
</body>
</html>