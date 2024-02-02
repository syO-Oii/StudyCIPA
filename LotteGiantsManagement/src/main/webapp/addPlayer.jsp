<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>롯데자이언츠 선수 정보 추가</title>
</head>
<body>
<h1>롯데자이언츠 관리자 페이지</h1>
<a href = "Main.jsp">목록으로 돌아가기</a>
	<table>
		<tr><td>이름  <input type="text" name = "name" /><br/> </td></tr>
		<tr><td>투/타
		<input type="radio" name = "pos" id = "Hitter" value = "H" /> 타자
		<input type="radio" name = "pos" id = "Pitcher" value = "P" /> 투수
		</td></tr>
		<tr><td>포지션<select id = "job" name = "dpos" size = "1">
			<option value = "1B">1루수</option>
			<option value = "2B">2루수</option>
			<option value = "3B">3루수</option>
			<option value = "SS">유격수</option>
			<option value = "RF">좌익수</option>
			<option value = "CF">중견수</option>
			<option value = "LF">우익수</option>
			<option value = "C">포수</option>
			<option value = "DH">지명타자</option>
			<option value = "SP">선발투수</option>
			<option value = "RP">중계투수</option>
			<option value = "CP">마무리투수</option>
		</select></td> </tr>
		<tr><td>등번호<input type="text" name = "bnum" /></td></tr>
		<tr><td>연봉<input type="text" name = "sal" /></td></tr>
		<tr><td><input type = "submit" value = "확인" />
		<input type = "reset" value = "초기화" /><td></tr>		
	</table>
</body>
</html>



