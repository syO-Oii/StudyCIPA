<%@page import="dto.Manager" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
p

	Manager member = new Manager("100", "hong@korea.com", "홍길동");
	request.setAttribute("mmm", member);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=member.getName() %><br/>
${mmm.name }
</body>
</html>