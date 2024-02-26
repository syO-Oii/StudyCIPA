<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Check Swing 로그인</title>
    <link rel="icon" href="/img/logo.jpeg" type="image/x-icon">
    <script src="https://kit.fontawesome.com/c47106c6a7.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="../css/style.css">
    <script src="js/ie.js"></script>
</head>
<body>
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
                <li><a href="../FreeBoard/FreeBoardForm.jsp">자유게시판</a></li>  <!-- 게시판 --> 
            </ul>

            <ul class="util">
                <li><a href="#">Contact</a></li>
                <li><a href="#">Help</a></li>
                <li><a href="LoginForm.jsp">Login</a></li>              <!-- 로그인 -->
                <li><a href="JoinForm.jsp">Join</a></li>                <!-- 회원가입-->
            </ul>
        </div>
    </header>

	<!-- 테스트 페이지 -->
	<div class = "main">
		<span>
			<h1>로그인 페이지</h1>
			<form action="login.do" method="post">
			아이디 <input type="text" name="id" size="10"> <br/>
			암호(이메일) <input type="text" name="email">	<br/>
			<input type="submit" value="로그인">
			</form>
		</span>		
	</div>
	
	<!-- 테스트 페이지 -->
	
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
    
</body>
</html>