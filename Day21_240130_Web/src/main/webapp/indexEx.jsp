<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>국영수 점수 입력</title>
</head>
<body>
<%-- method를 get에서 post로 바꿔봄 --%>
<%-- post 방식은 처리가 느린 대신 보안 기능이 있음 --%>
<form action="4-2.jsp" method="post">
	국어 : <input type="text" name="kor" /><br/>
	영어 : <input type="text" name="eng" /><br/>
	수학 : <input type="text" name="math" /><br/>
	<input type="submit" value="확인" />
</form>

</body>
</html>