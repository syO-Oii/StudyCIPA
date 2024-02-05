<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선수 타격지표 입력</title>
</head>
<body>
<a href = "oracle_index.jsp">초기 화면으로 돌아가기</a><br/>
<h1>선수 타격지표 입력</h1>
<form action="oracle_insert.jsp" method="post">
<table>
	<tr><td>
		고유번호<input type="text" name = "pnum" /><br/>
		1루타<input type="text" name = "single" /><br/>
		2루타<input type="text" name = "double" /><br/>
		3루타<input type="text" name = "triple" /><br/>
		아웃<input type="text" name = "out" /><br/>
		<input type = "submit" value = "등록하기" />
		<input type = "reset" value = "초기화" />
	</td></tr>
</table>
</form>
</body>
</html>