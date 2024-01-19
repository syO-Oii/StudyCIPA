<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%-- JSP에서 함수(메서드)를 정의하는 방법 --%>
	<%!
		public int square(int num){
			return num * num;
		}
	%>
	
	<%-- 함수(메서드) 호출 --%>
	<% int result = square(5); %>

	<%-- 결과값 출력 --%>
	<h1>계산 결과 : <%=result %> </h1>
</body>
</html>