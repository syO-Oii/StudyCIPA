<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>롯데자이언츠 선수 관리</title>
</head>
<body>
<h1>롯데자이언츠 관리자 페이지</h1>
<a href = "Main.jsp">목록으로 돌아가기</a>
<% 
String driver = "oracle.jdbc.driver.OracleDriver";
String url = "jdbc:oracle:thin:@localhost:1521:xe";
Class.forName(driver);	// 오라클 연결
Connection conn = DriverManager.getConnection(url, "manage", "rlaxogud");	// 오라클 접속
String sql = "delete from player where bnum = ?";
PreparedStatement pstmt = conn.prepareStatement(sql);
pstmt.setString(1, request.getParameter("bnum"));
pstmt.executeUpdate();
%>
</body>
</html>