<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
String id = request.getParameter("id");
String email = request.getParameter("email");
String name = request.getParameter("name");
Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1", "root", "mysql");

//Class.forName("oracle.jdbc.driver.OracleDriver");
//Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");


String sql = "insert into member(id,email,name) values(?,?,?)";
PreparedStatement pstmt = conn.prepareStatement(sql);
pstmt.setString(1, id);
pstmt.setString(2, email);
pstmt.setString(3, name);

int res = pstmt.executeUpdate();
response.sendRedirect("main.checkSwing");
%>
