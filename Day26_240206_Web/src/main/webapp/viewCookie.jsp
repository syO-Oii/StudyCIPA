<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	// 클라이언트 쪽에 저장되어있는 쿠키 정보를 가져오기
	Cookie cookie[] = request.getCookies();

	
	// 쿠키 값이 없을 때를 대비하여 조건문 생성
	if(cookie != null){
		out.print("쿠키의 개수 : " + cookie.length + "<br/>");
		for(Cookie co : cookie){
			out.print("이름 : " + co.getName() + " / 값 : " + co.getValue() + "<br/>");
		}	
	}
	

%>
</body>
</html>