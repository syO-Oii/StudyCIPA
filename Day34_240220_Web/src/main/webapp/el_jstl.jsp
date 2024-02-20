<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${100+20} <br>
${sum = 0} <br>
${sum = sum + 100} <br>
${name = '홍길동' } <br>
${name == '강감찬' } <br>
${empty sum } <br>
${100+20; 300+1 } <br>
${name = '홍길동' ; ''} <br>	<%-- 세미콜론을 쓰면 계산은 되지만  --%>
${'abcde' }
</body>
</html>