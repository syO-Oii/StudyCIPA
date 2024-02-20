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
<c:if test="true">
무조건 실행함<br>
</c:if>
${bbb = 90;'' }
<c:if test="${bbb<100}">
bbb는 100보다 작습니다. <br>
</c:if>

<c:choose>
	<c:when test="${param.num == 1 }">		<%-- 주소창 끝에 ?num=1, 2를 하면 파라메터 값이 넘어감 --%>
		num은 1입니다.<br>
	</c:when>
	<c:when test="${param.num == 2 }">
		num은 2입니다.<br>
	</c:when>
	<c:otherwise>
		num은 다른 값입니다.<br>
	</c:otherwise>
</c:choose>

</body>
</html>