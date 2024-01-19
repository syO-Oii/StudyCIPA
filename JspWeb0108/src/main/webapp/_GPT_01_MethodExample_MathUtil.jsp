<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="JspWeb0108.MathUtil" %>
<html>
<head>
<meta charset="UTF-8">
<title>Method Example</title>
</head>
<body>
	<%-- 메소드 호출하기 --%>
	<%
		int addResult = MathUtil.add(5, 3);
    	int minResult = MathUtil.min(10, 4);
    	int multyResult = MathUtil.multy(6, 7);
    	int divResult = MathUtil.div(15, 3);
    %>
    
    <h1>더하기 : <%=addResult %></h1>
    <h2>빼기 : <%=minResult %></h2>
    <h3>곱하기 : <%=multyResult %></h3>
    <h4>나누기 : <%=divResult %></h4>

</body>
</html>