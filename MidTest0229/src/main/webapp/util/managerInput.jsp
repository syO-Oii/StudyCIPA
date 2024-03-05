<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
String id = request.getParameter("id");
String password = request.getParameter("password");
String name = request.getParameter("name");
Class.forName("oracle.jdbc.OracleDriver");
Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",  "manager", "rlaxogud");


String sql = "insert into manager(id,password,name, num) values(?,?,?, manager_seq.NEXTVAL)";
PreparedStatement pstmt = conn.prepareStatement(sql);
pstmt.setString(1, id);
pstmt.setString(2, password);
pstmt.setString(3, name);

int res = pstmt.executeUpdate();
response.sendRedirect("main.checkSwing");
%>
