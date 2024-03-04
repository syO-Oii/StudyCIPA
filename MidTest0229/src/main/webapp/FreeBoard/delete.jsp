<%@page import="dto.Board"%>
<%@page import="dto.Member"%>
<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.sql.*"%>
<% Member member = (Member) session.getAttribute("member"); %>
<%
// 지정된 글 번호 얻기
int num = Integer.parseInt(request.getParameter("num"));

String memberId = (String) session.getAttribute("MEMBERID");
BoardDao dao = BoardDao.getInstance();
Board board = dao.selectOne(num, false);
dao.delete(num);
String writer  = board.getWriter();


if (member != null && writer.equals(member.getName()) || member != null && member.getId().equals("admin")) {
    // 현재 로그인한 사용자가 작성자와 일치하면 삭제 수행
    dao.delete(num);
    // 목록보기 화면으로 돌아감
    response.sendRedirect("FreeBoard.checkSwing");
} else {
%>
    <script>
    	alert('작성자만 글을 삭제할 수 있습니다.');
    	history.back(); // 이전 페이지로 돌아가기
	</script>
<%
	
	
	
    // 작성자가 아니면 삭제 불가능 메시지를 출력하고 이전 페이지로 돌아감
    response.sendRedirect("error.jsp"); // 에러 페이지로 리디렉션 또는 적절한 처리
}
%>