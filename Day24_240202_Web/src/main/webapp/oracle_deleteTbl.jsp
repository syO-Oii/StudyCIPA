<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.mysql.cj.xdevapi.PreparableStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 관리 테이블 생성</title>
</head>
<body>
<a href = "oracle_index.jsp">초기 화면으로 돌아가기</a><br/>
<%
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe?useUnicode=true&characterEncoding=UTF-8";
    Class.forName(driver);
    try ( 
        Connection conn = DriverManager.getConnection(
        		url, "scott", "tiger");
    ) {
    	String sql = 
                "drop table score";
    	PreparedStatement pstmt = conn.prepareStatement(sql);
    	pstmt.executeUpdate();
        out.println("\n성적 테이블 삭제 성공 !");      
        
    } catch(Exception e) {
        e.printStackTrace();
    }
%>

</body>
</html>