<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- 데이터 설정 --%>
	<% String message = "Hey Receiver~~~!"; %>
	
	<%-- 다른 페이지로 데이터 전달 --%>
	<jsp:forward page = "_GPT_02_Receiver.jsp">
		<jsp:param name="message" value="<%= message %>"/>
	</jsp:forward>
</body>
</html>