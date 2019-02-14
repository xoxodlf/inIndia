<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>TI Shop</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="Colo Shop Template">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="../resources/styles/bootstrap4/bootstrap.min.css">
<link href="../resources/plugins/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="../resources/plugins/OwlCarousel2-2.2.1/owl.carousel.css">
<link rel="stylesheet" type="text/css" href="../resources/plugins/OwlCarousel2-2.2.1/owl.theme.default.css">
<link rel="stylesheet" type="text/css" href="../resources/plugins/OwlCarousel2-2.2.1/animate.css">
<link rel="stylesheet" type="text/css" href="../resources/styles/main_styles.css">
<link rel="stylesheet" type="text/css" href="../resources/styles/responsive.css">
</head>

<body>

<div class="super_container">

	<!-- Header -->

	<jsp:include page="Header.jsp" />

	<!-- Slider -->

	<div class="main_slider" style="background-image:url(../resources/images/slider_1.jpg)">
		<div class="container fill_height">
			<div class="row align-items-center fill_height">
				<div class="col">
					<div class="main_slider_content">
						<h6>Spring / Summer Collection 2017</h6>
						<h1>Get up to 30% Off New Arrivals</h1>
						<div class="red_button shop_now_button"><a href="#">shop now</a></div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Banner -->

	<div class="banner">
		<div class="container">
			<div class="row">
				<div class="col-md-4">
					<div class="banner_item align-items-center" style="background-image:url(../resources/images/banner_1.jpg)">
						<div class="banner_category">
							<a href="categories.jsp">women's</a>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="banner_item align-items-center" style="background-image:url(../resources/images/banner_2.jpg)">
						<div class="banner_category">
							<a href="categories.jsp">accessories's</a>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="banner_item align-items-center" style="background-image:url(../resources/images/banner_3.jpg)">
						<div class="banner_category">
							<a href="categories.jsp">men's</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Deal of the week -->

	<div class="deal_ofthe_week">
		<div class="container">
			<div class="row align-items-center">
				<div class="col-lg-6">
					<div class="deal_ofthe_week_img">
						<img src="../resources/images/deal_ofthe_week.png" alt="">
					</div>
				</div>
				<div class="col-lg-6 text-right deal_ofthe_week_col">
					<div class="deal_ofthe_week_content d-flex flex-column align-items-center float-right">
						<div class="section_title">
							<h2>Deal Of The Week</h2>
						</div>
						<ul class="timer">
							<li class="d-inline-flex flex-column justify-content-center align-items-center">
								<div id="day" class="timer_num">03</div>
								<div class="timer_unit">Day</div>
							</li>
							<li class="d-inline-flex flex-column justify-content-center align-items-center">
								<div id="hour" class="timer_num">15</div>
								<div class="timer_unit">Hours</div>
							</li>
							<li class="d-inline-flex flex-column justify-content-center align-items-center">
								<div id="minute" class="timer_num">45</div>
								<div class="timer_unit">Mins</div>
							</li>
							<li class="d-inline-flex flex-column justify-content-center align-items-center">
								<div id="second" class="timer_num">23</div>
								<div class="timer_unit">Sec</div>
							</li>
						</ul>
						<div class="red_button deal_ofthe_week_button"><a href="#">shop now</a></div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Best Sellers -->

	<div class="best_sellers">
		<div class="container">
			<div class="row">
				<div class="col text-center">
					<div class="section_title new_arrivals_title">
						<h2>Best Sellers</h2>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<div class="product_slider_container">
						<div class="owl-carousel owl-theme product_slider">

							<!-- Slide 1 -->

							<div class="owl-item product_slider_item">
								<div class="product-item">
									<div class="product discount">
										<div class="product_image">
											<img src="../resources/images/product_1.png" alt="">
										</div>
										<div class="favorite favorite_left"></div>
										<div class="product_bubble product_bubble_right product_bubble_red d-flex flex-column align-items-center"><span>-$20</span></div>
										<div class="product_info">
											<h6 class="product_name"><a href="single.html">Fujifilm X100T 16 MP Digital Camera (Silver)</a></h6>
											<div class="product_price">$520.00<span>$590.00</span></div>
										</div>
									</div>
								</div>
							</div>

							<!-- Slide 2 -->

							<div class="owl-item product_slider_item">
								<div class="product-item women">
									<div class="product">
										<div class="product_image">
											<img src="../resources/images/product_2.png" alt="">
										</div>
										<div class="favorite"></div>
										<div class="product_bubble product_bubble_left product_bubble_green d-flex flex-column align-items-center"><span>new</span></div>
										<div class="product_info">
											<h6 class="product_name"><a href="single.html">Samsung CF591 Series Curved 27-Inch FHD Monitor</a></h6>
											<div class="product_price">$610.00</div>
										</div>
									</div>
								</div>
							</div>

							<!-- Slide 3 -->

							<div class="owl-item product_slider_item">
								<div class="product-item women">
									<div class="product">
										<div class="product_image">
											<img src="../resources/images/product_3.png" alt="">
										</div>
										<div class="favorite"></div>
										<div class="product_info">
											<h6 class="product_name"><a href="single.html">Blue Yeti USB Microphone Blackout Edition</a></h6>
											<div class="product_price">$120.00</div>
										</div>
									</div>
								</div>
							</div>

							<!-- Slide 4 -->

							<div class="owl-item product_slider_item">
								<div class="product-item accessories">
									<div class="product">
										<div class="product_image">
											<img src="../resources/images/product_4.png" alt="">
										</div>
										<div class="product_bubble product_bubble_right product_bubble_red d-flex flex-column align-items-center"><span>sale</span></div>
										<div class="favorite favorite_left"></div>
										<div class="product_info">
											<h6 class="product_name"><a href="single.html">DYMO LabelWriter 450 Turbo Thermal Label Printer</a></h6>
											<div class="product_price">$410.00</div>
										</div>
									</div>
								</div>
							</div>

							<!-- Slide 5 -->

							<div class="owl-item product_slider_item">
								<div class="product-item women men">
									<div class="product">
										<div class="product_image">
											<img src="../resources/images/product_5.png" alt="">
										</div>
										<div class="favorite"></div>
										<div class="product_info">
											<h6 class="product_name"><a href="single.html">Pryma Headphones, Rose Gold & Grey</a></h6>
											<div class="product_price">$180.00</div>
										</div>
									</div>
								</div>
							</div>

							<!-- Slide 6 -->

							<div class="owl-item product_slider_item">
								<div class="product-item accessories">
									<div class="product discount">
										<div class="product_image">
											<img src="../resources/images/product_6.png" alt="">
										</div>
										<div class="favorite favorite_left"></div>
										<div class="product_bubble product_bubble_right product_bubble_red d-flex flex-column align-items-center"><span>-$20</span></div>
										<div class="product_info">
											<h6 class="product_name"><a href="single.html">Fujifilm X100T 16 MP Digital Camera (Silver)</a></h6>
											<div class="product_price">$520.00<span>$590.00</span></div>
										</div>
									</div>
								</div>
							</div>

							<!-- Slide 7 -->

							<div class="owl-item product_slider_item">
								<div class="product-item women">
									<div class="product">
										<div class="product_image">
											<img src="../resources/images/product_7.png" alt="">
										</div>
										<div class="favorite"></div>
										<div class="product_info">
											<h6 class="product_name"><a href="single.html">Samsung CF591 Series Curved 27-Inch FHD Monitor</a></h6>
											<div class="product_price">$610.00</div>
										</div>
									</div>
								</div>
							</div>

							<!-- Slide 8 -->

							<div class="owl-item product_slider_item">
								<div class="product-item accessories">
									<div class="product">
										<div class="product_image">
											<img src="../resources/images/product_8.png" alt="">
										</div>
										<div class="favorite"></div>
										<div class="product_info">
											<h6 class="product_name"><a href="single.html">Blue Yeti USB Microphone Blackout Edition</a></h6>
											<div class="product_price">$120.00</div>
										</div>
									</div>
								</div>
							</div>

							<!-- Slide 9 -->

							<div class="owl-item product_slider_item">
								<div class="product-item men">
									<div class="product">
										<div class="product_image">
											<img src="../resources/images/product_9.png" alt="">
										</div>
										<div class="product_bubble product_bubble_right product_bubble_red d-flex flex-column align-items-center"><span>sale</span></div>
										<div class="favorite favorite_left"></div>
										<div class="product_info">
											<h6 class="product_name"><a href="single.html">DYMO LabelWriter 450 Turbo Thermal Label Printer</a></h6>
											<div class="product_price">$410.00</div>
										</div>
									</div>
								</div>
							</div>

							<!-- Slide 10 -->

							<div class="owl-item product_slider_item">
								<div class="product-item men">
									<div class="product">
										<div class="product_image">
											<img src="../resources/images/product_10.png" alt="">
										</div>
										<div class="favorite"></div>
										<div class="product_info">
											<h6 class="product_name"><a href="single.html">Pryma Headphones, Rose Gold & Grey</a></h6>
											<div class="product_price">$180.00</div>
										</div>
									</div>
								</div>
							</div>
						</div>

						<!-- Slider Navigation -->

						<div class="product_slider_nav_left product_slider_nav d-flex align-items-center justify-content-center flex-column">
							<i class="fa fa-chevron-left" aria-hidden="true"></i>
						</div>
						<div class="product_slider_nav_right product_slider_nav d-flex align-items-center justify-content-center flex-column">
							<i class="fa fa-chevron-right" aria-hidden="true"></i>
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
<script src="../resources/js/custom.js"></script>
</body>

</html>
