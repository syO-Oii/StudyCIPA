<%@page import="dao.BoardDao"%>
<%@page import="dto.Board"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>자유게시판</title>
    <link rel="icon" href="/img/logo.jpeg" type="image/x-icon">
    <script src="https://kit.fontawesome.com/c47106c6a7.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="../css/style.css">
    <script src="js/ie.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>
<body>
<!--  <form action="FreeBoard.do" method = "post"> -->

<header class = "top-bar">
        <div class="inner">
            <h1><a href="../index.html">Check Swing</a></h1>

            <ul id="gnb">
                <li>
                    <a href="#">선수정보 조회</a>
                    <ul>
                        <li><a href="../PlayerInfo/PitcherInfoForm.jsp">투수 정보 조회</a></li>
                        <li><a href="../PlayerInfo/HitterInfoForm.jsp">타자 정보 조회</a></li>
                    </ul>
                </li>
                <li>
                    <a href="#">팀 정보 조회</a>
                    <ul>
                        <li><a href="../TeamInfo/LotteForm.jsp">롯데 자이언츠</a></li>
                        <li><a href="#">LG 트윈스</a></li>
                        <li><a href="#">KT 위즈</a></li>
                        <li><a href="#">NC 다이노스</a></li>
                        <li><a href="#">기아 타이거즈</a></li>
                        <li><a href="#">두산 베어스</a></li>
                        <li><a href="#">삼성 라이온즈</a></li>
                        <li><a href="#">한화 이글스</a></li>
                        <li><a href="#">키움 히어로즈</a></li>
                    </ul>
                </li>
                <li>
                    <a href="#">구단 YOUTUBE</a>
                    <ul>
                        <li><a href="https://www.youtube.com/@giantstv" 
                                target= '_blank'>롯데 자이언츠</a></li>
                        <li><a href="https://www.youtube.com/@LGTwinsTV"
                                target = '_blank'>LG 트윈스</a></li>
                        <li><a href="https://www.youtube.com/@ktwiztv"
                                target = '_blank'>KT 위즈</a></li>
                        <li><a href="https://www.youtube.com/@ncdinos" 
                                target = '_blank'>NC 다이노스</a></li>
                        <li><a href="https://www.youtube.com/@kiatigerstv" 
                                target = '_blank'>기아 타이거즈</a></li>
                        <li><a href="https://www.youtube.com/@bearstv1982" 
                                target = '_blank'>두산 베어스</a></li>
                        <li><a href="https://www.youtube.com/@lionstv1982" 
                                target = '_blank'>삼성 라이온즈</a></li>
                        <li><a href="https://www.youtube.com/@HanwhaEagles_official" 
                                target = '_blank'>한화 이글스</a></li>
                        <li><a href="https://www.youtube.com/@heroesbaseballclub" 
                                target = '_blank'>키움 히어로즈</a></li>
                    </ul>
                </li>
                <li><a href="FreeBoardForm.do">자유게시판</a></li>  <!-- 게시판 --> 
            </ul>

            <ul class="util">
                <li><a href="#">Contact</a></li>
                <li><a href="#">Help</a></li>
                <li><a href="../util/LoginForm.jsp">Login</a></li>              <!-- 로그인 -->
                <li><a href="../util/JoinForm.jsp">Join</a></li>                <!-- 회원가입-->
            </ul>
        </div>
    </header>

	<div class="container" style="padding-top: 50px;">
		<table class="table table-bordered table-hover">
    		<tr>
        		<th class="num"    >번호    </th>
        		<th class="title"  >제목    </th>
        		<th class="writer" >작성자  </th>
        		<th class="regtime">작성일시</th>
        		<th                >조회수  </th>
    		</tr>
			<% 
                    // 게시글 목록을 가져오는 부분
                    List<Board> boardList = BoardDao.getInstance().getRecentPosts(10); // 적절한 DAO 메서드를 호출하여 게시글 목록을 가져오세요.

                    // 가져온 게시글 목록을 순회하며 표에 추가하는 부분
                    for (Board board : boardList) { 
                %>
                       
        	<tr>
            	<td><%= board.getNum() %></td>
        		<td style="text-align:left;">
            		<a href="view.do?num=<%= board.getNum() %>">
                		<%= board.getTitle() %>
            		</a>
        		</td>
        		<td><%= board.getWriter() %></td>
        		<td><%= board.getRegtime() %></td>
        		<td><%= board.getHits() %></td>
        	</tr>
			<% } %>
		</table>
		<br>
		<input type="button" value="글쓰기" class="btn btn-primary" onclick="location.href='write.jsp'">
	</div>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
		



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
                    Lorem ipsum dolor sit amet consectetur adipisicing elit. Quas, facere.<br>
                    TEL : 031-111-1234 C.P : 010-1234-5678
                </address>
                <p>
                    2020 CheckSwing &copy; copyright all right reserved.
                </p>
            </div>
        </div>
    </footer>
    
    <!--  </form> -->
</body>
</html>