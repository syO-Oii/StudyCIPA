<%@page import="dto.Member"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1", "root", "mysql");
//Class.forName("oracle.jdbc.driver.OracleDriver");
//Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
request.setCharacterEncoding("utf-8");
String id = request.getParameter("idInput");
String email = request.getParameter("emailInput");
String name = request.getParameter("nameInput");
String sql = "update member set email=?, name=? where id=?";
PreparedStatement pstmt = conn.prepareStatement(sql);
pstmt.setString(1, email);
pstmt.setString(2, name);
pstmt.setString(3, id);

int res = pstmt.executeUpdate();

if (res > 0) {
	Member updatedMember = new Member(id, email, name); // 업데이트된 정보로 Member 객체 생성
    session = request.getSession();
    session.setAttribute("member", updatedMember); // 세션에 업데이트된 Member 객체 저장
    
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