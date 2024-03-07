<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="dao.ManagerDao"%>
<%@page import="dto.Manager"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>관리자페이지</title>
<link rel="icon" href="/img/logo.jpeg" type="image/x-icon">
<script src="https://kit.fontawesome.com/c47106c6a7.js" crossorigin="anonymous"></script>
<link rel="stylesheet" href="../css/style.css">
</head>
<body>

	<header class="adminHeader">
		<div class="adminInner">
			<h1>관리자 페이지</h1>
			<ul class=adminUtil>
				<li><a href="main.checkSwing">메인으로 돌아가기</a></li>

			</ul>
		</div>
	</header>

	<main class="adminMain">
		<div class="adminMainDiv">
			<table class="adminTable table-bordered table-hover">
				<tr>
					<th class="num">번호</th>
					<th class="name">이름</th>
					<th class="job">보직</th>
					<th class="id">ID</th>
					<th class="update">정보수정</th>
				</tr>
				
				<script>
					function updatePopup(updateNum){
						var url = "updateMgrPopup.checkSwing?num="+updateNum;
						var name = "updatePopup";
						var option = "width = 600, height = 600, top = 100, left = 500, location = no";
						window.open(url, name, option);
					}
				</script>
				
				<%
				// 회원 목록을 가져오는 부분
				List<Manager> managerList = ManagerDao.getInstance().getManagerList();

				// 가져온 게시글 목록을 순회하며 표에 추가하는 부분
				for (Manager manager : managerList) {
				%>
				
				<tr>
					<td><%=manager.getNum()%></td>
					<td><%=manager.getName()%></td>
					<td><%=manager.getJob()%></td>
					<td><%=manager.getId()%></td>
					<td><input type="button" value="정보수정" class="updateBtn" onclick="javascript:updatePopup(<%=manager.getNum()%>)"></td>
				</tr>
				<%
				}
				%>
			</table>
		</div>
	</main>

	<footer>
		<div class="inner">
			<div class="upper">
				<h1>Check Swing</h1>
				<ul>
					<li><a href="#">Policy</a></li>
					<li><a href="#">Terms</a></li>
					<li><a href="#">Family Site</a></li>
					<li><a href="#">Sitemap</a></li>
				</ul>
			</div>

			<div class="lower">
				<address>
					Lorem ipsum dolor sit amet consectetur adipisicing elit. Quas,
					facere.<br> TEL : 031-111-1234 C.P : 010-1234-5678
				</address>
				<p>2024 CheckSwing &copy; copyright all right reserved.</p>
			</div>
		</div>
	</footer>


</body>
</html>