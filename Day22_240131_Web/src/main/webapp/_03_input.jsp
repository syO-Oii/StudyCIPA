<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>체크박스, 멀티플</title>
</head>
<body>
	<form action = "_03_result.jsp" method = "post">
	<table>
		<tr>
			<td>관심언어</td>
			<td><input type = "checkbox" name = "lang" value = "PHP">PHP
				<input type = "checkbox" name = "lang" value = "JSP">JSP
				<input type = "checkbox" name = "lang" value = "ASP.NET">ASP.NET
		</tr>
		<tr>
			<td>취미</td>
			<td><select name="hobby" size = "4" multiple>
					<option value = "영화">영화</option>
					<option value = "독서">독서</option>
					<option value = "운동">운동</option>
					<option value = "기타">기타</option>
			</select></td>
		</tr>
	</table>
	<input type="submit" value="전송">
</body>
</html>