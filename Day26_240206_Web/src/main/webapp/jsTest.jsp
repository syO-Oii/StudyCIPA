<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 id = "title">2. 헬로우 JSP</h1>
<h1 class = "title2">5. 굿모닝 JSP</h1>

<%-- 자바스크립트 실습, 교재 236p~ --%>
 
1. 마우스 오른쪽 + 검사 - Console 창에 메세지 띄우기
	<script>
		/* 3. 콘솔에 태그 요소를 가져오기 */
		let str = document.getElementById("title");		// getElementById = copy 개념이 아닌, 요소를 가져옴
		/* 4. 콘솔에 태그 요소를 가져오기 (최신판) */
		let str2 = document.querySelector("#title");	// id = #으로 불러옴
		let str3 = document.querySelector(".title2");	//	class = .으로 불러옴
		
		console.log("1. 안녕 JSP", '이것도 나오나', str, str2, str3);
		
		str.innerHTML = "테스트";
	</script>
	
	<%-- 문서 객체 모델 DOM 에 대해 알아보기 --%>
	
</body>
</html>