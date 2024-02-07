<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%						//  이름,  값
	Cookie ck = new Cookie("loginId", "admin");
	ck.setMaxAge(60);	// 60초
	response.addCookie(ck);
%>

<%= ck.getName() %><br/>
<%= ck.getValue() %>

</body>
</html>