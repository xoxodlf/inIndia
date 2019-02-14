<%@page import="dto.BasketDAO"%>
<%@page import="dto.UserDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% 
    int cnt=0;
    if(session.getAttribute("user")!=null){
    	BasketDAO hdao = new BasketDAO();
        cnt = hdao.getCnt(((UserDTO)session.getAttribute("user")).getUserNo());
    }
    %>
<header class="header trans_300">

		<!-- Top Navigation -->

		<div class="top_nav">
			<div class="container">
				<div class="row">
					<div class="col-md-6">
						<div class="top_nav_left">free shipping on all u.s orders over $50</div>
					</div>
					<div class="col-md-6 text-right">
						<div class="top_nav_right">
							<ul class="top_nav_menu">

								<!-- Currency / Language / My Account -->

								<li class="currency">
									<a href="#">
										usd
										<i class="fa fa-angle-down"></i>
									</a>
									<ul class="currency_selection">
										<li><a href="#">cad</a></li>
										<li><a href="#">aud</a></li>
										<li><a href="#">eur</a></li>
										<li><a href="#">gbp</a></li>
									</ul>
								</li>
								<li class="language">
									<a href="#">
										English
										<i class="fa fa-angle-down"></i>
									</a>
									<ul class="language_selection">
										<li><a href="#">French</a></li>
										<li><a href="#">Italian</a></li>
										<li><a href="#">German</a></li>
										<li><a href="#">Spanish</a></li>
									</ul>
								</li>
								<li class="account">
									<a href="#">
										My Account
										<i class="fa fa-angle-down"></i>
									</a>
									<ul class="account_selection">
									<%if(session.getAttribute("user")==null){%>
										<li><a href="/NIKE/view/signin.jsp"><i class="fa fa-sign-in" aria-hidden="true"></i>Sign In</a></li>
										<li><a href="/NIKE/view/signup.jsp"><i class="fa fa-user-plus" aria-hidden="true"></i>Register</a></li>
									<%}else { %>
										<li>Hello! <%=((UserDTO)session.getAttribute("user")).getId() %></li>
										<li><a href="/NIKE/view/logout.jsp">Log-out</a></li>
									<%} %>
									</ul>
								</li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>

		<!-- Main Navigation -->

		<div class="main_nav_container">
			<div class="container">
				<div class="row">
					<div class="col-lg-12 text-right">
						<div class="logo_container">
							<a href="#">TI<span>shop</span></a>
						</div>
						<nav class="navbar">
							<ul class="navbar_menu">
								<li><a href="index.jsp">home</a></li>
								<li><a href="categories.jsp">shop</a></li>
								<li><a href="contact.jsp">contact</a></li>
							</ul>
							<ul class="navbar_user">
								<li><a href="#"><i class="fa fa-search" aria-hidden="true"></i></a></li>
								<%if(session.getAttribute("user")!=null){%>
									<li><a href="orderList.jsp"><i class="fa fa-user" aria-hidden="true"></i></a></li>
								<%} %>
								<li class="checkout">
								<%if(session.getAttribute("user")==null){%>
									<a href="#">
										<i class="fa fa-shopping-cart" aria-hidden="true"></i>
									
										<span id="checkout_items" class="checkout_items"></span>
									
										<span id="checkout_items" class="checkout_items"><%=cnt %></span>
								
										
									</a>
									<%}else { %>
									<a href="cart.jsp">
										<i class="fa fa-shopping-cart" aria-hidden="true"></i>
									
										<span id="checkout_items" class="checkout_items"></span>
									
										<span id="checkout_items" class="checkout_items"><%=cnt %></span>
								
										
									</a>
									<%} %>
								</li>
							</ul>
							<div class="hamburger_container">
								<i class="fa fa-bars" aria-hidden="true"></i>
							</div>
						</nav>
					</div>
				</div>
			</div>
		</div>

	</header>

	<div class="fs_menu_overlay"></div>

	<!-- Hamburger Menu -->

	<div class="hamburger_menu">
		<div class="hamburger_close"><i class="fa fa-times" aria-hidden="true"></i></div>
		<div class="hamburger_menu_content text-right">
			<ul class="menu_top_nav">
				<li class="menu_item has-children">
					<a href="#">
						usd
						<i class="fa fa-angle-down"></i>
					</a>
					<ul class="menu_selection">
						<li><a href="#">cad</a></li>
						<li><a href="#">aud</a></li>
						<li><a href="#">eur</a></li>
						<li><a href="#">gbp</a></li>
					</ul>
				</li>
				<li class="menu_item has-children">
					<a href="#">
						English
						<i class="fa fa-angle-down"></i>
					</a>
					<ul class="menu_selection">
						<li><a href="#">French</a></li>
						<li><a href="#">Italian</a></li>
						<li><a href="#">German</a></li>
						<li><a href="#">Spanish</a></li>
					</ul>
				</li>
				<li class="menu_item has-children">
					<a href="#">
						My Account
						<i class="fa fa-angle-down"></i>
					</a>
					<ul class="menu_selection">
						<li><a href="#"><i class="fa fa-sign-in" aria-hidden="true"></i>Sign In</a></li>
						<li><a href="#"><i class="fa fa-user-plus" aria-hidden="true"></i>Register</a></li>
					</ul>
				</li>
				<li class="menu_item"><a href="#">home</a></li>
				<li class="menu_item"><a href="#">shop</a></li>
				<li class="menu_item"><a href="#">promotion</a></li>
				<li class="menu_item"><a href="#">pages</a></li>
				<li class="menu_item"><a href="#">blog</a></li>
				<li class="menu_item"><a href="#">contact</a></li>
			</ul>
		</div>
	</div>