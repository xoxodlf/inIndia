<%@page import="java.util.List"%>
<%@page import="dto.ItemDAO"%>
<%@page import="dto.ItemDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>TI Shop Categories</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="Colo Shop Template">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="../resources/styles/bootstrap4/bootstrap.min.css">
<link href="../resources/plugins/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="../resources/plugins/OwlCarousel2-2.2.1/owl.carousel.css">
<link rel="stylesheet" type="text/css" href="../resources/plugins/OwlCarousel2-2.2.1/owl.theme.default.css">
<link rel="stylesheet" type="text/css" href="../resources/plugins/OwlCarousel2-2.2.1/animate.css">
<link rel="stylesheet" type="text/css" href="../resources/plugins/jquery-ui-1.12.1.custom/jquery-ui.css">
<link rel="stylesheet" type="text/css" href="../resources/styles/categories_styles.css">
<link rel="stylesheet" type="text/css" href="../resources/styles/categories_responsive.css">
</head>

<body>
<%
	ItemDAO dao = new ItemDAO();
	List<ItemDTO> list = dao.listAll();
%>
<div class="super_container">

	<!-- Header -->

	<jsp:include page="Header.jsp" />

	<div class="container product_section_container">
		<div class="row">
			<div class="col product_section clearfix">

				<!-- Breadcrumbs -->

				<div class="breadcrumbs d-flex flex-row align-items-center">
					<ul>
						<li><a href="index.jsp">Home</a></li>
						<li class="active"><a href="categories.jsp"><i class="fa fa-angle-right" aria-hidden="true"></i>Shop</a></li>
					</ul>
				</div>

				<!-- Sidebar -->

				<div class="sidebar">
					<div class="sidebar_section">
						<div class="sidebar_title">
							<h5>Product Category</h5>
						</div>
						<ul class="sidebar_categories">
							<li class="active"><a href="categories.jsp"><span><i class="fa fa-angle-double-right" aria-hidden="true"></i></span>Shop</a></li>
						</ul>
					</div>

					<!-- Price Range Filtering -->
					<div class="sidebar_section">
						<div class="sidebar_title">
							<h5>Filter by Price</h5>
						</div>
						<p>
							<input type="text" id="amount" readonly style="border:0; color:#f6931f; font-weight:bold;">
						</p>
						<div id="slider-range"></div>
						<div class="filter_button"><span>filter</span></div>
					</div>

					<!-- Sizes -->
					<div class="sidebar_section">
						<div class="sidebar_title">
							<h5>Sizes</h5>
						</div>
						<ul class="checkboxes">
							<li><i class="fa fa-square-o" aria-hidden="true"></i><span>S</span></li>
							<li class="active"><i class="fa fa-square" aria-hidden="true"></i><span>M</span></li>
							<li><i class="fa fa-square-o" aria-hidden="true"></i><span>L</span></li>
							<li><i class="fa fa-square-o" aria-hidden="true"></i><span>XL</span></li>
							<li><i class="fa fa-square-o" aria-hidden="true"></i><span>XXL</span></li>
						</ul>
					</div>

					<!-- Color -->
					<div class="sidebar_section">
						<div class="sidebar_title">
							<h5>Color</h5>
						</div>
						<ul class="checkboxes">
							<li><i class="fa fa-square-o" aria-hidden="true"></i><span>Black</span></li>
							<li class="active"><i class="fa fa-square" aria-hidden="true"></i><span>Pink</span></li>
							<li><i class="fa fa-square-o" aria-hidden="true"></i><span>White</span></li>
							<li><i class="fa fa-square-o" aria-hidden="true"></i><span>Blue</span></li>
							<li><i class="fa fa-square-o" aria-hidden="true"></i><span>Orange</span></li>
							<li><i class="fa fa-square-o" aria-hidden="true"></i><span>White</span></li>
							<li><i class="fa fa-square-o" aria-hidden="true"></i><span>Blue</span></li>
							<li><i class="fa fa-square-o" aria-hidden="true"></i><span>Orange</span></li>
							<li><i class="fa fa-square-o" aria-hidden="true"></i><span>White</span></li>
							<li><i class="fa fa-square-o" aria-hidden="true"></i><span>Blue</span></li>
							<li><i class="fa fa-square-o" aria-hidden="true"></i><span>Orange</span></li>
						</ul>
						<div class="show_more">
							<span><span>+</span>Show More</span>
						</div>
					</div>

				</div>

				<!-- Main Content -->

				<div class="main_content">

					<!-- Products -->

					<div class="products_iso">
						<div class="row">
							<div class="col">

								<!-- Product Sorting -->

								<div class="product_sorting_container product_sorting_container_top">
									<ul class="product_sorting">
										<li>
											<span class="type_sorting_text">Default Sorting</span>
											<i class="fa fa-angle-down"></i>
											<ul class="sorting_type">
												<li class="type_sorting_btn" data-isotope-option='{ "sortBy": "original-order" }'><span>Default Sorting</span></li>
												<li class="type_sorting_btn" data-isotope-option='{ "sortBy": "price" }'><span>Price</span></li>
												<li class="type_sorting_btn" data-isotope-option='{ "sortBy": "name" }'><span>Product Name</span></li>
											</ul>
										</li>
										<li>
											<span>Show</span>
											<span class="num_sorting_text">6</span>
											<i class="fa fa-angle-down"></i>
											<ul class="sorting_num">
												<li class="num_sorting_btn"><span>6</span></li>
												<li class="num_sorting_btn"><span>12</span></li>
												<li class="num_sorting_btn"><span>24</span></li>
											</ul>
										</li>
									</ul>
									<div class="pages d-flex flex-row align-items-center">
										<div class="page_current">
											<span>1</span>
											<ul class="page_selection">
												<li><a href="#">1</a></li>
												<li><a href="#">2</a></li>
												<li><a href="#">3</a></li>
											</ul>
										</div>
										<div class="page_total"><span>of</span> 3</div>
										<div id="next_page" class="page_next"><a href="#"><i class="fa fa-long-arrow-right" aria-hidden="true"></i></a></div>
									</div>

								</div>

								<!-- Product Grid -->

								<div class="product-grid">
									<%for(int i=0; i<list.size();i++){ %>
										<a href="/NIKE/view/single.jsp?itemNo=<%=list.get(i).getItemNo()%>">
										<div class="product-item men">
										<div class="product discount product_filter">
											<div class="product_image">
												<img src="<%=list.get(i).getImage()%>" alt="">
											</div>
											<div class="favorite favorite_left"></div>
											<div class="product_info">
												<h6 class="product_name"><%=list.get(i).getName()%></h6>
												<div class="product_price">RS.<%=list.get(i).getPrice()%></div>
											</div>
										</div>
										<div class="red_button add_to_cart_button"><a>Product details</a></div>
									</div>
									</a>
									<%} %>
								</div>

								<!-- Product Sorting -->

								<div class="product_sorting_container product_sorting_container_bottom clearfix">
									<ul class="product_sorting">
										<li>
											<span>Show:</span>
											<span class="num_sorting_text">04</span>
											<i class="fa fa-angle-down"></i>
											<ul class="sorting_num">
												<li class="num_sorting_btn"><span>01</span></li>
												<li class="num_sorting_btn"><span>02</span></li>
												<li class="num_sorting_btn"><span>03</span></li>
												<li class="num_sorting_btn"><span>04</span></li>
											</ul>
										</li>
									</ul>
									<span class="showing_results">Showing <%=list.size() %> results</span>
									<div class="pages d-flex flex-row align-items-center">
										<div class="page_current">
											<span>1</span>
											<ul class="page_selection">
												<li><a href="#">1</a></li>
												<li><a href="#">2</a></li>
												<li><a href="#">3</a></li>
											</ul>
										</div>
										<div class="page_total"><span>of</span> 3</div>
										<div id="next_page_1" class="page_next"><a href="#"><i class="fa fa-long-arrow-right" aria-hidden="true"></i></a></div>
									</div>

								</div>

							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Benefit -->

	<div class="benefit">
		<div class="container">
			<div class="row benefit_row">
				<div class="col-lg-3 benefit_col">
					<div class="benefit_item d-flex flex-row align-items-center">
						<div class="benefit_icon"><i class="fa fa-truck" aria-hidden="true"></i></div>
						<div class="benefit_content">
							<h6>free shipping</h6>
							<p>Suffered Alteration in Some Form</p>
						</div>
					</div>
				</div>
				<div class="col-lg-3 benefit_col">
					<div class="benefit_item d-flex flex-row align-items-center">
						<div class="benefit_icon"><i class="fa fa-money" aria-hidden="true"></i></div>
						<div class="benefit_content">
							<h6>cach on delivery</h6>
							<p>The Internet Tend To Repeat</p>
						</div>
					</div>
				</div>
				<div class="col-lg-3 benefit_col">
					<div class="benefit_item d-flex flex-row align-items-center">
						<div class="benefit_icon"><i class="fa fa-undo" aria-hidden="true"></i></div>
						<div class="benefit_content">
							<h6>45 days return</h6>
							<p>Making it Look Like Readable</p>
						</div>
					</div>
				</div>
				<div class="col-lg-3 benefit_col">
					<div class="benefit_item d-flex flex-row align-items-center">
						<div class="benefit_icon"><i class="fa fa-clock-o" aria-hidden="true"></i></div>
						<div class="benefit_content">
							<h6>opening all week</h6>
							<p>8AM - 09PM</p>
						</div>
					</div>
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
<script src="../resources/plugins/jquery-ui-1.12.1.custom/jquery-ui.js"></script>
<script src="../resources/js/categories_custom.js"></script>


</body>

</html>
