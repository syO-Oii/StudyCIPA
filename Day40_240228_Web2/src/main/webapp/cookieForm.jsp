<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String email = null;
Cookie[] cookies = request.getCookies();

if(cookies != null){
	for(Cookie cookie : cookies) {
		if(cookie.getName().equals("email")) {
			email = cookie.getValue();
			break;
		}
	}
}

%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <form action="cookieSave.jsp">
        이메일:<input type="text" name="email" value = "<%=email %>"/>
        기억하기:<input type="checkbox" checked name="ck"/>
        <input type="submit" value="로그인" />
    </form>
</body>
</html>