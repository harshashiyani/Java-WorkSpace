<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
	String name=request.getParameter("fname");
    String fname=request.getParameter("lname");
    String email=request.getParameter("email");
    String mobile=request.getParameter("mobile");
    String gender=request.getParameter("gender");
    String pass=request.getParameter("pass");
    
    

	out.print("Your Firstname:"+name);
	
	out.print("<br>Your Lastname:"+fname);
	
	out.print("<br>Your Email id:"+email);
	
	out.print("<br>Your Mobile no:"+mobile);
	
	out.print("<br>Your Gender:"+gender);
	
	out.print("Your Password:"+pass);
	%>
	




</body>
</html>
