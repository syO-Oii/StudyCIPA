<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선수 타격지표 입력</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<a href = "oracle_index.jsp">초기 화면으로 돌아가기</a><br/>
<h1>선수 타격지표 입력</h1>
<form action="oracle_insert.jsp" method="post">
<table>
	<tr>
		<tr><td>고유번호</td>	<td><input type="text" name = "pnum" />		</td></tr>
		<tr><td>1루타	</td>	<td><input type="text" name = "single" />	</td></tr>
		<tr><td>2루타	</td>	<td><input type="text" name = "double" />	</td></tr>
		<tr><td>3루타	</td>	<td><input type="text" name = "triple" />	</td></tr>
		<tr><td>아웃	</td>	<td><input type="text" name = "out" />		</td></tr>
		<td><input type = "submit" value = "등록하기" /></td>
		<td><input type = "reset" value = "초기화" /></td>
	</tr>
</table>
</form>
</body>
</html>