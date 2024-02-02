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
<a href = "oracle_index.jsp">초기 화면으로 돌아가기</a><br/>
<form action="oracle_update.jsp" method="post">
이름<input type="text" name = "name" /><br/>
국어<input type="text" name = "kor" /><br/>
영어<input type="text" name = "eng" /><br/>
수학<input type="text" name = "math" /><br/>
<input type = "submit" value = "수정하기" />
<input type = "reset" value = "초기화" />
</form>
</body>
</html>