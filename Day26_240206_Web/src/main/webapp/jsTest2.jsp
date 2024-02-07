<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 id = "title">헬로우 JSP</h1>
<h1 class = "title2">굿모닝 JSP</h1>


<%-- onClick 안에 메소드를 삽입할 수 있음 --%>
<button onClick="test()">클릭</button>
<script>
	// 클릭 시 아래 메소드가 동작함
	function test(){
		let str = document.getElementById("title");		// getElementById = copy 개념이 아닌, 요소를 가져옴
		let str2 = document.querySelector("#title");	// id = #으로 불러옴
		let str3 = document.querySelector(".title2");	//	class = .으로 불러옴
		
		console.log("1. 안녕 JSP", '이것도 나오나', str, str2, str3);
		
		str.innerHTML = "테스트";
	}

</script>
</body>
</html>