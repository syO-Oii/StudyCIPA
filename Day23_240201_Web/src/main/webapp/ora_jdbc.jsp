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


<%
request.setCharacterEncoding("utf-8");	// 다른곳에서 넘어오는 값들을 utf-8로 처리하기
String driver = "oracle.jdbc.driver.OracleDriver";
String url = "jdbc:oracle:thin:@localhost:1521:xe";
Class.forName(driver);	// 오라클 연결
Connection conn = DriverManager.getConnection(url, "scott", "tiger");	// 오라클 접속
// String sql = "create table emp1 as select ename, job, sal from emp";	// 실행문 저장
String sql = "insert into emp1(ename, job, sal) values(?, ?, ?)";
PreparedStatement pstmt = conn.prepareStatement(sql);	// 명령 실행
pstmt.setString(1, request.getParameter("ename"));
pstmt.setString(2, request.getParameter("job"));
pstmt.setDouble(3, Double.parseDouble(request.getParameter("sal")));
int result = pstmt.executeUpdate();
if(result == 1) {
	out.println("입력 성공!");
}
%>
접속 완료! <br/>
emp1 테이블 생성 완료~!!!

</body>
</html>