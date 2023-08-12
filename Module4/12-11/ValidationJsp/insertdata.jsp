<%@page import="com.dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:useBean id="m" class="com.model.Model"/>
	<jsp:setProperty property="*" name="m"/>
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
     
    
    int status=Dao.savedata(m);
    
    if(status>0)
    
	{
		//out.print("Success");
		response.sendRedirect("viewdata.jsp");
	}
	else
	{
		out.print("Fail");
	}
    

	
	%>
	




</body>
</html>