<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%-- syO_Oii 라는 index 내의 값을 받아서 str에 저장 --%>
    <%
    String str = request.getParameter("syO_Oii");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=str %>
<%
for(int i = 1 ; i < 10 ; i++){
%>
		<h1> <%=str %> * <%=i %> = <%=i * Integer.parseInt(str) %>	</h1>
<% } %>
</body>
</html>