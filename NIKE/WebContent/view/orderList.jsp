<%@page import="dto.OrderDTO"%>
<%@page import="dto.OrderDAO"%>
<%@page import="dto.UserDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Order List</title>
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
	href="../resources/styles/categories_styles.css">
<link rel="stylesheet" type="text/css"
	href="../resources/styles/categories_responsive.css">
<style type="text/css">
.plus,
.minus
{
	padding-left: 14px;
	padding-right: 14px;
	cursor: pointer;
}
.plus:hover,
.minus:hover
{
	color: #b5aec4;
}
</style>
</head>
<body>
<%
	OrderDAO dao = new OrderDAO();
	List<OrderDTO> list = dao.listAll(((UserDTO)session.getAttribute("user")).getUserNo());
%>
	<div class="super_container">

		<!-- Header -->

		<jsp:include page="Header.jsp" />

		<div class="container product_section_container">
			<div class="row">
				<div class="col product_section clearfix">
					<div class="product-grid" style="text-align: center;">
					<h4>Ordered List</h4>
									<%for(int i=0;i<list.size();i++){ %>
									<div>
										<div style="width: 100%;">
											<div class="product-item men" style="width: 40%;  display: inline-block;height: auto;">
												<div class="product discount product_filter" style="border-right: 1px solid rgb(233, 233, 233);height:100%;">
													<div class="product_image" style=" height: auto;">
														<img src="<%=list.get(i).getImage()%>" alt="">
													</div>
													<div class="favorite favorite_left"></div>
												</div>
											</div>
											<div style="width:58%; display: inline-block;">
												<div class="product_info">
														<input type="hidden" id="one<%=i%>" value="<%=list.get(i).getPrice()%>"/>
														<h6 class="product_name" style="margin-top: 0;"><%=list.get(i).getName()%></h6>
														<h6 class="product_name" style="margin-top: 10px;">RS. <%=list.get(i).getPrice()%></h6>
														<h6 class="product_name" style="margin-top: 10px;">Quantity : <%=list.get(i).getQuantity()%></h6>
														<br><br>
														<h6 class="product_name" style="margin-top: 10px;">Total : RS. <span id="amount<%=i%>"><%=list.get(i).getPrice()*list.get(i).getQuantity()%></span></h6>
														<h6 class="product_name" style="margin-top: 10px;"><%=list.get(i).getRegdate()%></h6>
													
												</div>
											</div>
										</div>
									</div>
									<%} %>
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
	var size = <%=list.size()%>;
	
	</script>
</body>
</html>