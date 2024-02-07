<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="index.jsp">처음으로</a>
<form method="post" id="frm">
번호<input type="text" name="num" value="<%=num %>"/><br/>
이름<input type="text" name="name" value="<%=name %>"/><br/>
국어<input type="text" name="kor" value="<%=kor %>"/><br/>
영어<input type="text" name="eng" value="<%=eng %>"/><br/>
수학<input type="text" name="math" value="<%=math %>"/><br/>
</form>

<input type="button" onclick="update()" value="수정">
<button onClick="del()">삭제</button>
<script>
function del(){
	location.href='delete.jsp?num=<%=num%>';
	document.getElementById('frm').action='delete.jsp';
	document.getElementById('frm').submit();
}

function update(){
	document.getElementById('frm').action='update.jsp';
	document.getElementById('frm').submit();	
}

</script>

</body>
</html>