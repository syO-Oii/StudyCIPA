<%@page import="dto.Board"%>
<%@page import="dto.Manager"%>
<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.sql.*"%>
<%
 Manager manager = (Manager) session.getAttribute("manager");
%>
<%
// 지정된 글 번호 얻기
int num = Integer.parseInt(request.getParameter("num"));

String managerId = (String) session.getAttribute("managerID");
BoardDao dao = BoardDao.getInstance();
Board board = dao.selectOne(num, false);
dao.delete(num);
String writer  = board.getWriter();


if (manager != null && writer.equals(manager.getName()) || manager != null && manager.getId().equals("admin")) {
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
}
%>