<%@page import="dto.Manager"%>
<%@page import="dao.ManagerDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%
	String num = request.getParameter("num");
	String action = "updateAdmin.jsp?num=" + num;  

%>


<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="../css/style.css">
</head>
<body>

	<form action="<%=action %>" method="post">
		<table class="updateAdminTable">
			<tr>
				<th>아이디</th>
				<td><input type="text" id="id1" name="id1" maxlength="20"
					value="${updateManager.id}" readonly></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input type="text" id="name1" name="name1" maxlength="20"
					value="${updateManager.name}"></td>
			</tr>
			<tr>
				<th>보직</th>
				<td><input type="text" id="job1" name="job1" maxlength="20"
					value="${updateManager.job}"></td>
			</tr>
		</table>

		<br> <input type="submit" class="submitAdminBtn" value="수정">
		<input type="button" class="deleteAdminBtn" value="삭제"
			onclick="location.href='deleteAdmin.jsp?num=${updateManager.num}'">

	</form>
</body>
</html>