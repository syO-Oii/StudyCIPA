<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>롯데자이언츠 선수 관리</title>
<link rel="stylesheet"href="style/readPlayer.css">
</head>
<body>
<h1>롯데자이언츠 관리자 페이지</h1>

<a href = "Main.jsp">목록으로 돌아가기</a>
<%
request.setCharacterEncoding("utf-8");	// 다른곳에서 넘어오는 값들을 utf-8로 처리하기
String driver = "oracle.jdbc.driver.OracleDriver";
String url = "jdbc:oracle:thin:@localhost:1521:xe";
Class.forName(driver);	// 오라클 연결
Connection conn = DriverManager.getConnection(url, "manager", "rlaxogud");	// 오라클 접속
String sql = "select name, pos, dpos, bnum, sal from player";
PreparedStatement pstmt = conn.prepareStatement(sql);	// 명령 실행
ResultSet rs = pstmt.executeQuery();%>
<table border="1"> <tr>
		<td>이름</td>
		<td>투/타</td>
		<td>포지션</td>
		<td>등번호</td>
		<td>연봉</td>
		</tr>
<%
	while(rs.next()){ %>
	<tr>
		<td><%=rs.getString("name") %></td>
		<td><%=rs.getString("pos") %></td>
		<td><%=rs.getString("dpos") %></td>
		<td><%=rs.getString("bnum") %></td>
		<td><%=rs.getString("sal") %></td>
	</tr>
<% } %>
</table>

</body>
</html>