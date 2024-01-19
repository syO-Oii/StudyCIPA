<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="JspWeb0108.Student"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%	// Student 클래스의 static 배열에 접근
    for (int i = 0; i < Student.Student.length; i++) {
%>
    <%= Student.Student[i] %><br>
<%
    }
%>
</body>
</html>