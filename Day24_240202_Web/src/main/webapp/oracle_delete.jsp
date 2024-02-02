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
<a href = "oracle_index.jsp">초기 화면으로 돌아가기</a>

<%
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe?useUnicode=true&characterEncoding=UTF-8";
	
	Class.forName(driver);
	try(
		Connection conn = DriverManager.getConnection(url, "scott", "tiger");
	){
		String sql = "delete from score where name = ?";
		try(PreparedStatement pstmt = conn.prepareStatement(sql);){
			pstmt.setString(1, request.getParameter("name"));
			int result = pstmt.executeUpdate();
			if (result == 1) {
				out.println("삭제 성공!");
			} else {
				out.println("삭제 실패");
			}
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
%>

</body>
</html>