<%@page import="dao.ManagerDao"%>
<%@page import="dto.Manager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	int requestNum = Integer.parseInt(request.getParameter("num"));

	ManagerDao managerDao = ManagerDao.getInstance();
	Manager manager = managerDao.selectManager(requestNum, false);
	managerDao.delete(requestNum);
		
%>
		<script>
		 	alert('삭제가 완료되었습니다.');
			window.close();
			opener.parent.location="admin.checkSwing";
		</script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>