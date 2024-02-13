<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>관리자 페이지 로그인<br/></h1>

<form action="<%= request.getContextPath() %>/login/sessionLogin.jsp"
      method="post">
아이디 <input type="text" name="id" size="10">
암호 <input type="text" name="password" size="10">
<input type="submit" value="로그인">
</form>
</body>
</html>