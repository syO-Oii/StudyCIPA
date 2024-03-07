<%@page import="dao.ManagerDao"%>
<%@page import="dto.Manager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	int requestNum = Integer.parseInt(request.getParameter("num"));

	ManagerDao dao = ManagerDao.getInstance();
	Manager manager = dao.selectManager(requestNum, true);
	
	String requestName = request.getParameter("name1");
	String requestJob  = request.getParameter("job1");
	String requestId   = request.getParameter("id1");
	System.out.println("name : " + requestName + " job : " + requestJob);	
	
	if( requestNum  < 0 ||
		requestName == null || requestName.length() == 0 ||
		requestJob  == null || requestJob.length()  == 0 ||
		requestId   == null || requestId.length()   == 0 ) {
%>      
         <script>
             alert('모든 항목이 빈칸 없이 입력되어야 합니다.');
             history.back();
         </script>
<%       
	return;		
	} else {
		// 기존 정보와 비교해서 다르면 manager 객체에 새로운 값을 입력 
		if(manager.getName() == null || !manager.getName().equals(requestName)){ manager.setName(requestName); }
		if(manager.getJob() == null || !manager.getJob().equals(requestJob)){ manager.setJob(requestJob); }
		// managerDao에 정보 업데이트
		dao.update(manager);
%>
		<script>
		 	alert('수정이 완료되었습니다.');
			window.close();
			opener.parent.location="admin.checkSwing";
		</script>
<%		
	
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>