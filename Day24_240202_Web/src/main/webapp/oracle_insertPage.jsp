<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 정보 입력 페이지</title>
</head>
<body>
<a href = "oracle_index.jsp">초기 화면으로 돌아가기</a><br/>
<h1>학생 정보 입력하기</h1>
<form action="oracle_insert.jsp" method="post">
<table>
	<tr><td>
		학번<input type="text" name = "num" /><br/>
		이름<input type="text" name = "name" /><br/>
		국어<input type="text" name = "kor" /><br/>
		영어<input type="text" name = "eng" /><br/>
		수학<input type="text" name = "math" /><br/>
		<input type = "submit" value = "등록하기" />
		<input type = "reset" value = "초기화" />
	</td></tr>
</table>
</form>
</body>
</html>