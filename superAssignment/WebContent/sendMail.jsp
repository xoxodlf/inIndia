<%@page import="javax.mail.Session"%>
<%@page import="superAssignment.SMTPAuthenticator"%>
<%@page import="superAssignment.User"%>
<%@page import="superAssignment.UserDAO"%>
<%@page import="javax.mail.Transport"%>
<%@page import="javax.mail.Message"%>
<%@page import="javax.mail.Address"%>
<%@page import="javax.mail.internet.InternetAddress"%>
<%@page import="javax.mail.internet.MimeMessage"%>
<%@page import="javax.mail.Authenticator"%>
<%@page import="java.util.Properties"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
	<%
		UserDAO dao = new UserDAO();
		User user = dao.findPassword((String) request.getParameter("emailId"), (String) request.getParameter("q1"), (String) request.getParameter("q2"), (String) request.getParameter("q3"));
		if(user==null){
			request.setAttribute("msg", "Please Check Email ID, Q1, Q2 and Q3");
			RequestDispatcher rd = request.getRequestDispatcher("findPassword.jsp");
			rd.forward(request, response);
		}else{
			request.setCharacterEncoding("utf-8");
			String from = "xoxodlf@naver.com";
			String to = user.getEmailId();
			String subject = "Your Password";
			String content = user.getPassword();
			 
			Properties p = new Properties(); // 정보를 담을 객체
			 
			p.put("mail.smtp.host","smtp.naver.com");
			 
			p.put("mail.smtp.port", "465");
			p.put("mail.smtp.starttls.enable", "true");
			p.put("mail.smtp.auth", "true");
			p.put("mail.smtp.debug", "true");
			p.put("mail.smtp.socketFactory.port", "465");
			p.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			p.put("mail.smtp.socketFactory.fallback", "false");
			 
			try{
			    Authenticator auth = new SMTPAuthenticator();
			    Session ses = Session.getInstance(p, auth);
			     
			    ses.setDebug(true);
			     
			    MimeMessage msg = new MimeMessage(ses);
			    msg.setSubject(subject); 
			     
			    Address fromAddr = new InternetAddress(from);
			    msg.setFrom(fromAddr);
			     
			    Address toAddr = new InternetAddress(to);
			    msg.addRecipient(Message.RecipientType.TO, toAddr); // 받는 사람
			     
			    msg.setContent(content, "text/html;charset=UTF-8"); // 내용과 인코딩
			     
			    Transport.send(msg); // 전송
			} catch(Exception e){
			    e.printStackTrace();
			    out.println("<script>alert('Send Mail Failed..');history.back();</script>");
			    // 오류 발생시 뒤로 돌아가도록
			    return;
			}
			request.setAttribute("msg", "Send Mail Success");
			RequestDispatcher rd = request.getRequestDispatcher("loginForm.jsp");
			rd.forward(request, response);

		}
	%>
</body>
</html>