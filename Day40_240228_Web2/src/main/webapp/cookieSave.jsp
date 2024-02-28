<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String email = request.getParameter("email");
String ck = request.getParameter("ck");

if (ck != null && ck.equals("on")) {	// 체크가 켜졌을 때	
	Cookie cookie = new Cookie("email", email); // new Cookie (쿠키 이름, 변수)
	cookie.setMaxAge(60);		// -1 : 브라우저 종료 시 삭제, 그 외 초단위 입력
	response.addCookie(cookie);
} else {	// 체크가 꺼졌을 때
	Cookie cookie = new Cookie("email", email); 
	cookie.setMaxAge(0);		
	response.addCookie(cookie);
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>