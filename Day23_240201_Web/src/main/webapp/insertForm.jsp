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
<a href = "index.jsp">목록으로 돌아가기</a>

<form action="ora_jdbc.jsp">
이름<input type="text" name = "ename" /><br/>
직무<input type="text" name = "job" /><br/>
월급<input type="text" name = "sal" /><br/>
<input type = "submit" value = "확인" />
<input type = "reset" value = "초기화" />

</form>


</body>
</html>