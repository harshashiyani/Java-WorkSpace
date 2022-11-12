<%@page import="com.Model.Model"%>
<%@page import="com.Dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="m" class="com.Model.Model"></jsp:useBean>
    <jsp:setProperty property="*" name="m"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
		
	
		 int status = UserDao.Updatedata(m);
		
		if(status>0)
		{
			response.sendRedirect("View.jsp");
		}
		else
		{
			response.sendRedirect("404.jsp");
		}
	 
	
	%>

</body>
</html>