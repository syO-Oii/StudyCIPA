<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href = "oracle_index.jsp">초기 화면으로 돌아가기</a><br/>
	<%
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe?useUnicode=true&characterEncoding=UTF-8";
		Class.forName(driver);
    try ( Connection conn = DriverManager.getConnection(url, "scott", "tiger")
    ) {
            String sql = "insert into score(num, name, kor, eng, math) values(?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            
            pstmt.setInt(1, Integer.parseInt(request.getParameter("num")));
            pstmt.setString(2, request.getParameter("name"));
            pstmt.setInt(3, Integer.parseInt(request.getParameter("kor")));
            pstmt.setInt(4, Integer.parseInt(request.getParameter("eng")));
            pstmt.setInt(5, Integer.parseInt(request.getParameter("math")));
            
            pstmt.executeUpdate();   
    } catch(Exception e) {
        e.printStackTrace();
    }
%>
</body>
</html>