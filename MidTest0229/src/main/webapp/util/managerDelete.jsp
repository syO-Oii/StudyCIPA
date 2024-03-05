<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

Class.forName("oracle.jdbc.OracleDriver");
Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",  "manager", "rlaxogud");

String num = request.getParameter("num");

String sql = "delete from manager where num=?";
PreparedStatement pstmt = conn.prepareStatement(sql);

pstmt.setString(1, num);

int res = pstmt.executeUpdate();
response.sendRedirect("/main.checkSwing");
%>