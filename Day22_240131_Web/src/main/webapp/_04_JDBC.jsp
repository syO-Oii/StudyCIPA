<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
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
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/firm";	// 데이터베이스 위치 확인
		String user = "root";								// 유저 정보(id)
		String password = "mysql";	
		Connection conn = DriverManager.getConnection(url, user, password);
		Statement stmt = conn.createStatement();
		
	%>
</body>
</html>