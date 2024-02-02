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
<title>Insert title here</title>
</head>
<body>
<%-- 
* 오늘의 수업 내용
 - JDBC와 Oracle 연동하기
 
* 순서
 1. ojdbc.jar 최신버전 설치하기
 2. Dynamic Web Project 내의 lib에 넣기
 (위치 : src - main - webapp - WEB-INF - lib 폴더)
 
 3. 코드 작성 후 서버 세팅 : 해당 프로젝트만 서버 돌리는 작업
 (마우스 오른쪽 클릭 - Run as - Run on Server - Tomcat 선택 후 next
  - remove all)
  
  
 
 --%>
 
 <%--
 oracle에서는 사용자 이름을 '스키마' 라고 함
 
  --%>

<a href = "index.jsp">목록으로 돌아가기</a>
<%
request.setCharacterEncoding("utf-8");	// 다른곳에서 넘어오는 값들을 utf-8로 처리하기
String driver = "oracle.jdbc.driver.OracleDriver";
String url = "jdbc:oracle:thin:@localhost:1521:xe";
Class.forName(driver);	// 오라클 연결
Connection conn = DriverManager.getConnection(url, "scott", "tiger");	// 오라클 접속
String sql = "select ename, job, sal from emp1";
PreparedStatement pstmt = conn.prepareStatement(sql);	// 명령 실행
ResultSet rs = pstmt.executeQuery();%>
<table border="1">
<%
	while(rs.next()){ %>
	<tr>
		<td>
		<a href="updateForm.jsp?ename=<%=rs.getString("ename") %>">
		<%=rs.getString("ename") %></a></td>
		<td><%=rs.getString("job") %></td>
		<td><%=rs.getString("sal") %></td>
		<td><a href="delete.jsp?ename=<%=rs.getString("ename")%>">삭제</a></td>
	</tr>
<% } %>
</table>
</body>
</html>