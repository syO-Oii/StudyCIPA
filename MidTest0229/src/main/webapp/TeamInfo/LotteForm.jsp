<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>롯데자이언츠 팀정보 조회</title>
    <link rel="icon" href="/img/logo.jpeg" type="image/x-icon">
    <script src="https://kit.fontawesome.com/c47106c6a7.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="../css/style.css">
    <script src="js/ie.js"></script>
</head>
<body>
<header class = "top-bar">
	<div class="inner">
    	<h1><a href="main.checkSwing">Check Swing</a></h1>
        <ul id="gnb">
            <li>
                <a href="#">선수정보 조회</a>
                <ul>
                    <li><a href="PitcherInfo.checkSwing">투수 정보 조회</a></li>
                    <li><a href="HitterInfo.checkSwing">타자 정보 조회</a></li>
                </ul>
            </li>
            
            <li>
                <a href="#">팀 정보 조회</a>
                <ul>
                    <li><a href="Lotte.checkSwing">롯데 자이언츠</a></li>
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
            
            <li><a href="FreeBoard.checkSwing">자유게시판</a></li>  <!-- 게시판 --> 
        </ul>

        <ul class="util">
            <li><a href="#">Contact</a></li>
            <li><a href="#">Help</a></li>
            <% if (session.getAttribute("manager") == null) { %>
        		<!-- 로그인 상태가 아닌 경우 -->
        		<li><a href="login.checkSwing">Login</a></li>
    		<% } else { %>
        		<!-- 로그인 상태인 경우 -->
        		<li><a href="logout.checkSwing">Logout</a></li>
    		<% } %>
    		
    		<% if (session.getAttribute("manager") == null) { %>
        		<!-- Join : 로그인 상태가 아닌 경우 -->
        		<li><a href="join.checkSwing">Join</a></li>
    		<% } else { %>
        		<!-- 정보수정 : 로그인 상태인 경우 -->
        		<li><a href="changeInfo.checkSwing">정보수정</a></li>
    		<% } %>
    		   		
        </ul>
    </div>
</header>

	<h1>롯데자이언츠 팀 정보</h1>
	<br/>
	<h3>승패 등 정보 넣을 예정</h3>
	
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
                    2024 CheckSwing &copy; copyright all right reserved.
                </p>
            </div>
        </div>
    </footer>
    
    롯데자이언츠
</body>
</html>