<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href = "index.jsp">초기 화면으로 돌아가기</a>
<%
	request.setCharacterEncoding("utf-8");
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	Class.forName(driver);
	try(
		Connection conn = DriverManager.getConnection(url, "scott", "tiger");
	){
		String sql = "update score set kor = ?, eng = ?, math = ? where name = ?";
		try(PreparedStatement pstmt = conn.prepareStatement(sql);){
			pstmt.setString(1, request.getParameter("kor"));
			pstmt.setString(2, request.getParameter("eng"));
			pstmt.setString(3, request.getParameter("math"));
			pstmt.setString(4, request.getParameter("name"));
			int result = pstmt.executeUpdate();
			response.sendRedirect("index.jsp");
			
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
%>

</body>
</html>