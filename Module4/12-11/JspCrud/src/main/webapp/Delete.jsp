<%@page import="com.Dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

String myid=request.getParameter("id");
int newid=Integer.parseInt(myid);
UserDao.deleteData(newid);
response.sendRedirect("View.jsp");


%>
</body>
</html>