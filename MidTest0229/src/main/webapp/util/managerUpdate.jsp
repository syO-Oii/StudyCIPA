<%@page import="dto.Manager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
Class.forName("oracle.jdbc.OracleDriver");
Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",  "manager", "rlaxogud");
request.setCharacterEncoding("utf-8");
String id = request.getParameter("idInput");
String password = request.getParameter("passwordInput");
String name = request.getParameter("nameInput");
String sql = "update manager set password=?, name=? where id=?";
PreparedStatement pstmt = conn.prepareStatement(sql);
pstmt.setString(1, password);
pstmt.setString(2, name);
pstmt.setString(3, id);

int res = pstmt.executeUpdate();

if (res > 0) {
	Manager updatedManager = new Manager(id, password, name); // 업데이트된 정보로 Manager 객체 생성
    session = request.getSession();
    session.setAttribute("manager", updatedManager); // 세션에 업데이트된 Manager 객체 저장
    
    String changeSuccessScript = "<script>alert('정보 수정이 완료되었습니다.');"
            + "window.location.href='changeInfo.checkSwing';</script>";
	response.setContentType("text/html;charset=UTF-8");
	response.getWriter().println(changeSuccessScript);
} else {
	String changefalseScript = "<script>alert('정보 수정에 실패했습니다.');"
            + "window.location.href='changeInfo.checkSwing';</script>";
	response.setContentType("text/html;charset=UTF-8");
	response.getWriter().println(changefalseScript);
}
%>