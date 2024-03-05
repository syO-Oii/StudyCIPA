<%@page import="dto.Manager"%>
<%@page import="dto.Board"%>
<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.sql.*" %>
<%
 Manager manager = (Manager) session.getAttribute("manager");
%>
<%
    // 글 번호 값 얻기, 주어지지 않았으면 0으로 설정
    String tmp = request.getParameter("num");
    int num = (tmp != null && tmp.length() > 0) ? Integer.parseInt(tmp)
                                                : 0;

    // 새 글쓰기 모드를 가정하고 변수 초기값 설정
    String writer  = "";
    String title   = "";
    String content = "";
    String action  = "insert.jsp";

    // 글 번호가 주어졌으면, 글 수정 모드
    if (num > 0) {
    	BoardDao dao = BoardDao.getInstance();
    	Board board = dao.selectOne(num, false);
    	
    	// 글 데이터를 변수에 저장
        writer  = board.getWriter();
        title   = board.getTitle();
        content = board.getContent();

        // 현재 사용자와 글의 작성자를 비교하여 일치할 경우에만 수정 모드로 설정
        if (manager != null && writer.equals(manager.getName())) {
            action  = "update.jsp?num=" + num;
        } else {
%>
        <script>
        	alert('작성자만 글을 수정할 수 있습니다.');
        	history.back(); // 이전 페이지로 돌아가기
    	</script>
<%
            return; // 폼 렌더링을 방지하기 위해 더 이상의 처리를 중단합니다.
        }

    }
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <style>
        table { width:680px; text-align:center; }
        th    { width:100px; background-color:cyan; }
        input[type=text], textarea { width:100%; }
    </style>
</head>
<body>

<form method="post" action="<%=action%>">
    <table>
        <tr>
            <th>제목</th>
            <td><input type="text" name="title"  maxlength="80"
                       value="<%=title%>">
            </td>
        </tr>
        <tr>
            <th>작성자</th>
            <td><input type="text" name="writer" maxlength="20"
                       value="<%=manager.getName() %>" readonly>
            </td>
        </tr>
        <tr>
            <th>내용</th>
            <td><textarea name="content" rows="10"><%=content%></textarea>
            </td>
        </tr>
    </table>

    <br>
    <input type="submit" value="저장">
    <input type="button" value="취소" onclick="history.back()">
</form>

</body>
</html>