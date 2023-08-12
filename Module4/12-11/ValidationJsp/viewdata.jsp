<%@page import="com.dao.Dao"%>
<%@page import="java.util.List"%>
<%@page import="com.model.Model"%>
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
	List<Model> list=Dao.viewdata();
	
	out.print("<table border='5'>");
	out.print("<tr><th>Id</th><th>Name</th><th>Surname</th><th>Number</th><th>Email ID</th><th>Password</th></tr>");
	for(Model m:list) 
	{
		out.print("<tr><td>"+m.getId()+"</td><td>"+m.getFname()+"</td><td>"+m.getLname()+"</td><td>"+m.getEmail()+"</td><td>"+m.getMobile()+"</td><td>"+m.getPass()+"</td></tr>");
		
	}
	out.print("</table>");
	out.print("<a href='index.jsp'>Add Data</a>");
	

	
	%>


</body>
</html>