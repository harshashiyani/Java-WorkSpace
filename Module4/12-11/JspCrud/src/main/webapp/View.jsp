<%@page import="com.Dao.UserDao"%>
<%@page import="com.Model.Model"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="index.html">Add Data</a>
	<table border="1">
	<tr>
	<th>ID</th>
	<th>First Name</th>
	<th>Last Name</th>
	<th>Email</th>
	<th>Password</th>
	<th>Update</th>
	<th>Delete</th>
	</tr>
	
	<%
	List<Model>list=UserDao.viewData();
	for(Model m:list)
	{
		
	%>
	<tr>
	<td><%=m.getId() %></td>
	<td><%=m.getFirst_name() %></td>
	<td><%=m.getLast_name() %></td>
	<td><%=m.getEmail() %></td>
	<td><%=m.getPassword() %></td>
	<td><a href="Update.jsp?id=<%=m.getId()%>">Update</a></td>
	<td><a href="Delete.jsp?id=<%=m.getId()%>">Delete</a></td>
	</tr>
	<%
	}
	%>
	
	</table>
</body>
</html>