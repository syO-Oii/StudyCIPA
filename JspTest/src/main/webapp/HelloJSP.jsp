<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hello JSP!!</h1>
<%
int sum = 0;
for(int i = 0 ; i < 10 ; i++){
	sum += i;
}
%>


<%-- JSP에서 메소드 불러오는방법 -->
    1. <%!  %> 사용 --%>

<%!
	public static String print(){
		return "하잉";
	}
%>
<%=print() %>



<%
Date now = new Date();
%>


<%=now %>
<br>
<br>
<%=sum %>
<br><br>



</body>
</html>